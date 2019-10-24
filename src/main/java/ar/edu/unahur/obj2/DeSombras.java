package ar.edu.unahur.obj2;


public class DeSombras extends Demonio{


    public DeSombras(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    protected boolean otraCondicion(Alma alma) {
        return alma.getValor() <= 50;
    }

    @Override
    protected void casiAtrapa(Alma alma) {
        alma.setValor(alma.getValor() / 2);
    }

}