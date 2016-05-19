package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import clase.ClientCuContract;
import clase.Companie;
import clase.Gogoasa;
import clase.PlataCard;

public class ClientiNumarTestare {

	@Test
	public void numarBugeteTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		clientiCuContract.add(new ClientCuContract("Alina Lupu",new PlataCard(),655,new Gogoasa(),10,"2901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(4, c.numaraBugeteCumparatori(450));
	}
	@Test
	public void numarBugeteZeroTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		clientiCuContract.add(new ClientCuContract("Alina Lupu",new PlataCard(),655,new Gogoasa(),10,"2901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numaraBugeteCumparatori(1500));
	}
	@Test
	public void numarBugeteVidaTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numaraBugeteCumparatori(1500));
	}
	@Test
	public void numarBugeteNullTest() {
		List<ClientCuContract> clientiCuContract = null;
		try{
		Companie c=new Companie(clientiCuContract);
		System.out.println(c.numaraBugeteCumparatori(250));
		fail("null");
		}
		catch(NullPointerException ex){
			
		}
	}
	@Test
	public void numarFemeiClientTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		clientiCuContract.add(new ClientCuContract("Alina Lupu",new PlataCard(),655,new Gogoasa(),10,"2901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(4, c.numarClientiFemei());
	}
	@Test
	public void numarFemeiClientZeroTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numarClientiFemei());
	}
	@Test
	public void numarFemeiClientVidaTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numarClientiFemei());
	}
	@Test
	public void numarFemeiClientNullTest() {
		List<ClientCuContract> clientiCuContract = null;
		try{
		Companie c=new Companie(clientiCuContract);
		System.out.println(c.numarClientiFemei());
		fail("null");
		}
		catch(NullPointerException ex){
			
		}
		}
	@Test
	public void numarBArbatiClientTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Ionel Coman",new PlataCard(),835.5,new Gogoasa(),10,"1901123100012"));
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Marius Pop",new PlataCard(),237,new Gogoasa(),10,"3901123100012"));
		clientiCuContract.add(new ClientCuContract("Vasile Ciucu",new PlataCard(),1020,new Gogoasa(),10,"5901123100012"));
		clientiCuContract.add(new ClientCuContract("Alina Lupu",new PlataCard(),655,new Gogoasa(),10,"2901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(3, c.numarClientiBarbati());
	}
	@Test
	public void numarBarbatiClientZeroTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		clientiCuContract.add(new ClientCuContract("Irina Fotescu",new PlataCard(),350.5,new Gogoasa(),10,"2901123100012"));
		clientiCuContract.add(new ClientCuContract("Maria Ciobotaru",new PlataCard(),535,new Gogoasa(),10,"4901123100012"));
		clientiCuContract.add(new ClientCuContract("Ilinca Veronica",new PlataCard(),79,new Gogoasa(),10,"4901123100012"));
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numarClientiBarbati());
	}
	@Test
	public void numarBarbatiClientVidaTest() {
		List<ClientCuContract> clientiCuContract = new ArrayList<ClientCuContract>();
		Companie c=new Companie(clientiCuContract);
		assertEquals(0, c.numarClientiBarbati());
	}
	@Test
	public void numarBArbatiClientNullTest() {
		List<ClientCuContract> clientiCuContract = null;
		try{
		Companie c=new Companie(clientiCuContract);
		System.out.println(c.numarClientiBarbati());
		fail("null");
		}
		catch(NullPointerException ex){
			
		}
		}
}
