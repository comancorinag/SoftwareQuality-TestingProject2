package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Cozonac;
import clase.PlataCard;

public class ValoareComandaDupaDiscountTest {


	@Test
	public void discountTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		double y=c.discountComanda(x);
		assertNotEquals(8, y,0.1);
	}
	@Test
	public void discountTestInverse() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		double y=c.discountComanda(x);
		assertNotEquals(y/x, 0.9,0.1);
	}
	@Test
	public void discountTestCrossCheck() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		double y=c.discountComanda(x);
		assertEquals(x*0.05, y,0.1);
	}
	@Test
	public void discountTestAll() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		
		double discount=0;
		if(x>500)
			discount= x*0.1;
		else {
			if(x>200)
				discount= x*0.75;
		else 
			{if(x>100)
				discount= x*0.05;
			else discount= 0;
			}
			}
				
		double y=c.discountComanda(x);
		assertEquals(discount, c.discountComanda(x),0.1);
	}
	@Test
	public void discountComandaPeste100Test() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),20,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		assertTrue(x>100);
		double	discount= x*0.05;
		double y=c.discountComanda(x);
		assertEquals(discount, c.discountComanda(x),0.1);
	}
	@Test
	public void discountComandaPeste200Test() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),40,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		assertTrue(x>200);
		double discount= x*0.75;
		double y=c.discountComanda(x);
		assertEquals(discount,y,0.1);
	}
	@Test
	public void discountComandaPeste500Test() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),200,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),c.getCantitateComandata());
		double discount= x*0.1;
		double y=c.discountComanda(x);
		assertEquals(discount, y,0.1);
	}
	

}
