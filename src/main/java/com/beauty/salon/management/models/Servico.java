package com.beauty.salon.management.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="servicos")
public class Servico implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String tipoServico;
	private String nome;
	private double valor;
	private int horasEstimadas;
	private int minutosEstimados;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public int getMinutosEstimados() {
		return minutosEstimados;
	}
	public void setMinutosEstimados(int minutosEstimados) {
		this.minutosEstimados = minutosEstimados;
	}
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
		return "Servico [id=" + id + ", tipoServico=" + tipoServico + ", nome=" + nome + ", valor=" + valor
				+ ", horasEstimadas=" + horasEstimadas + ", minutosEstimados=" + minutosEstimados + "]";
	}
	

	}
	
	
	
	
	

