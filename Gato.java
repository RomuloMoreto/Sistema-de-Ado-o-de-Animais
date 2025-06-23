
public class Gato extends Animal{
	public String tipoPelagem;
	
	public Gato() {
		
	}
	
	public Gato(int id, String nome, int idade, String raca, String sexo, boolean foiAdotado, String observacoes, String tipoPelagem) {
		super(id, nome, idade, raca, sexo, foiAdotado, observacoes);
		this.tipoPelagem = tipoPelagem;
	}

	public String getTipoPelagem() {
		return tipoPelagem;
	}

	public void setTipoPelagem(String tipoPelagem) {
		this.tipoPelagem = tipoPelagem;
	}

	@Override
	public String toString() {
		return super.toString() + "TipoPelagem = " + tipoPelagem + "\n";
	}

	@Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Pelagem: " + tipoPelagem);
    }

    @Override
    public void cadastrarAnimal() {
        System.out.println("Gato cadastrado com sucesso!");
    }

    @Override
    public String porEspecie() {
        return "Gato";
    }
    
    public void excluir() {
        System.out.println("Gato removido com sucesso!");
    }
}
