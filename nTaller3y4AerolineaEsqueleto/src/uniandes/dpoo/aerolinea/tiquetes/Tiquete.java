package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete 
{
	private String codigo;
	private int tarifa;
	private Boolean usado;
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) 
	{
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = usado;
		
	}
	public Cliente getCliente()
	{
		return null;
	}
	public Vuelo getVuelo()
	{
		return null;
	}
	public String getCodigo()
	{
		return codigo;
	}
	public int getTarifa()
	{
		return tarifa;
	}
	public void marcarComoUsado()
	{
		this.usado = true;
	}
	public Boolean esUsado()
	{
		return usado;
	}
}
