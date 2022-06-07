
public class Tradutor {

    private Dicionario dicionario;

    public Tradutor(Dicionario d) {
        this.dicionario = d;
    }

    public Dicionario getDicionario() {
        return dicionario;
    }

    public void setDicionario(Dicionario dicionario) {
        this.dicionario = dicionario;
    }

    public String traduzirParaIngles(String palavra) {
        Palavra p = dicionario.consultar(palavra);
        if (p != null) {
            return p.getIngles();
        }

        return "Tradução não encontrada!";
    }

    public String traduzirParaPortugues(String palavra) {
        Palavra p = dicionario.consultar(palavra);
        if (p != null) {
            return p.getPortugues();
        }

        return "Tradução não encontrada!";
    }
}
