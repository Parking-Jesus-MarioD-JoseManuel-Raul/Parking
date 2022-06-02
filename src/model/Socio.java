package model;

public class Socio extends Cliente {
    private Plaza plazaSocio;

    public Socio(Identificador identificador, String matricula, String payMethod, Plaza plazaSocio) {
        super(identificador, matricula, payMethod);
        this.plazaSocio = plazaSocio;
    }

    public Plaza getPlazaSocio() {
        return plazaSocio;
    }

    @Override
    public Identificador getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public String getPayMethod() {
        return super.getPayMethod();
    }

    @Override
    public void setPayMethod(String payMethod) {
        super.setPayMethod(payMethod);
    }

    public void setOcupado() {
        plazaSocio.setOcupado(true);
    }

    public int getNumeroPlaza() {
        return plazaSocio.getNumeroPlaza();
    }

    public void setNumeroPlaza(int numeroPlaza) {
        plazaSocio.setNumeroPlaza(numeroPlaza);
    }
}
