
public abstract class Animal {
	private int id;
	private String nome;
	private int idade;
	private String raca;
	private String sexo;
	private boolean foiAdotado;
	private String observacoes;
	
	public Animal() {
		
	}
	
	public Animal(int id, String nome, int idade, String raca, String sexo, boolean foiAdotado, String obersacoes) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.sexo = sexo;
		this.foiAdotado = foiAdotado;
		this.observacoes = observacoes;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isFoiAdotado() {
		return foiAdotado;
	}

	public void setFoiAdotado(boolean foiAdotado) {
		this.foiAdotado = foiAdotado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Override
	public String toString() {
		return "Id = " + id + "\nNome = " + nome + "\nIdade = " + idade + "\nRaca = " + raca + "\nSexo = " + sexo
				+ "\nFoiAdotado = " + foiAdotado + "\nObservacoes = " + observacoes + "\n";
	}
	
	public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Raça: " + raca);
        System.out.println("Sexo: " + sexo);
        System.out.println("Foi adotado? " + (foiAdotado ? "Sim" : "Não"));
        System.out.println("Observações: " + observacoes);
	}
	
	public abstract void cadastrarAnimal();

	public abstract String porEspecie();
}
