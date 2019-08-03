package Projeto;

public class Administrativo extends Pessoa {
	
	private String cargo;
	private double fixo;
	
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrativo(String nome, String idade, String endereco, String telefone, String cpf) {
		super(nome, idade, endereco, telefone, cpf);
		// TODO Auto-generated constructor stub
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getFixo() {
		return fixo;
	}
	public void setFixo(double fixo) {
		this.fixo = fixo;
	}
	
	

}
