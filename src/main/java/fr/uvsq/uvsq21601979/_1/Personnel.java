package fr.uvsq.uvsq21601979._1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel 
{
	private String nom;
	private String prenom;
	private String fonctions;
	private LocalDate dateNaissance;
	private ArrayList<String> telephone;
	
	public Personnel(builder b)
	{
		this.nom = b.nom;
		this.prenom = b.prenom;
		this.fonctions = b.fonctions;
		this.dateNaissance = b.dateNaissance;
		this.telephone = b.telephone;
	}
}
