package com.beauty.salon.management.models;

public class Servico {

	private String tipoServico;
	private String nome;
	private double valor;
	
	
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Servico [tipoServico=" + tipoServico + ", nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
