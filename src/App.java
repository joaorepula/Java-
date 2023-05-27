import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        
        List<Livro> livros = new ArrayList<Livro>();

        livros.add(new Livro("livro 5", "desconhecido", "terror", 5));
        livros.add(new Livro("livro 4", "A", "terror", 5));
        livros.add(new Livro("livro 3", "desconhecido", "terror", 5));
        livros.add(new Livro("livro 2", "A", "terror", 5));
        livros.add(new Livro("livro 1", "desconhecido", "terror", 5));

        Collections.sort(livros);

        Biblioteca bilioteca = new Biblioteca("Biblioteca", livros);

        Cliente cliente = new Cliente("José");
    
        System.out.println("####### Mostrando Biblioteca - INICIAL #######");
        System.out.println(bilioteca.toString());

        System.out.println("####### Mostrando Cliente - depois de emprestar #######");
        

        List<Livro> livros2 = new ArrayList<Livro>();
        livros2.add(new Livro("livro 5"));
        livros2.add(new Livro("livro 4"));

        cliente.setLivros(bilioteca.emprestarLivros(livros2));

        System.out.println(cliente.toString());

        System.out.println("######## Mostrando Biblioteca - depois de emprestar #######");

        System.out.println(bilioteca.toString());

        System.out.println("######## Mostrando Cliente - depois de devolver #######");

        bilioteca.devolverLivros(cliente.getLivros());

        cliente.setLivros(new ArrayList<Livro>());
        
        System.out.println(cliente.toString());
        System.out.println("######## Mostrando Biblioteca - depois de devolter #######");

        System.out.println(bilioteca.toString());




    }
}
