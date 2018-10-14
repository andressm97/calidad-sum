package com.proyecto.proyecto.entity;

public class Programacion_curso {
	
	private int id_programacion;
	private String grupo;
	private String id_curso;
	private int codigo_profesor;
	private int matriculados;
	private String aula;
	private String dia;
	private int h_inicio;
	private int h_final;
	private String clase;
	
	public int getId_programacion() {
		return id_programacion;
	}
	public void setId_programacion(int id_programacion) {
		this.id_programacion = id_programacion;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getId_curso() {
		return id_curso;
	}
	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	}
	public int getCodigo_profesor() {
		return codigo_profesor;
	}
	public void setCodigo_profesor(int codigo_profesor) {
		this.codigo_profesor = codigo_profesor;
	}
	public int getMatriculados() {
		return matriculados;
	}
	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public int getH_inicio() {
		return h_inicio;
	}
	public void setH_inicio(int h_inicio) {
		this.h_inicio = h_inicio;
	}
	public int getH_final() {
		return h_final;
	}
	public void setH_final(int h_final) {
		this.h_final = h_final;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	

}
