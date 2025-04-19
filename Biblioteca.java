import java.util.ArrayList;

public class Biblioteca {
    static ArrayList<Livro> livros = new ArrayList<>();
    static ArrayList<Autor> autores = new ArrayList<>();
    static ArrayList<String> listaEmprestados = new ArrayList<>();

    // Método para adicionar um novo livro à lista
    public static void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    // Método para mostrar todos os livros cadastrados na lista
    public static void listarLivros() {

        // Para cada livro na lista, imprime o título e o autor
        for (Livro livro : livros) {
            if (livro.disponivel) {
                System.out.println("Esses livros estão disponíveis: \n- " + livro.titulo + " (Autor: " + livro.autor + ")");
            }
        }
    }


    // Método para mostrar todos os autores cadastrados na lista
    public static void listarAutores() {
        System.out.println("\n Lista de Autores na Biblioteca:");
        for (Autor autor : autores) {
            System.out.println("- " + autor.nome);
        }
    }

    // Método para listar os livros emprestados
    public static void livrosEmprestados() {
        for (Livro livro : livros) {
            if (!livro.disponivel) {
                System.out.println("Esses livros estão indisponíveis: \n- " + livro.titulo + " (Autor: " + livro.autor + ")");
            }
        }
    }

}
