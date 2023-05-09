public class Barco {
    public int qtdPassageiros;
    public int qtdServos;
    public int qtdHackers;

    public int mutex;

    public Barco() {
        this.qtdPassageiros = 0;
        this.qtdServos = 0;
        this.qtdHackers = 0;
        this.mutex = 1; // disponivel
    }

    public void rowBoat() {
        System.out.println("O barco está saindo... Remandoooo!");
    }

}
