package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    private String nombre;
    private List<Alma> almas;

    public Lugar(String nombre) {
        this.nombre = nombre;
        almas = new ArrayList<>();
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public List<Alma> getAlmas() {
        return almas;
    }

    public int cantidadAlmasEnMi(){ return almas.size();}

    //Agregar o eliminar almas

    public void eliminarAlmas(List<Alma> almas2){ getAlmas().removeAll(almas2); }

    public void agregarAlma(Alma alma){ almas.add(alma); }
}