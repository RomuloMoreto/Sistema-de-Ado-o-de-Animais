
public class Coelho extends Animal{
	private String corPelagem;
	
	public Coelho() {
		
	}
	
	public Coelho(int id, String nome, int idade, String raca, String sexo, boolean foiAdotado, String observacoes, String corPelagem) {
		super(id, nome, idade, raca, sexo, foiAdotado, observacoes);
		this.corPelagem = corPelagem;
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		this.corPelagem = corPelagem;
	}

	@Override
	public String toString() {
		return super.toString() + "CorPelagem = " + corPelagem + "\n";
	}

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Cor da Pelagem: " + corPelagem);
    }

    @Override
    public void cadastrarAnimal() {
        System.out.println("Coelho cadastrado com sucesso!");
    }

    @Override
    public String porEspecie() {
        return "Coelho";
    }
    
    public void excluir() {
        System.out.println("Coelho removido com sucesso!");
    }
}
