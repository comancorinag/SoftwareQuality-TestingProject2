package teste;

import static org.junit.Assert.*;
import interfete.EnumProduse;
import interfete.IClientAdapter;
import interfete.IProdus;
import interfete.Observer;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import clase.CategoriaProduseDulci;
import clase.CategoriaProduseSarate;
import clase.ClientCuContract;
import clase.ClientCuContractAdapter;
import clase.ClientOcazional;
import clase.Companie;
import clase.Cozonac;
import clase.Gogoasa;
import clase.Paine;
import clase.PaineBuilder;
import clase.PlataCard;
import clase.PlataCash;

public class DesignPatternsTests {

	@Test
	public void singletonGetDenumireTest() {
		Companie c=Companie.getInstance("Velpitar");
		assertEquals("Velpitar", c.getDenumire());
	}

	@Test
	public void simpleFactoryGetPretTest() {
		Companie c=Companie.getInstance("Velpitar");
		IProdus cozonacFactory=c.selecteazaProdus(EnumProduse.Cozonac);
		IProdus paineFactory=c.selecteazaProdus(EnumProduse.Paine);
		assertEquals(7.5, cozonacFactory.getPret(),0.1);
		}
	@Test
	public void compositeAdaugaTest() {
		CategoriaProduseDulci pd=new CategoriaProduseDulci("Dulciuri");
		CategoriaProduseSarate ps=new CategoriaProduseSarate("Sarate");
		Paine paine=new Paine();
		Gogoasa gogo=new Gogoasa();
		Cozonac cozo=new Cozonac();
		ps.adauga(paine);
		pd.adauga(gogo);
		pd.adauga(cozo);
		assertEquals(2,pd.listaProduse.size());
	}
	
	@Test
	public void builderToStringTest() {
		IProdus paineNoua=new PaineBuilder().setDenumire("Deplina").setPret(2.5).creeaza();
		boolean ok=false;
		if("Paine 2.5,Deplina,0.0".equals(paineNoua.toString()))
			ok=true;

		assertTrue(ok);
	}

}
