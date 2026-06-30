public class TarjetaGrafica {
    private String marca;
    private String modelo;
    private int nucleos;
    private float velocidad;
    private int cantidadEnMemoria;

    public TarjetaGrafica(String marca, String modelo, int nucleos, float velocidad, int cantidadEnMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nucleos = nucleos;
        this.velocidad = velocidad;
        this.cantidadEnMemoria = cantidadEnMemoria;
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

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantidadEnMemoria() {
        return cantidadEnMemoria;
    }

    public void setCantidadEnMemoria(int cantidadEnMemoria) {
        this.cantidadEnMemoria = cantidadEnMemoria;
    }
}
