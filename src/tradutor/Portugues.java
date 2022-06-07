
import java.util.HashSet;
import java.util.Set;

public class Portugues {

    public static void main(String[] args) {

        Set<Palavra> setPalavras = new HashSet<Palavra>();

        setPalavras.add(new Palavra("classe", "class"));
        setPalavras.add(new Palavra("comida", "food"));
        setPalavras.add(new Palavra("homem", "man"));
        setPalavras.add(new Palavra("mulher", "woman"));
        setPalavras.add(new Palavra("cachorro", "dog"));
        setPalavras.add(new Palavra("gato", "cat"));
        setPalavras.add(new Palavra("se", "if"));
        setPalavras.add(new Palavra("pessoa", "people"));

        Dicionario d = new Dicionario(setPalavras);
        Palavra palavra = new Palavra("ano", "year");

        d.adicionar(palavra);

        Tradutor t = new Tradutor(d);

        System.out.println(t.traduzirParaIngles("se"));

    }

}
