import java.util.ArrayList;
import java.util.List;

public class SistemaAdocao {
    private List<Animal> listaAnimais;
    private List<Pessoa> listaPessoas;
    private List<Adocao> listaAdocoes;

    public SistemaAdocao() {
        this.listaAnimais = new ArrayList<>();
        this.listaPessoas = new ArrayList<>();
        this.listaAdocoes = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        listaAnimais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void registrarAdocao(int idPessoa, int idAnimal, String dataAdocao) {
        Pessoa pessoa = buscarPessoaPorId(idPessoa);
        Animal animal = buscarAnimalPorId(idAnimal);

        if (pessoa == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }

        if (animal == null) {
            System.out.println("Animal não encontrado.");
            return;
        }

        if (animal.isFoiAdotado()) {
            System.out.println("Este animal já foi adotado.");
            return;
        }

        animal.setFoiAdotado(true);
        Adocao adocao = new Adocao(idPessoa, idAnimal, dataAdocao);
        listaAdocoes.add(adocao);
        System.out.println("Adoção registrada com sucesso!");
    }

    public void exibirInformacoes() {
        System.out.println("\nPessoas Cadastradas");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }

        System.out.println("\nAnimais Cadastrados");
        for (Animal animal : listaAnimais) {
            animal.exibirInformacoes();
        }
    }

    public void porEspecie(String tipo) {
        System.out.println("\nAnimais da espécie: " + tipo);
        for (Animal animal : listaAnimais) {
            if (animal.porEspecie().equalsIgnoreCase(tipo)) {
                animal.exibirInformacoes();
            }
        }
    }

    public void exibirRegistro() {
        System.out.println("\nRegistros de Adoção");
        for (Adocao adocao : listaAdocoes) {
            adocao.exibirRegistro();
        }
    }

    public void apagarRegistro(int idAnimal) {
        Adocao adocaoParaRemover = null;

        for (Adocao adocao : listaAdocoes) {
            if (adocao.getIdAnimalAdotado() == idAnimal) {
                adocaoParaRemover = adocao;
                break;
            }
        }

        if (adocaoParaRemover != null) {
            Animal animal = buscarAnimalPorId(idAnimal);
            if (animal != null) {
                animal.setFoiAdotado(false);
            }
            listaAdocoes.remove(adocaoParaRemover);
            System.out.println("Registro de adoção apagado.");
        } else {
            System.out.println("Registro não encontrado.");
        }
    }

    private Pessoa buscarPessoaPorId(int id) {
        for (Pessoa p : listaPessoas) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private Animal buscarAnimalPorId(int id) {
        for (Animal a : listaAnimais) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}
