package com.proyecto.proyecto.entity;

public class Alumno {
	
	private String codigo_alumno;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena; 
	private int ciclo;
	private String id_carrera;
	
	public String getCodigo_alumno() {
		return codigo_alumno;
	}
	public void setCodigo_alumno(String codigo_alumno) {
		this.codigo_alumno = codigo_alumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public String getId_carrera() {
		return id_carrera;
	}
	public void setId_carrera(String id_carrera) {
		this.id_carrera = id_carrera;
	}
	
	
	
}
