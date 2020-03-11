package fr.uvsq.uvsq21601979._1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import fr.uvsq.uvsq21601979._1.Personnel.builder;

public class groupeCompositeTest 
{
	public void addTest()
	{
		groupeComposite g = new groupeComposite();
		groupeComposite g2 = new groupeComposite();

		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		Personnel p = b.build();
		g.add(p);
		g.add(g2);
		assertEquals(g.l.get(0),p);
	}
}
