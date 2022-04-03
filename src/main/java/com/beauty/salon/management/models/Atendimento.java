package com.beauty.salon.management.models;

import java.time.LocalTime;
import java.util.Date;

public class Atendimento {

	private Cliente cliente;
	private Profissional profissional;
	private Servico servico;
	private Date data;
	private LocalTime hora;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Profissional getProfissional() {
		return profissional;
	}
	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "Atendimento [cliente=" + cliente + ", profissional=" + profissional + ", servico=" + servico + ", data="
				+ data + ", hora=" + hora + "]";
	}
	
	
}
