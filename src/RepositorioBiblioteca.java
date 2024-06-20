import java.util.List;

public class RepositorioBiblioteca implements RepositorioLivro {
    private Biblioteca biblioteca;

    public RepositorioBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public void adicionarLivro(Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    @Override
    public void removerLivro(Livro livro) {
        biblioteca.removerLivro(livro);
    }

    @Override
    public List<Livro> getLivros() {
        return biblioteca.getLivros();
    }
}