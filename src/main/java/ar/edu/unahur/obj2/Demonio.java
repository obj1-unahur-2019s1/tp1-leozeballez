package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private List<Alma> almasAtrapadas;
    private int nivelDeMaldad;

    public Demonio(int nivelDeMaldad) {
        almasAtrapadas = new ArrayList<>();
        this.nivelDeMaldad = nivelDeMaldad;
    }

    public void salirDeCaza(Lugar lugar){
        List<Alma> almasAgarradas = new ArrayList<>();
        lugar.getAlmas().forEach(alma -> {

            if (condicionesParaCazar(alma)) {

                almasAgarradas.add(alma);
                nivelDeMaldad += 2;

            } else {

                atormentarAlma(alma);
                nivelDeMaldad++;

            }
        });

        cazoAlmas(almasAgarradas);
        lugar.eliminarAlmas(almasAgarradas);
    }

    //Abstractos, Patron Template method
    protected abstract void casiAtrapa(Alma alma);

    protected abstract boolean otraCondicion(Alma alma);

    //Getter y Setter
    public int getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public List<Alma> getAlmasAtrapadas() { return almasAtrapadas; }

    //Cantidad Almas Atrapadas
    public Integer cantidadAlmasAtrapadas(){ return almasAtrapadas.size(); }

    //Condiciones para cazar
    public boolean condicionesParaCazar(Alma alma){
        return condicionGenerica(alma) && otraCondicion(alma);
    }

    //Condicion para todos los demonios
    public boolean condicionGenerica(Alma alma){
        return getNivelDeMaldad() > alma.getNivelDeBondad();
    }

    //Atormentar almas
    public void atormentarAlma(Alma alma){
        alma.esAtormentada();
        casiAtrapa(alma);
    }

    //Cazar almas
    public void cazoAlmas(List<Alma> almas){
        almasAtrapadas.addAll(almas);
    }}