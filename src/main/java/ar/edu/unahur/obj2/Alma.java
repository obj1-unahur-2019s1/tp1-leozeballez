package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class Alma {

    private int nivelDeBondad= 0;
    private int valor = 0;
    private boolean esFriolenta = false;
    private boolean estaAtormenada = false;

    //Getter y Setter
    public void setNivelDeBondad(int nivelDeBondad) {
        this.nivelDeBondad = nivelDeBondad;
    }

    public void setEstaAtormenada(boolean estaAtormenada) {
        this.estaAtormenada = estaAtormenada;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsFriolenta(boolean esFriolenta) {
        this.esFriolenta = esFriolenta;
    }

    public int getNivelDeBondad() {
        return nivelDeBondad;
    }

    public Integer getValor() {
        return valor;
    }

    public boolean isEsFriolenta() {
        return esFriolenta;
    }

    public boolean isEstaAtormenada() {
        return estaAtormenada;
    }

    //Accion de atormentar
    public void esAtormentada() {
        estaAtormenada = true;
        nivelDeBondad -= 5;
        nivelDeBondad = (new BigDecimal(nivelDeBondad).max(BigDecimal.ZERO)).intValue();
    }



}