
import java.util.Set;

public class Dicionario {

    private Set<Palavra> palavras;

    public Dicionario(Set<Palavra> palavras) {
        this.palavras = palavras;
    }

    public void adicionar(Palavra palavra) {
        this.palavras.add(palavra);
    }

    public Boolean remover(String palavra) {
        return palavras.remove(palavra);
    }

    public Palavra consultar(String palavra) {
        for (Palavra p : palavras) {
            if (p.getPortugues().equals(palavra) || p.getIngles().equals(palavra)) {
                return p;
            }

        }
        return null;
    }

    public Set<Palavra> getPalavras() {
        return palavras;
    }

    public void setPalavras(Set<Palavra> palavras) {
        this.palavras = palavras;
    }

}
