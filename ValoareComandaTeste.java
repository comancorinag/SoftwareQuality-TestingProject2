package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Cozonac;
import clase.PlataCard;

public class ValoareComandaTeste {

	@Test
	public void valoareComandaTest() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		double x=c.valoareComanda(new Cozonac().getPret(),10);
		assertEquals(75, x,0.1);
	}
	@Test
	public void valoareComandaTestInverse() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		double a=new Cozonac().getPret();
		int b=c.getCantitateComandata();
		double x=c.valoareComanda(a,b);
		assertEquals(x/b, a,0.1);
	}
	@Test
	public void valoareComandaTestCrossCheck() {
		ClientCuContract c=new ClientCuContract("Ionel",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		double a=new Cozonac().getPret();
		int b=c.getCantitateComandata();
		double x=c.valoareComanda(a,b);
		assertEquals(a*b, x,0.1);
	}
}
