package edu.escuelaing.arep.Palabra;

public class Palabra {
	private String descripcion;
	private String date;
	
	public Palabra(String descripcion, String date) {
		this.descripcion = descripcion;
		this.date = date;
	}
	
	public String getDescription() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion; 
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date; 
	}
	
	public String toString() {
		return "{\"date\": " + "\"" + date +  "\"" + ", \"descripcion\": " + "\"" + descripcion + "\"" + "}";
	}
}