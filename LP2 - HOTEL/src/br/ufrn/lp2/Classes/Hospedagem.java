package br.ufrn.lp2.Classes;

import java.util.Date;

public class Hospedagem 
{
	private int codigo;
	private String dataEntrada;
	private String dataSaida;
	private Hospede hospede;
	private Aposento aposento;
	private Conta conta;

	public String getDataEntrada() 
	{
		return dataEntrada;
	}

	public String getDataSaida() 
	{
		return dataSaida;
	}

	public Aposento getAposento() 
	{
		return aposento;
	}

	public Hospede getHospede() 
	{
		return hospede;
	}
	
	public Conta getConta() 
	{
		return conta;
	}	


	public Hospedagem(String dataEntrada, String dataSaida, Hospede hospede, Aposento aposento, Conta conta)  /* Construtor de Hospedagem (child)*/
	{
		//super();
		this.dataEntrada = dEntrada;
		this.dataSaida = dSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
	}
	
	public void registrarConsumo(Consumo consumo) 
	{
		conta.setConsumo(consumo);
	}
	
}
