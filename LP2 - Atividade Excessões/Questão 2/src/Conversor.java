public class Conversor {

    public double fahrenheit;
    public double celsius;

    public double converter() throws FahException{
        try {
            if(fahrenheit<-459.67){
                throw new FahException("Valor menor que o zero absoluto: -459.67Fº");
            }
            else{
                return (5*(fahrenheit-32))/9;
            }

        }catch(FahException e){
            e.printStackTrace();
        }
        return 0;
    }
}
