ackage br.ufrn.lp2.Main;

import br.ufrn.lp.Classes.*; // O '*' serve para importar todas as classes do diretório

import java.text.ParseException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException {
		Recepcionista r = new Recepcionista("365.968.987-65", "Dimas", 100, "Ingles");    /*Preenchendo as classes com dados */
		Camareira c = new Camareira("693.965.874-96", "Maria", 350);
		Aposento ap = new Aposento(8, 300, "Suite", 6);

		Consumo consumo1 = new Consumo(12, "luz", 1, 3.0);
		Conta conta1 = new Conta();
		Aposento aposento1 = new Aposento(13, 356, "Singular", 10);
		Hospede hospede1 = new Hospede(10, "Moraes", "12561", "16", "98651965");
		Hospedagem hospedagem1 = new Hospedagem("10/10/2019", "15/10/2019", hospede1, aposento1, conta1);
		
		int op;
		Scanner sc = new Scanner(System.in);
		menu();
		do {
			System.out.print("Opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Cadastrando hóspede: ");
				Hospedagem ho = r.realizarReserva(ap);
				System.out.println();
				
				System.out.println("Hospedagem agendada com sucesso para "+ho.getHospede().getNome());
				System.out.println("Dados da hospedagem: ");
				System.out.println("Data de entrada: "+ho.getDataEntrada());
				System.out.println("Data de sáida: "+ ho.getDataSaida());
				System.out.println("Número do aposento: "+ho.getAposento().getNumero());
				
				System.out.println();
				System.out.println();
				menu();
				break;
			case 2:
				r.agendarServicoQuarto(hospedagem1, c);
				
				menu();
				break;
			case 3:
				menu();
				break;
			
			case 4:
				System.out.println("Produto consumido: " + consumo1.getDescricao());
				hospedagem1.registrarConsumo(consumo1);
				System.out.println("Valor da conta da hospedagem: " + hospedagem1.getConta().getValor());

				menu();
				break;
				
			case 0:
				System.out.println("Programa encerrado.");
				break;
			default:
				break;
			}
		}while(op!=0);
	}
	
	public static void menu() {
		System.out.println("#####SEJA BEM VINDO######\n");
		System.out.println("O que deseja fazer?\n");
		System.out.println("1- Realizar reserva");
		System.out.println("2- Realizar serviço de quarto");
		System.out.println("3- Agendar serviço de quarto");
		System.out.println("4- Registrar consumo");
		System.out.println("0- Sair");
		
	}
	

}
