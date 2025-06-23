
public class Passaro extends Animal{
	private boolean sabeCantar;
	private String tipoBico;
	
	public Passaro() {
		
	}
	
	public Passaro(int id, String nome, int idade, String raca, String sexo, boolean foiAdotado, String observacoes, boolean sabeCantar, String tipoBico) {
		super(id, nome, idade, raca, sexo, foiAdotado, observacoes);
		this.sabeCantar = sabeCantar;
		this.tipoBico = tipoBico;
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

	@Override
	public String toString() {
		return super.toString() + "SabeCantar = " + sabeCantar + "\nTipoBico = " + tipoBico + "\n";
	}
	
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Sabe cantar? " + (sabeCantar ? "Sim" : "Não"));
        System.out.println("Tipo de Bico: " + tipoBico);
    }

    @Override
    public void cadastrarAnimal() {
        System.out.println("Passaro cadastrada com sucesso.");
    }

    @Override
    public String porEspecie() {
        return "Passaro";
    }
	
    public void excluir() {
        System.out.println("Passaro removido com sucesso!");
    }
}
