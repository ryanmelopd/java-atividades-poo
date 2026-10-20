package AT05.Exercicio4;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo,String autor,int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void apresentarLivros() {
        System.out.println("Título do livro: " + titulo);
        System.out.println("Autor do livro: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }

    @Override
    public String toString() {
        return "Título: " + titulo
                + "\nAutor: " + autor
                + "\nPáginas: " + paginas;
    }
}
