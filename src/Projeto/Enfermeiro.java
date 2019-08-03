package Projeto;

public class Enfermeiro extends Pessoa {
	
		private String cargaHoraria;
	    private double valorHora;
	    
	    	
	public Enfermeiro() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Enfermeiro(String nome, String idade, String endereco, String telefone, String cpf) {
			super(nome, idade, endereco, telefone, cpf);
			// TODO Auto-generated constructor stub
		}
	public String getCargaHoraria() {
	return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}

}
