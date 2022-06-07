
import java.util.HashSet;
import java.util.Set;

public class Inglês {

    public static void main(String[] args) {

        Set<Palavra> setPalavras = new HashSet<>();

        setPalavras.add(new Palavra("class", "classe"));
        setPalavras.add(new Palavra("food", "comida"));
        setPalavras.add(new Palavra("man", "homem"));
        setPalavras.add(new Palavra("woman", "mulher"));
        setPalavras.add(new Palavra("dog", "cachorro"));
        setPalavras.add(new Palavra("cat", "gato"));
        setPalavras.add(new Palavra("if", "se"));
        setPalavras.add(new Palavra("people", "pessoa"));


        Dicionario d = new Dicionario(setPalavras);
        Palavra palavra = new Palavra("year", "ano");

        d.adicionar(palavra);

        Tradutor t = new Tradutor(d);

        System.out.println(t.traduzirParaIngles("people"));

    }

}
