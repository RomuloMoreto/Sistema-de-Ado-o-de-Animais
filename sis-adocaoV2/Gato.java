
public class Gato extends Animal {
	private String tipoPelagem;
	
	public Gato(int id, String nome, int idade, String raca, String sexo, String observacoes, String tipoPelagem) {
		super(id, nome, idade, raca, sexo, observacoes);
		this.tipoPelagem = tipoPelagem;
	}
	
	public String exibirInformacoes() {
		return super.exibirInformacoes() + "Tipo da Pelagem: " + tipoPelagem;
	}

	public String getTipoPelagem() {
		return tipoPelagem;
	}

	public void setTipoPelagem(String tipoPelagem) {
		this.tipoPelagem = tipoPelagem;
	}
}
