
public abstract class Animal {
	private int id;
	private int adotadoPor;
	private boolean adotado = false;
	private String nome;
	private int idade;
	private String raca;
	private String sexo;
	private String observacoes;
	
	public Animal(int id, String nome, int idade, String raca, String sexo, String observacoes) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.sexo = sexo;
		this.observacoes = observacoes;
	}
	
	public int getAdotadoPor() {
		return adotadoPor;
	}

	public void setAdotadoPor(int adotadoPor) {
		this.adotadoPor = adotadoPor;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAdotado() {
		return adotado;
	}

	public void setAdotado(boolean adotado) {
		this.adotado = adotado;
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
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	public String exibirInformacoes() {
		return "Nome: " + nome + "\nIdade: " + idade + "\nRaca: " + raca + "\nSexo: " + sexo + "\nObservações: " + observacoes + "\n";
	}  

}
