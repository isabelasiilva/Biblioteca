public class Livro {
    int id;
    String titulo;
    String autor;
    boolean disponivel;
    String disponivel2;

    public Livro(int id, String titulo, String autor, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void exibirInformacoes() {
        if (disponivel) {
            disponivel2 = "Sim";
        } else {
            disponivel2 = "Não";
        }

        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponivel: " + disponivel2);
    }
}
