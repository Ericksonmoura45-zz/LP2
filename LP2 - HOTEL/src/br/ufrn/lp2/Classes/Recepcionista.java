package br.ufrn.lp2.Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Recepcionista extends Funcionario
{
	private String[] idiomasFalados = new String[5];
	private int cont = 0;

	public Recepcionista(String matricula, String nome, double saldo, String idioma) 
	{
		super(matricula, nome, saldo);
		setIdiomasFalados(idioma);
		
	}
	void setIdiomasFalados(String idioma) { //
		if(cont==5) {
			System.out.println("Quantos idiomas fala: ");
			return;
		}
		idiomasFalados[cont] = idioma;
		cont++;
	}
	
	public Hospede CadastrarHospede() { // Cadastra um novo hospede(teste)
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String n = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();
		System.out.print("RG: ");
		String rg = sc.nextLine();
		System.out.print("Telefone: ");
		String tel = sc.nextLine();
		
		Hospede h = new Hospede(r.nextInt(50)+1, n, cpf, rg, tel);
		
		System.out.println("Dados do Hospede!");
		System.out.println("Nome: "+h.getNome());
		System.out.println("CPF: "+h.getCpf());
		System.out.println("RG: "+h.getRg());
		System.out.println("Tel: "+h.getTel());
		return h;
	}

	public Hospedagem realizarReserva(Aposento ap) 
	{ //Reserva Hospedagem
		Hospede h = CadastrarHospede();
		System.out.println();
		System.out.println("Hóspede criado. Agendando reserva");
		Conta c = new Conta();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a data de entrada (dd/mm/aaaa): ");
		String data1 = sc.nextLine();
		
		System.out.print("Digite a data de saída (dd/mm/aaaa): ");
		String data2 = sc.nextLine();
		
		Hospedagem ho = new Hospedagem(data1, data2, h, ap, c);
		return ho;
	}
	
	
	public void realizarServicoQuarto(Hospedagem hospedagem, Camareira camareira) 
	{ // Serviço camareira
		ServicoQuarto servicoQuarto1 = new ServicoQuarto();	
		servicoQuarto1.realizarServicoQuarto(hospedagem, camareira);
	}
	
	/
	public void agendarServicoQuarto(Hospedagem hospedagem, Camareira camareira, Date data) 
	{ // Serviço de Quarto
		ServicoQuarto servicoQuarto1 = new ServicoQuarto();	
		servicoQuarto1.agendarServicoQuarto(hospedagem, camareira);		
	}
}
