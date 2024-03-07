package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Vuelo 
{
	private Avion avion;
	private String fecha;
	private Map<String, Tiquete> tiquetes;
	private Ruta ruta;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion)
	{
		this.fecha = fecha;
		this.avion = avion;
		this.ruta = ruta;
		tiquetes = new HashMap<String, Tiquete>();
	}
	public Ruta getRuta()
	{
		return ruta;
	}
	public String getFecha()
	{
		return fecha;
	}
	public Avion getAvion()
	{
		return avion;
	}
	public Collection<Tiquete> getTiquetes()
	{
		return tiquetes.values();
	}
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		return -1;
	}
	public Boolean equals(Objects obj)
	{
		return null;
	}

}
