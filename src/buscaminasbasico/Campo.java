package buscaminasbasico;

/**
 *
 * @author Tania
 */
public class Campo {
    private Minas campo1[][];

    public Campo() {

    }
    
    public void crearCampo(){
        campo1 = new Minas[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                campo1[i][j] = new Minas();
            }
        }
    }
    
    public void randomMinas(){
        this.campo1 = campo1;
        int x,y;
        for (int i = 0; i < 3; i++) {
            x = 0;
            x = (int) (3* Math.random());
            y = 0;
            y = (int) (3*Math.random());
            if(campo1[x][y].isBomba()){
                i--;
            }else{
                campo1[x][y].setBomba(true);
                campo1[x][y].setConteoBombas(1);
            }
        }
    }
    
    public void imprimir(){
        this.campo1 = campo1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+campo1[i][j].getConteoBombas()+"]");
            }
            System.out.println("");
        }
    }

}
