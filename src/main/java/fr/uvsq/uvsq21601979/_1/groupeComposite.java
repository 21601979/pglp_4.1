package fr.uvsq.uvsq21601979._1;

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
		return l.iterator();
	}

	public void affiche(int i)
	{
		Iterator it = this.iterator();
		while(it.hasNext())
		{
			i++;
			((groupeComposite) it.next()).affiche(i);
		}
	}
}
