public class EBook extends Livro {
    private String formato;

    public EBook(String titulo, String autor, int anoPublicacao, String formato) {
        super(titulo, autor, anoPublicacao);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}