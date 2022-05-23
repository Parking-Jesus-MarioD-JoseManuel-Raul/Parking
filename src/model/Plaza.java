package model;

public class Plaza {
    private int idPlaza;
    private boolean ocupado;
    private int numeroPlaza;

    public Plaza(int idPlaza, boolean ocupado, int numeroPlaza) {
        this.idPlaza = idPlaza;
        this.ocupado = ocupado;
        this.numeroPlaza = numeroPlaza;
    }

    public Plaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

    public Plaza(int idPlaza, boolean ocupado) {
        this.idPlaza = idPlaza;
        this.ocupado = ocupado;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumeroPlaza() {
        return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) {
        this.numeroPlaza = numeroPlaza;
    }

}
