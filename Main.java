import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Barco meuBarco = new Barco();

        while(meuBarco.qtdPassageiros!=4){
            if(new Random().nextInt(2)==1){
                embarqueServos entraServo = new embarqueServos(meuBarco);
            } else {
                embarqueHacker entraHacker = new embarqueHacker(meuBarco);
            }
        }





    }
}