public class Conversor {

    private double temp = 50;
    public double converter (double temp) throws FahException{
        double celsius = (temp - 32) * (5/9));
        if(temp < 459,67){
            throw new FahException("Zero absoluto");
        }
        else if(celsius < 273,15){
            throw new FahException("Zero absoluto");
        }

        return celsius;
    }
}
