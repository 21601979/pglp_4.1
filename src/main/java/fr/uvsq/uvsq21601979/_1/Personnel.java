package fr.uvsq.uvsq21601979._1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel  implements groupe
{
	String nom;
	String prenom;
	String fonctions;
	LocalDate dateNaissance;
	ArrayList<String> telephone;
	
	public static class builder
	{
		public final String nom;
		public final String prenom;
		public String fonctions;
		public LocalDate dateNaissance;
		public ArrayList<String> telephone;
		
		public builder(String nom, String prenom,LocalDate dateNaissance)
		{
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.fonctions = "";
			this.telephone = new ArrayList<String>();
		}
		
		public void setfonction(String fonction)
		{
			this.fonctions = fonction;
		}
		
		public void settelephone(String tel)
		{
			this.telephone.add(tel);
		}
		public Personnel build()
		{
			return new Personnel(this); 
		}
	}
	
	public void affiche(int i)
	{
		int j;
		for(j=0;j<i;j++)
		{
			System.out.println("-");
		}
		System.out.println(nom+" "+prenom+"\n");
	}

	private Personnel(builder b)
	{
		this.nom = b.nom;
		this.prenom = b.prenom;
		this.fonctions = b.fonctions;
		this.dateNaissance = b.dateNaissance;
		this.telephone = b.telephone;
	}
}
