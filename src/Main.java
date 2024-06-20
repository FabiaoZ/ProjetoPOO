public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Pública");
        Livro livro1 = new Livro("A Guerra dos Tronos : As Crônicas de Gelo e Fogo", "George R. R. Martin", 1996);
        EBook ebook1 = new EBook("A Guerra dos Tronos : A Dança dos Dragões", "George R. R. Martin", 2011, "EPUB");

        RepositorioBiblioteca repository = new RepositorioBiblioteca(biblioteca);
        repository.adicionarLivro(livro1);
        repository.adicionarLivro(ebook1);

        System.out.println("Livros da biblioteca:");
        for (Livro livro : repository.getLivros()) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (" + livro.getAnoPublicacao() + ")");
            if (livro instanceof EBook) {
                EBook ebook = (EBook) livro;
                System.out.println("  Formato: " + ebook.getFormato());
            }
        }
    }
}