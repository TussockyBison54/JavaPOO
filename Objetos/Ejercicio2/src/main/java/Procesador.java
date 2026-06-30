import java.net.Socket;

public class Procesador {
    private String marca;
    private String modelo ;
    private int numNucleos;
    private float velocidadBase ;
    private String socket;

    public Procesador(String marca, String modelo, int numNucleos, float velocidadBase, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadBase = velocidadBase;
        this.socket = socket;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public float getVelocidadBase() {
        return velocidadBase;
    }

    public void setVelocidadBase(float velocidadBase) {
        this.velocidadBase = velocidadBase;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
