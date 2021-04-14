package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	String nombre;
	String ubicacion;
	ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre,String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico(){}
	
	public int cantidadTotalAnimales(){
		int totalanimales = 0;
		
		for (Zona zona: zonas) {
			totalanimales += zona.getAnimales().size();
		}
		
		return totalanimales;	
	}
	
	public void agregarZonas(Zona z) {
		this.zonas.add(z);
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}
}
