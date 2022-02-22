package buscaminasbasico;

/**
 *
 * @author Tania
 */
public class Campo {
    private Minas campo[][];

    public Campo() {
    }
    
    public void crearCampo(){
        Minas [][] campo1 = new Minas[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                campo1[i][j] = new Minas();
                campo1[i][j].setBomba(false);
                campo1[i][j].setConteoBombas(0);
                System.out.print("["+campo1[i][j].getConteoBombas()+"]");
            }
            System.out.println("");
        }
        //this.random();
    }
    
    public Minas[][] random(){
        Minas [][] campo1 = new Minas[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                campo1[i][j] = new Minas();
                campo1[i][j].setBomba(false);
                campo1[i][j].setConteoBombas(0);
            }
        }
        return campo1;
    }
    
}
