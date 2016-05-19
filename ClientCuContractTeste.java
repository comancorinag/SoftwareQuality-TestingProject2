package teste;

import static org.junit.Assert.*;
import interfete.EnumProduse;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Cozonac;
import clase.Gogoasa;
import clase.Paine;
import clase.PlataCard;

public class ClientCuContractTeste {

	@Test
	public void getCantitateTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		double x=c.getCantitateComandata();
		assertEquals(10, x,0.1);
	}
	
	@Test
	public void areBugetTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		boolean x=c.areBuget(c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata()), c.getSumaDisponibila());
		boolean y=c.areBuget(c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata()), 150);
		assertFalse("Are buget disponibil pentru a achita comanda", x);
		//assertTrue("Nu are buget",x);
		assertTrue("Nu are buget",y);
	}
	
	@Test
	public void tvaDinComandaTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double tva=0;
		if(c.getComandat().getId()==1)
			tva=c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata())*0.09;
				
			else 
			{ if(c.getComandat().getId()==2)
				tva=c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata())*0.24;
			else tva=0.03;
			}
					
		double y=c.tvaDinComanda();
		assertEquals(tva,y,0.1);
	}
	
	@Test
	public void tvaDinComandaGogoasaTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),40,"1901123100012");
		double tva=c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata())*0.24;
		double y=c.tvaDinComanda();
		assertEquals(tva,y,0.1);
	}
	
	@Test
	public void equalsTest() {
		ClientCuContract c1=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),40,"1901123100012");
		ClientCuContract c2=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),40,"1901123100012");
		ClientCuContract c3=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),40,"3901123100012");
		assertTrue(c1.equals(c2));
		assertFalse(c1.equals(c3));
	}
}
