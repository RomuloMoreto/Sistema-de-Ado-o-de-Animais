
public class Pessoa {
 
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String sexo;
    
    public Pessoa() {
    	
    }

    public Pessoa(int id, String nome, String cpf, String telefone, String endereco, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.sexo = sexo;
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

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
	public String toString() {
		return "Id = " + id + "\nNome = " + nome + "\nCpf = " + cpf + "\nTelefone = " + telefone + "\nEndereco = "
				+ endereco + "\nSexo = " + sexo + "\n";
	}

	public void cadastrarPessoa() {
        System.out.println("Pessoa cadastrada com sucesso:");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Sexo: " + sexo);
    }
}
