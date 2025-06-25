import java.util.ArrayList;

public class Adocao {
	private ArrayList<Animal> animal = new ArrayList<>();
	private ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrarAnimal(Animal a) {
		try {
			animal.add(a);
			System.out.println("Cadastrado com sucesso!");
		}
		catch(Error e) {
			System.out.println(e.toString());
		}
	}
	
	public void cadastrarPessoa(Pessoa p) {
		try {
			pessoas.add(p);
			System.out.println("Cadastrado com sucesso!");
		}
		catch(Error e) {
			System.out.println(e.toString());
		}
	}
	
	public void realizarAdocao(int idAnimal, int idPessoa) {
		for(int i = 0; i < animal.size(); i++) {
			if(idAnimal == animal.get(i).getId()) {
				if(animal.get(i).isAdotado()) {
					System.out.println("Animal [ " + animal.get(i).getNome() + " ] já foi adotado!");
				}
				else {
					animal.get(i).setAdotado(true);
					animal.get(i).setAdotadoPor(idPessoa);
					System.out.println("Adotado com sucesso!");
				}
			}
		}
	}
	
	public void listarAnimais() {
		for(int i = 0; i < animal.size(); i++) {
			System.out.println(animal.get(i).exibirInformacoes());
		}
	}
	
	public ArrayList<Animal> buscarPorIdade(int idade) {
		ArrayList<Animal> a = new ArrayList<>();
		for(int i = 0; i < animal.size(); i++) {
			if(animal.get(i).getIdade() == idade) {
				a.add(animal.get(i));
			}
		}
		return a;
	}
	
	public ArrayList<Animal> buscarPorTipo(Class<Animal> tipo) {
	    ArrayList<Animal> a = new ArrayList<>();
	    for (Animal ani : animal) {
	        if (tipo.isInstance(ani)) {
	            a.add(ani);
	        }
	    }
	    return a;
	}
	
	public ArrayList<Animal> buscarPorObservacoes(String palavraChave){
		ArrayList<Animal> a = new ArrayList<>();
		for(Animal ani : animal) {
			if(ani.getObservacoes().contains(palavraChave)) {
				a.add(ani);
			}
		}
		return a;
	}
}
