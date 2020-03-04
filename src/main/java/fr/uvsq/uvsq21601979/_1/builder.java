package fr.uvsq.uvsq21601979._1;

import java.time.LocalDate;
import java.util.ArrayList;

public class builder
{
	public final String nom;
	public final String prenom;
	public String fonctions;
	public LocalDate dateNaissance;
	public ArrayList<String> telephone;
	
	public builder(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Personnel build()
	{
		return new Personnel(this); 
	}
}
