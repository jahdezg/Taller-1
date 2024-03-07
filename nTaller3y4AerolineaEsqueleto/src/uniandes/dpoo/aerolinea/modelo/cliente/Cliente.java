package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.LinkedList;
import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Avion;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente 
{
	private List<Tiquete> tiquetesSinUsar;
	private List<Tiquete> tiquetesUsados;
	
	public Cliente()
	{
		tiquetesSinUsar = new LinkedList<Tiquete>();
		tiquetesUsados = new LinkedList<Tiquete>();
	}
	public String getTipoCliente()
	{
		return null;
	}
	public String getIdentificador()
	{
		int numero = ( int ) ( Math.random( ) * 10e7 );
        String codigo = "" + numero;

        while( codigo.length( ) < 7 )
            codigo = "0" + codigo;
		return codigo;
	}
	public void agregarTiquete(Tiquete tiquete)
	{
		tiquetesSinUsar.add(tiquete);
	}
	public int calcularValorTotal()
	{
		return -1;
	}
	public void usarTiquetes(Vuelo vuelo)
	{}
	
}
