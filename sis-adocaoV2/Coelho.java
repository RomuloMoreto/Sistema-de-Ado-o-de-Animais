
public class Coelho extends Animal {
	private String corPelagem;
	
	public Coelho(int id, String nome, int idade, String raca, String sexo, String observacoes, String corPelagem) {
		super(id, nome, idade, raca, sexo, observacoes);
		this.corPelagem = corPelagem;
	}
	
	public String exibirInformacoes() {
		return super.exibirInformacoes() + "Cor da Pelagem: " + corPelagem;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}
}
