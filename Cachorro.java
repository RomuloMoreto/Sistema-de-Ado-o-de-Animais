
public class Cachorro extends Animal{
	private boolean vacinado;
	
	public Cachorro() {
		
	}
	
	public Cachorro(int id, String nome, int idade, String raca, String sexo, boolean foiAdotado, String observacoes, boolean vacinado) {
        super(id, nome, idade, raca, sexo, foiAdotado, observacoes);
        this.vacinado = vacinado;
    }

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	

	@Override
	public String toString() {
		return super.toString() + "Vacinado = " + vacinado + "\n";
	}

	@Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Vacinado? " + (vacinado ? "Sim" : "Não"));
    }

    @Override
    public void cadastrarAnimal() {
        System.out.println("Cachorro cadastrado com sucesso!");
    }

    @Override
    public String porEspecie() {
        return "Cachorro";
    }

    public void excluir() {
        System.out.println("Cachorro removido com sucesso!");
    }
}
