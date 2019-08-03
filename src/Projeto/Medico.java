package Projeto;

public class Medico extends Pessoa {
	
	private String especialidade;
	private double salario;
	
	
	public Medico() {
		super();	
	}
	
	
	public Medico(String nome, String idade, String endereco, String telefone, String cpf) {
		super(nome, idade, endereco, telefone, cpf);
		// TODO Auto-generated constructor stub
	}


	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
		
}
