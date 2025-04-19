import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando novos autores
        Autor autor1 = new Autor(1, "Professor de Matematica");
        Autor autor2 = new Autor(2, "Professor de Português");

        Biblioteca.autores.add(autor1);
        Biblioteca.autores.add(autor2);


        //Criando novos livros
        Biblioteca.adicionarLivro(new Livro(1, "Livro de Matematica", autor1.nome, true));
        Biblioteca.adicionarLivro(new Livro(2, "Livro de Português", autor2.nome, false));

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler do teclado
        int entrada = 0;

        System.out.println("Bem vindo!");
        while (entrada != 4) {
            System.out.print("\nDigite o número desejado: \n1 - Você gostaria de ver os livros disponíveis? \n2 - Você gostaria de ver os autores disponíveis? \n3 - Gostaria de ver os livros que estão emprestados? \n4 - Sair \n");
            entrada = scanner.nextInt();

            switch (entrada) {
                case 1:
                    Biblioteca.listarLivros();
                    break;
                case 2:
                    Biblioteca.listarAutores();
                    break;
                case 3:
                    Biblioteca.livrosEmprestados();
                    break;
                case 4:
                    System.out.println("Saindo \n");
                    break;
                default:
                    System.out.println("Tente novamente \n");
                    break;
            }
        }

   }
}

