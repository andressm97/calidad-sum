package com.proyecto.proyecto.entity;




public class Curso {
	
	private String idCurso;
	private String nombre;
	private int creditos;
	private int id_tipo;
	private int horas;
	private int teoria;
	private int laboratorio;
	private int practica;
	private String plan;
	
	
	
	
	public int getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(int laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getId_tipo() {
		return id_tipo;
	}

	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getTeoria() {
		return teoria;
	}

	public void setTeoria(int teoria) {
		this.teoria = teoria;
	}

	public int getPractica() {
		return practica;
	}

	public void setPractica(int practica) {
		this.practica = practica;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Curso(String idCurso,String nombre,int creditos, int id_tipo,int horas,int teoria,int practica,String plan) {
		this.idCurso=idCurso;
		this.creditos=creditos;
		this.id_tipo=id_tipo;
		this.horas=horas;
		this.teoria=teoria;
		this.practica=practica;
		this.plan=plan;
	}
	
	public Curso() {

	}
	

}
