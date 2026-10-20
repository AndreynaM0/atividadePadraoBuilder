package computador;

public class Computador {
    private String processador;
    private int memoriaRam;
    private String placaVideo;
    private String armazenamento;


    public Computador(Builder builder){
        this.processador = builder.processador;
        this.memoriaRam = builder.memoriaRam;
        this.placaVideo = builder.placaVideo;
        this.armazenamento = builder.armazenamento;
    }

    public static class Builder {
        private String processador;
        private int memoriaRam;
        private String placaVideo;
        private String armazenamento;


        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder memoriaRam(int memoriaRam) {
            this.memoriaRam = memoriaRam;
            return this;
        }

        public Builder placaVideo(String placaVideo) {
            this.placaVideo = placaVideo;
            return this;
        }

        public Builder armazenamento(String armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", placaVideo='" + placaVideo + '\'' +
                ", armazenamento='" + armazenamento + '\'' +
                '}';
    }
}
