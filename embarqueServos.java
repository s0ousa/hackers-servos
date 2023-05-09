import java.util.Random;

public class embarqueServos extends Thread {
    public int id;
    public Barco barco;

    public embarqueServos(Barco barco) {
        this.id = new Random().nextInt(10000);
        this.barco = barco;
        run();
    }

    public void run() {

            if( barco.mutex==1) {
                barco.mutex--;
                if(barco.qtdHackers!=3){
                    barco.qtdServos++;
                    barco.qtdPassageiros++;
                    board();
                }
                if(barco.qtdPassageiros==4) {
                    barco.rowBoat();
                }
                barco.mutex++;
            }

    }

    public void board(){
        System.out.println("A thread de ID " + this.id + " embarcou um servo e executou a função board");
    }
}
