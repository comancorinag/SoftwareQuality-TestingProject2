package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ClientCuContract;
import clase.ClientCuContractMock;
import clase.Cozonac;
import clase.PlataCard;

public class ClientCuContractMockTest {

	@Test
	public void getCantitateTest() {
		ClientCuContractMock c=new ClientCuContractMock("Mihai");
		double x=c.getCantitateComandata();
		assertEquals(40, x,0.1);
	}
	@Test
	public void areBugetTest() {
		ClientCuContractMock c=new ClientCuContractMock("Mihai");
		boolean x=c.areBuget(c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata()), c.getSumaDisponibila());
		boolean y=c.areBuget(c.valoareComanda(c.getComandat().getPret(), c.getCantitateComandata()), 150);
		assertTrue("Are buget disponibil pentru a achita comanda", x);
		
		assertTrue("Nu are buget",y);
	}
	@Test
	public void valoareComandaTest() {
		ClientCuContractMock c=new ClientCuContractMock("Mihai");
		double x=c.valoareComanda(new Cozonac().getPret(),10);
		assertEquals(80, x,0.1);
	}
}
