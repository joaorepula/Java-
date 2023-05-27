public class Livro implements Comparable<Livro>{
    private String nome, autor, genero;
    private int quantidade;
    
    public Livro(String nome, String autor, String genero, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }
    

    public Livro(String nome, String autor, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade =1;
    }
    public Livro(String nome) {
        this.nome = nome;
        this.quantidade =1;
    }


    public String verEstoque() {
        return "O livro " + nome + " tem " + quantidade + " copias no estoque.";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    @Override
    public String toString() {
        return "\n   Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", quantidade=" + quantidade + "]";
    }


    @Override
    public int compareTo(Livro livro) {
        return nome.compareTo(livro.getNome());
    }



    
}
