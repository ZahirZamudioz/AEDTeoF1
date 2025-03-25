
public class Main {
    public static void main(String[] args) {
        String[] valores = {"Hola", "Mundo"};
        System.out.println("Antes: " + valores[0] + " " + valores[1]);

        Intercambio.intercambiar(valores);

        System.out.println("Después: " + valores[0] + " " + valores[1]);
    }
}
