package br.ufrn.lp2.Classes;

public class Hospede 
{
	private int codigo;
	private String nome;
	private String cpf;
	private String rg;
	private String tel;
	
	public String getNome() 
	{
		return nome;
	}

	public String getCpf() 
	{
		return cpf;
	}

	public String getRg() 
	{
		return rg;
	}

	public String getTel() 
	{
		return tel;
	}

	public Hospede(int codigo, String nome, String cpf, String rg, String tel) 
	{
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.tel = tel;
	}

	
}
