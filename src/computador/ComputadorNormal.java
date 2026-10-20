package computador;

public class ComputadorNormal {

    public Computador criar(){
        return new Computador.Builder()
                .processador("Intel Core i5")
                .armazenamento("512")
                .memoriaRam(8)
                .placaVideo("Gráficos integrados")
                .build();

    }
}
