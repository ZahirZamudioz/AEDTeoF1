
public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        coche.arrancar();
        coche.detener();

        Vehiculo bici = new Bicicleta();
        bici.arrancar();
        bici.detener();
    }
}
