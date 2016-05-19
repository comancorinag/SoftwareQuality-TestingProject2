package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Paine;

public class PaineTeste {

	@Test
	public void setDenumireTest() {
		Paine p =new Paine();
		assertEquals("Boiereasca", p.getDenumire());

	}

	@Test
	public void constructorTest() {
		try{
		Paine p = new Paine(25,"Deplina",250);
				}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void clonePaineTest() throws CloneNotSupportedException {
		Paine p = new Paine();
		Paine p2= (Paine)p.clone();
	assertNotSame(p,p2);
			
		}

	@Test
	public void idProdusTest() {
		Paine paine=new Paine();
		assertEquals(1,paine.getId());
	}

}
