package buscaminasbasico;

import javax.swing.JButton;

/**
 *
 * @author Tania
 */
public class Minas {
    private boolean bomba;
    private int conteoBombas;
    private JButton boton;

    public Minas(JButton boton) {
        this.bomba = false;
        this.boton = boton;
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
