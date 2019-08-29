package br.ufrn.lp2.Classes;

import java.util.Random;

public class Conta 
{
	private int codigo;
	private double valor;
	private boolean pago;
	private Consumo[] consumos;
	private int cont;
	
	public boolean EstaPago()
	{
		return pago;
	}

	public void setPago(boolean pago) 
	{
		this.pago = pago;
	}

	public void setValor(double valor) 
	{
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setConsumo(Consumo consumo) 
	{
		consumos[cont] = consumo; /**/
		this.valor += consumo.getValorUnitario() * consumo.getQuantidade(); /* Faz a soma dos valores dos itens consumidos*/
		cont++;
	}

	public Conta() // Testar antes
	{
		Random r = new Random();
		this.codigo = r.nextInt(50)+1;                    /* Gera valores aleatórios para o código do produto*/
		this.pago = false;
		this.valor = 0.0;
		this.consumos = new Consumo[5];
		cont = 0;
	}
	
	
}
