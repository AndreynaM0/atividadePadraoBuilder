package computador;

public class mainComputer {
    public static void main(String[] args) {
        Computador computadorGamer = new ComputadorGamer().criar();

        Computador computadorNormal= new ComputadorNormal().criar();



        System.out.println(computadorGamer);
        System.out.println("\n");
        System.out.println(computadorNormal);
    }
}
