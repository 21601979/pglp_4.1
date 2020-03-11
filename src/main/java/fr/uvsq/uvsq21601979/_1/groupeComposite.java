package fr.uvsq.uvsq21601979._1;

import java.util.ArrayList;

public class groupeComposite implements groupe 
{
	ArrayList<groupe> l = new ArrayList<groupe>();
	
	public void add(groupe compo)
	{
		l.add(compo);
	}
}
