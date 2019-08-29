package br.ufrn.lp2.Classes;

import java.util.Date;

public class ServicoQuarto 
{
	private Date data;
	private Hospedagem hospedagem;
	private Camareira camareira;
	private boolean realizado;
	
	public Hospedagem getHospedagem()

	{
		return hospedagem;
	}

	public Camareira getCamareira()

	{
		return camareira;
	}


	public void setCamareira(Camareira camareira) 
	{
		this.camareira = camareira;
	}
	
	public void setRealizado(boolean realizado) 
	{
		this.realizado = realizado;
	}
	
	public void agendarServicoQuarto(Hospedagem h1, Camareira c1) 
	{
		hospedagem = h1;
		camareira = c1;
		realizado = false;
	}

	public void realizarServicoQuarto(Hospedagem h1, Camareira c1) 
	{
		realizado = true;
	}
}
