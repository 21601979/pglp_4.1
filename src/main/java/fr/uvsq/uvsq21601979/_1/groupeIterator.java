package fr.uvsq.uvsq21601979._1;

import java.util.Iterator;

public class groupeIterator implements Iterator<groupe>
{
	listeGroupe l;
	int cont = 0;
	
	public groupeIterator(listeGroupe l)
	{
		this.l = l;
	}
	
	public boolean hasNext() 
	{
		if(cont<l.size())
		{
			return true;
		}
		return false;
	}

	public groupe next() 
	{
		return l.get(cont);
	}
	
}
