import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public List<Livro> emprestarLivros(List<Livro> livros) {
        List<Livro> lista = new ArrayList<Livro>();

        for (Livro livro : livros) {
            for (int i = 0; i < this.livros.size(); i++) {
                if(livro.getNome().equals(this.livros.get(i).getNome())){
                    if(this.livros.get(i).getQuantidade() > 0){
                        lista.add(new Livro(this.livros.get(i).getNome(), this.livros.get(i).getAutor(), this.livros.get(i).getGenero()));
                        this.livros.get(i).setQuantidade((this.livros.get(i).getQuantidade() - 1));
                    }
                }
            }
        }        
        return lista;
    }

    public void devolverLivros(List<Livro> livros) {
        for (Livro livro : livros) {
            for (int i = 0; i < this.livros.size(); i++) {
                if(livro.getNome().equals(this.livros.get(i).getNome())){
                    this.livros.get(i).setQuantidade(this.livros.get(i).getQuantidade() + 1);                 
                }
            }
        }        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", \nLivros=" + livros + "\n]";
    }

    
}
