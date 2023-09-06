package com.example.ecommerce.model;

import java.util.Date;

public class Orden {
	private Long id;
	private String numero;
	private Date fechaCreada;
	private Date fechaRecibida;
	private double total;

	public Orden(Long id, String numero, Date fechaCreada, Date fechaRecibida, Double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreada = fechaCreada;
		this.fechaRecibida = fechaRecibida;
		this.total = total;
	}
	
	public Orden() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreada() {
		return fechaCreada;
	}

	public void setFechaCreada(Date fechaCreada) {
		this.fechaCreada = fechaCreada;
	}

	public Date getFechaRecibida() {
		return fechaRecibida;
	}

	public void setFechaRecibida(Date fechaRecibida) {
		this.fechaRecibida = fechaRecibida;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreada=" + fechaCreada + ", fechaRecibida="
				+ fechaRecibida + ", total=" + total + "]";
	}
	
}
