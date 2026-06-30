public class Ordenador {
    private PlacaBase placaBase;
    private Procesador procesador;
    private TarjetaGrafica tarjetaGrafica;
    private DiscoDuro discoDuro;

    public Ordenador(PlacaBase placaBase, Procesador procesador, TarjetaGrafica tarjetaGrafica, DiscoDuro discoDuro) throws OrdenadorException {
        this.procesador = procesador;
        setPlacaBase(placaBase);
        this.tarjetaGrafica = tarjetaGrafica;
        this.discoDuro = discoDuro;
    }

    public PlacaBase getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(PlacaBase placaBase) throws OrdenadorException {
        if(procesador.getSocket().equals(placaBase.getSocket())) {
            this.placaBase = placaBase;
        } else {
            throw new OrdenadorException("El procesador y la placa base tienen distintos sockets");
        }
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) throws OrdenadorException {
        if(procesador.getSocket().equals(placaBase.getSocket())) {
            this.placaBase = placaBase;
        } else {
            throw new OrdenadorException("El procesador y la placa base tienen distintos sockets");
        }
    }

    public TarjetaGrafica getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "placaBase=" + placaBase +
                ", procesador=" + procesador +
                ", tarjetaGrafica=" + tarjetaGrafica +
                ", discoDuro=" + discoDuro +
                '}';
    }
}
