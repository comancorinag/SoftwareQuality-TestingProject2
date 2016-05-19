package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import clase.ClientCuContract;
import clase.ClientOcazional;
import clase.Companie;
import clase.Cozonac;
import clase.Gogoasa;
import clase.Paine;
import clase.PlataCard;
import clase.PlataCash;

public class RezultateVanzariTeste {

	@Test
	public void rezultateVanzariTest() {
		Companie c=Companie.getInstance("Velpitar");
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		List<ClientOcazional> clientiOcazional = new ArrayList<ClientOcazional>();
		ClientCuContract clientContract1=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),10,"1901123100012");
		ClientOcazional clientOcazional1=new ClientOcazional("Ana",new PlataCash(),5.5,new Paine());
		ClientCuContract clientContract2=new ClientCuContract("Mihai",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		ClientOcazional clientOcazional2=new ClientOcazional("Maria",new PlataCash(),5.5,new Paine());
		clientiCuContract.add(clientContract1);
		clientiCuContract.add(clientContract2);
		clientiOcazional.add(clientOcazional1);
		clientiOcazional.add(clientOcazional2);
		double s=c.vanzariEfectuate(clientiOcazional, clientiCuContract);
			assertEquals(15.5, s,0.1);
	}
	@Test
	public void rezultateVanzariTestCrossCheck() {
		Companie c=Companie.getInstance("Velpitar");
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		List<ClientOcazional> clientiOcazional = new ArrayList<ClientOcazional>();
		ClientCuContract clientContract1=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),10,"1901123100012");
		ClientOcazional clientOcazional1=new ClientOcazional("Ana",new PlataCash(),5.5,new Paine());
		ClientCuContract clientContract2=new ClientCuContract("Mihai",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		ClientOcazional clientOcazional2=new ClientOcazional("Maria",new PlataCash(),5.5,new Paine());
		clientiCuContract.add(clientContract1);
		clientiCuContract.add(clientContract2);
		clientiOcazional.add(clientOcazional1);
		clientiOcazional.add(clientOcazional2);
		double s=c.vanzariEfectuate(clientiOcazional, clientiCuContract);
		assertEquals(2*new Paine().getPret()+new Cozonac().getPret()+new Gogoasa().getPret(), s,0.1);
	}
	@Test
	public void rezultateVanzariTestInverse() {
		Companie c=Companie.getInstance("Velpitar");
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		List<ClientOcazional> clientiOcazional = new ArrayList<ClientOcazional>();
		ClientCuContract clientContract1=new ClientCuContract("Ionel",new PlataCard(),35.5,new Gogoasa(),10,"1901123100012");
		ClientOcazional clientOcazional1=new ClientOcazional("Ana",new PlataCash(),5.5,new Paine());
		ClientCuContract clientContract2=new ClientCuContract("Mihai",new PlataCard(),35.5,new Cozonac(),10,"1901123100012");
		ClientOcazional clientOcazional2=new ClientOcazional("Maria",new PlataCash(),5.5,new Paine());
		clientiCuContract.add(clientContract1);
		clientiCuContract.add(clientContract2);
		clientiOcazional.add(clientOcazional1);
		clientiOcazional.add(clientOcazional2);
		double s=c.vanzariEfectuate(clientiOcazional, clientiCuContract);
		assertEquals(s-2*new Paine().getPret(),new Cozonac().getPret()+new Gogoasa().getPret(),0.1);
	}
}
