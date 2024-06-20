import java.awt.*;
import java.util.List;

public interface RepositorioLivro {
    void adicionarLivro(Livro livro);
    void removerLivro(Livro livro);
    List<Livro> getLivros();
}