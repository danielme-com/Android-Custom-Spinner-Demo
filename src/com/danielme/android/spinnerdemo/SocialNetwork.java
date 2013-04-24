package com.danielme.android.spinnerdemo;

/**
 * Elemento de la lista del spinner.
 * @author danielme.com
 *
 */
public class SocialNetwork 
{
	private String name;
	
	private int icon;	

	public SocialNetwork(String nombre, int icono) 
	{
		super();
		this.name = nombre;
		this.icon = icono;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getIcon() 
	{
		return icon;
	}

	public void setIcon(int icon) 
	{
		this.icon = icon;
	}	

}