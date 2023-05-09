import java.util.Random;

public class embarqueHacker extends Thread{
    public int id;
    public Barco barco;

    public embarqueHacker(Barco barco) {
        this.id = new Random().nextInt(10000);
        this.barco = barco;
        run();
    }

    public void run() {

            if( barco.mutex==1) {
                barco.mutex--;
                if(barco.qtdServos!=3){
                    barco.qtdHackers++;
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
        System.out.println("A thread de ID " + this.id + " embarcou um hacker e executou a função board");
    }
}

