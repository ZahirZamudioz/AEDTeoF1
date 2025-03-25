public class Intercambio {

    public static <T> void intercambiar(T[] array) {
        if (array.length >= 2) {
            T aux = array[0];
            array[0] = array[1];
            array[1] = aux;
        }
    }
}