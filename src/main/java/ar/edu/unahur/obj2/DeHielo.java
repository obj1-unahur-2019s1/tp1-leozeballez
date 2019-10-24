package ar.edu.unahur.obj2;

public class DeHielo extends Demonio {

    public DeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    protected boolean otraCondicion(Alma alma) {
        return alma.isEsFriolenta();
    }

    @Override
    protected void casiAtrapa(Alma alma) {
        alma.setEsFriolenta(true);
    }
}