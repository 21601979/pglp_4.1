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
		assertEquals(b.getNom(),"bow");
		assertEquals(b.getPrenom(),"ser");
		assertEquals(b.getDateNaissance(),LocalDate.of(1, 1, 1));
	}
	
	@Test
	public void setfonctionTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.setfonction("roi");
		assertEquals(b.getFonctions(),"roi");
	}
	
	@Test
	public void settelephoneTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.settelephone("0000000000");
		assertEquals(b.getTelephone().get(0),"0000000000");
	}
	
	@Test
	public void buildTest()
	{
		builder b = new builder("bow","ser",LocalDate.of(1, 1, 1));
		b.setfonction("roi");
		b.settelephone("0000000000");
		Personnel p = b.build();
		assertEquals(p.getNom(),"bow");
		assertEquals(p.getPrenom(),"ser");
		assertEquals(p.getDateNaissance(),LocalDate.of(1, 1, 1));
		assertEquals(p.getFonctions(),"roi");
		assertEquals(p.getTelephone().get(0),"0000000000");
	}
}