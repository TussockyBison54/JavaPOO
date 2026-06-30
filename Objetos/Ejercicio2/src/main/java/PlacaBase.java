public class PlacaBase {
    private String marca;
    private String chipset;
    private String socket;

    public PlacaBase(String marca, String chipset, String socket) {
        this.marca = marca;
        this.chipset = chipset;
        this.socket = socket;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
