
import java.util.Objects;

public class Palavra {

    private String portugues;

    private String ingles;

    public Palavra(String portugues, String ingles) {
        this.portugues = portugues;
        this.ingles = ingles;
    }

    public String getPortugues() {
        return portugues;
    }

    public void setPortugues(String portugues) {
        this.portugues = portugues;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingles, portugues);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Palavra other = (Palavra) obj;
        return Objects.equals(ingles, other.ingles) && Objects.equals(portugues, other.portugues);
    }
}
