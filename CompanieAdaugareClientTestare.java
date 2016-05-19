package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Companie;
import clase.Gogoasa;
import clase.PlataCard;

public class CompanieAdaugareClientTestare {

	@Test
	public void adaugaClientTest() {
		Companie c=Companie.getInstance("Vel");
		ClientCuContract cc=new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012");
		c.adaugaClientCuContract(cc);
		assertEquals(cc, c.getClientCuContract(cc));
	}
	
	@Test
	public void adaugaClientNullTest() {
		Companie c=Companie.getInstance("Vel");
		ClientCuContract cc=null;
		try{
		c.adaugaClientCuContract(cc);
		}
		catch(NullPointerException ex)
		{
			
		}
	}
	@Test
	public void adaugaAcelasiClientTest() {
		Companie c=Companie.getInstance("Vel");
		ClientCuContract cc=new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012");
		c.adaugaClientCuContract(cc);
		c.adaugaClientCuContract(cc);
		assertEquals(cc, c.getClientCuContract(cc));
	}
}
