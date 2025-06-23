import java.util.Scanner;

public class SistemaAdocaoMain {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		SistemaAdocao sistema = new SistemaAdocao();
	    int opcao = -1;
	    
	    while(opcao != 0) {
	    	System.out.println("\nMENU SISTEMA DE ADOÇÃO");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Animal");
            System.out.println("3 - Registrar Adoção");
            System.out.println("4 - Exibir Informações");
            System.out.println("5 - Filtrar Animais por Espécie");
            System.out.println("6 - Exibir Registros de Adoção");
            System.out.println("7 - Apagar Registro de Adoção");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = in.nextInt();
            in.nextLine();
            
            switch (opcao) {
            case 1:
                System.out.print("ID da pessoa: ");
                int idPessoa = in.nextInt();
                in.nextLine();
                System.out.print("Nome: ");
                String nome = in.nextLine();
                System.out.print("CPF: ");
                String cpf = in.nextLine();
                System.out.print("Telefone: ");
                String telefone = in.nextLine();
                System.out.print("Endereço: ");
                String endereco = in.nextLine();
                System.out.print("Sexo (M/F): ");
                String sexo = in.nextLine();

                Pessoa pessoa = new Pessoa(idPessoa, nome, cpf, telefone, endereco, sexo);
                sistema.cadastrarPessoa(pessoa);
                break;
                
            case 2:
                System.out.print("ID do animal: ");
                int idAnimal = in.nextInt();
                in.nextLine();
                System.out.print("Nome: ");
                String nomeAnimal = in.nextLine();
                System.out.print("Idade: ");
                int idade = in.nextInt();
                in.nextLine();
                System.out.print("Raça: ");
                String raca = in.nextLine();
                System.out.print("Sexo (M/F): ");
                String sexoAnimal = in.nextLine();
                System.out.print("Observações: ");
                String observacoes = in.nextLine();

                System.out.print("Tipo do animal (Cachorro, Gato, Coelho, Passaro): ");
                String tipo = in.nextLine().toLowerCase();

                Animal animal = null;  
            
                switch (tipo) {
                case "cachorro":
                    System.out.print("Está vacinado? (true/false): ");
                    boolean vacinado = in.nextBoolean();
                    in.nextLine();
                    animal = new Cachorro(idAnimal, nomeAnimal, idade, raca, sexoAnimal, false, observacoes, vacinado);
                    break;
                case "gato":
                    System.out.print("Tipo de pelagem: ");
                    String pelagem = in.nextLine();
                    animal = new Gato(idAnimal, nomeAnimal, idade, raca, sexoAnimal, false, observacoes, pelagem);
                    break;
                case "coelho":
                    System.out.print("Cor da pelagem: ");
                    String cor = in.nextLine();
                    animal = new Coelho(idAnimal, nomeAnimal, idade, raca, sexoAnimal, false, observacoes, cor);
                    break;
                case "ave":
                    System.out.print("Sabe cantar? (true/false): ");
                    boolean canta = in.nextBoolean();
                    in.nextLine();
                    System.out.print("Tipo de bico: ");
                    String tipoBico = in.nextLine();
                    animal = new Passaro(idAnimal, nomeAnimal, idade, raca, sexoAnimal, false, observacoes, canta, tipoBico);
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    continue;
                }

                sistema.cadastrarAnimal(animal);
                break;
            case 3:
                System.out.print("ID da pessoa adotante: ");
                int idAdotante = in.nextInt();
                System.out.print("ID do animal a ser adotado: ");
                int idAnimalAdotado = in.nextInt();
                in.nextLine();
                System.out.print("Data da adoção (ex: 2025-06-23): ");
                String data = in.nextLine();
                sistema.registrarAdocao(idAdotante, idAnimalAdotado, data);
                break;

            case 4:
                sistema.exibirInformacoes();
                break;

            case 5:
                System.out.print("Digite a espécie (Cachorro, Gato, Coelho, Passaro): ");
                String especie = in.nextLine();
                sistema.porEspecie(especie);
                break;

            case 6:
                sistema.exibirRegistro();
                break;

            case 7:
                System.out.print("Informe o ID do animal da adoção a ser apagada: ");
                int idAdoApagar = in.nextInt();
                sistema.apagarRegistro(idAdoApagar);
                break;

            case 0:
                System.out.println("Encerrando o sistema...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");

            }
	    }
	    in.close();
	}
}