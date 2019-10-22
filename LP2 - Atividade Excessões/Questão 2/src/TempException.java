public class TempException {
    public void TempException() throws Exception {
        throw new Exception("Excessão1");
    public void FahException() throws TempException{
        throw new Exception("Excessão2");
        }
    }

}
