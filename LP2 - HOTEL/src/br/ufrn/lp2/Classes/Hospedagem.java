package br.ufrn.lp2.Classes;

import java.util.Date;

public class Hospedagem 
{
	private int codigo;
	private String dEntrada;
	private String dSaida;
	private Hospede hospede;
	private Aposento aposento;
	private Conta conta;

	public String getDataEntrada() 
	{
		return dEntrada;
	}

	public String getDataSaida() 
	{
		return dSaida;
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


	public Hospedagem(String dEntrada, String dSaida, Hospede hospede, Aposento aposento, Conta conta) 
	{
		super();
		this.dEntrada = dEntrada;
		this.dSaida = dSaida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;
	}
	
	public void registrarConsumo(Consumo consumo) 
	{
		conta.setConsumo(consumo);
	}
	
}
