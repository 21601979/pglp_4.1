package fr.uvsq.uvsq21601979._1;

import java.util.ArrayList;
import java.util.Iterator;

public class groupeComposite implements groupe
{
	listeGroupe l = new listeGroupe();
	
	public void add(groupe compo)
	{
		l.add(compo);
	}

	public Iterator<groupe> iterator() 
	{
		return new groupeIterator(l);
	}
}
