package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Companie;
import clase.Gogoasa;
import clase.PlataCard;

public class CompanieStergeClientTeste {

	@Test
	public void stergeClientTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		ClientCuContract cl=new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012");
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		clientiCuContract.add(new ClientCuContract("Alina Lupu",new PlataCard(),655,new Gogoasa(),10,"2901123100012"));
		Companie c=new Companie(clientiCuContract);
		int index=c.getClientiCuContract().size();
		c.stergeClientCuContract(cl);
		int indexActual=c.getClientiCuContract().size();
		assertEquals(index-1, indexActual);
	}
	@Test
	public void stergeClientListaVidaTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		try
		{ClientCuContract cl=new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012");
		Companie c=new Companie(clientiCuContract);
		c.stergeClientCuContract(cl);
		fail("lista vida");
		}
		catch(EmptyStackException ex){
			
		}
	}
	@Test
	public void stergeClientNullTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		try
		{
			ClientCuContract cl=null;
			clientiCuContract.add(cl);
			Companie c=new Companie(clientiCuContract);
		c.stergeClientCuContract(cl);
		fail("client null");
		}
		catch(NullPointerException ex){
			
		}
	}
}
