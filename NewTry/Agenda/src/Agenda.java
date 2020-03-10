import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agenda {
    private String data;
    private String anotacao;
    LocalDate hoje = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String hojeFormatado = hoje.format(formato);

    public LocalDate getHoje() {
        return hoje;
    }

    public void setHoje(LocalDate hoje) {
        this.hoje = hoje;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public void ScratchPrint(){
        System.out.println("Data: "+getData());
        System.out.println("Anotacao: \n"+getAnotacao());
    }
    public void DataValida(){
        //TODO: comparar data digitada com um formato de data válido antes de continuar o programa.
    }

}
