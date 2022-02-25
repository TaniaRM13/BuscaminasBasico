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
        int x,y;
        for (int i = 0; i < 3; i++) {
            x = 0;
            x = (int) (4* Math.random());
            y = 0;
            y = (int) (4*Math.random());
            if(campo1[x][y].isBomba()){
                i--;
            }else{
                campo1[x][y].setBomba(true);
                //campo1[x][y].setConteoBombas(9);
            }
        }
    }
    
    public void contarBombas(int x, int y){
        int cuenta = 0;
        if(campo1[x][y].isBomba()){
            return;
        }else{
            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if((x+i<campo1.length && x+i>=0)&&(y+j<campo1.length && y+j>=0))
                    if(campo1[x+i][y+j].isBomba()){
                        cuenta++;
                    }
                }
            }
            campo1[x][y].setConteoBombas(cuenta);
        }
        
    }

    public void recorrerArray(){
        for (int i=0;i<campo1.length;i++) {
            for (int j=0;j<campo1.length;j++) {
                contarBombas(i,j);
            }
        }
    }

    public void imprimir(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+campo1[i][j].getConteoBombas()+"]");
            }
            System.out.println("");
        }
    }

}
