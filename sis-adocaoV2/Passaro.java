
public class Passaro extends Animal {
	private boolean sabeCantar;
	private String tipoBico;
	
	public Passaro(int id, String nome, int idade, String raca, String sexo, String observacoes, boolean sabeCantar, String tipoBico) {
		super(id, nome, idade, raca, sexo, observacoes);
		this.sabeCantar= sabeCantar;
		this.tipoBico = tipoBico;
	}
	
	public String exibirInformacoes() {
		return super.exibirInformacoes() + "Sabe cantar: " + sabeCantar + "\nTipo do Bico: " + tipoBico;
	}

	public boolean isSabeCantar() {
		return sabeCantar;
	}

	public void setSabeCantar(boolean sabeCantar) {
		this.sabeCantar = sabeCantar;
	}

	public String getTipoBico() {
		return tipoBico;
	}

	public void setTipoBico(String tipoBico) {
		this.tipoBico = tipoBico;
	}
	
}
