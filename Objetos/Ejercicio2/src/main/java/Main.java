public class Main {
    public static void main(String[] args) {
        try {
            Ordenador ordenador1 = new Ordenador(
                    new PlacaBase("ASUS", "B650", "AM5"),
                    new Procesador("AMD", "Ryzen 7 7700X", 8, 4.5f, "AM5"),
                    new TarjetaGrafica("NVIDIA", "RTX 4070", 5888, 1.92f, 12),
                    new DiscoDuro("Samsung", TIpoDiscoDuro.SSD, 1000)

            );


        } catch (OrdenadorException e) {
            System.out.println(e.getMessage());
            System.out.println("ordenador 1 falló");
        }

        try {
            Ordenador ordenador2 = new Ordenador(
                    new PlacaBase("MSI", "Z790", "LGB1700"),
                    new Procesador("Intel", "Core i7-14700K", 20, 3.4f, "LGA1700"),
                    new TarjetaGrafica("AMD", "RX 7800 XT", 3840, 2.12f, 16),
                    new DiscoDuro("Seagate", TIpoDiscoDuro.HDD, 2000)
            );

        } catch (OrdenadorException e) {
            System.out.println(e.getMessage());
            System.out.println("ordenador 2 falló");
        }


    }
}
