public class DiscoDuro {
private String marca;
private TipoDiscoDuro tipo;
private int capacidadEnGB;

    public DiscoDuro(String marca, TipoDiscoDuro tipo, int capacidadEnGB) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidadEnGB = capacidadEnGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoDiscoDuro getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiscoDuro tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadEnGB() {
        return capacidadEnGB;
    }

    public void setCapacidadEnGB(int capacidadEnGB) {
        this.capacidadEnGB = capacidadEnGB;
    }
}
