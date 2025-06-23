
public class Adocao {
	private int idPessoaAdotante;
	private int idAnimalAdotado;
	private String dataAdocao;
	
	public Adocao() {
		
	}
	
	public Adocao(int idPessaoAdotante, int idAnimalAdotado, String dataAdocao) {
		this.idPessoaAdotante = idPessoaAdotante;
		this.idAnimalAdotado = idAnimalAdotado;
		this.dataAdocao = dataAdocao;
	}

	public int getIdPessoaAdotante() {
		return idPessoaAdotante;
	}

	public void setIdPessoaAdotante(int idPessoaAdotante) {
		this.idPessoaAdotante = idPessoaAdotante;
	}

	public int getIdAnimalAdotado() {
		return idAnimalAdotado;
	}

	public void setIdAnimalAdotado(int idAnimalAdotado) {
		this.idAnimalAdotado = idAnimalAdotado;
	}

	public String getDataAdocao() {
		return dataAdocao;
	}

	public void setDataAdocao(String dataAdocao) {
		this.dataAdocao = dataAdocao;
	}

	@Override
	public String toString() {
		return "IdPessoaAdotante = " + idPessoaAdotante + "\nIdAnimalAdotado = " + idAnimalAdotado + "\nDataAdocao = "
				+ dataAdocao + "\n";
	}
	
    public void exibirRegistro() {
        System.out.println("Registro de Adoção");
        System.out.println("ID Pessoa Adotante: " + idPessoaAdotante);
        System.out.println("ID Animal Adotado: " + idAnimalAdotado);
        System.out.println("Data da Adoção: " + dataAdocao);
    }

    public void apagarRegistro() {
        this.idPessoaAdotante = 0;
        this.idAnimalAdotado = 0;
        this.dataAdocao = null;
        System.out.println("Registro de adoção apagado.");
    }
}
