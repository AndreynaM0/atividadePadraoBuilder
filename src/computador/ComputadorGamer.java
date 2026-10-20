package computador;

public class ComputadorGamer {

    public Computador criar(){
        return new Computador.Builder()
                .processador("AMD Ryzen 7")
                .armazenamento("1000")
                .memoriaRam(32)
                .placaVideo("NVIDIA RTX 4070")
                .build();

    }


}
