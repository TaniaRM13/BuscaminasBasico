package buscaminasbasico;

/**
 *
 * @author Tania
 */
public class Minas {
    private boolean bomba;
    private int conteoBombas;

    public Minas() {
        this.bomba = false;
        this.conteoBombas = 0;
    }

    public void setBomba(boolean bomba) {
        this.bomba = bomba;
    }

    public void setConteoBombas(int conteoBombas) {
        this.conteoBombas = conteoBombas;
    }

    public boolean isBomba() {
        return bomba;
    }

    public int getConteoBombas() {
        return conteoBombas;
    }
    
    
    
}
