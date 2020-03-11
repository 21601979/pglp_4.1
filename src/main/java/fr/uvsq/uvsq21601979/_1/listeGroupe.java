package fr.uvsq.uvsq21601979._1;

import java.util.ArrayList;
import java.util.Iterator;

public class listeGroupe implements Iterable<groupe>
{
	ArrayList<groupe> l = new ArrayList<groupe>();
	int place = 0;
	
	listeGroupe(){}
	
	public void add(groupe g)
	{
		l.add(g);
	}
	
	public int size()
	{
		return l.size();
	}
	
	public groupe get(int i)
	{
		return l.get(i);
	}

	public Iterator<groupe> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}