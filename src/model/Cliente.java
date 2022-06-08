package model;

import java.util.Objects;

public class Cliente {
    Identificador identificador;
    String matricula;
    String payMethod;

    public Cliente(Identificador identificador, String matricula, String payMethod) {
        this.identificador = identificador;
        this.matricula = matricula;
        this.payMethod = payMethod;
    }

    public Identificador getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Identificador identificador) {
        this.identificador = identificador;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    @Override
    public String toString() {
        return "identificador=" + identificador + ", matricula='" + matricula + '\'' + ", payMethod='" + payMethod;
    }

	@Override
	public int hashCode() {
		return Objects.hash(identificador, matricula, payMethod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return identificador == other.identificador && Objects.equals(matricula, other.matricula)
				&& Objects.equals(payMethod, other.payMethod);
	}
    
    
}
