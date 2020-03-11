package fr.uvsq.uvsq21601979._1;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import fr.uvsq.uvsq21601979._1.Personnel.builder;

public class PersonnelTest 
{
	@Test
	public void builderTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		assertEquals(b.nom,"bow");
		assertEquals(b.prenom,"ser");
		assertEquals(b.dateNaissance,LocalDate.of(1, 1, 1));
	}
	
	@Test
	public void setfonctionTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.setfonction("roi");
		assertEquals(b.fonctions,"roi");
	}
	
	@Test
	public void settelephoneTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.settelephone("0000000000");
		assertEquals(b.telephone.get(0),"0000000000");
	}
	
	@Test
	public void buildTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.setfonction("roi");
		b.settelephone("0000000000");
		Personnel p = b.build();
		assertEquals(p.nom,"bow");
		assertEquals(p.prenom,"ser");
		assertEquals(p.dateNaissance,LocalDate.of(1, 1, 1));
		assertEquals(p.fonctions,"roi");
		assertEquals(p.telephone.get(0),"0000000000");
	}
}