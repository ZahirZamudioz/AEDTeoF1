public class Main {
    public static void main(String[] args) {
        
        Persona <Integer> numTelef = new Persona<>(934343434);
        System.out.println("El numero de telefono es: " + numTelef.getTelefono());

        Persona <String> numTelef2 = new Persona<>("+52 938493948");
        System.out.println("El numero de telefono es: " + numTelef2.getTelefono());
    }
}
