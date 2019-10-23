public class Main {

    public static void main(String[] args) throws FahException {
        Conversor conversor = new Conversor();

        conversor.fahrenheit = -50000.55;
        conversor.celsius = 30.32;
        conversor.converter();
    }
}
