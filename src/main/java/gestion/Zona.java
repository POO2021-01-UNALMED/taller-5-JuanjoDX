package gestion;

import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
	
	private String nombre;
	private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo.add(zoo);
	}
	
	public Zona(){}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Zoologico getZoo() {
		return this.zoo.get(0);
	}
	
	public int cantidadAnimales(){
		return animales.size();
		}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
}
