package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import clase.ClientOcazional;
import clase.Companie;

public class ClientiCitireFisierTestare {
	FileReader fi;
	BufferedReader bf;
	
	@Before
	public void setUp() throws Exception {
		fi = new FileReader("clientiocazionali.txt");
		bf = new BufferedReader(fi);
	}
	@Test
	public void test() {
		Companie c=Companie.getInstance("Vel");
		 try {
		        fi = new FileReader("clientiocazionali.txt");
		        bf = new BufferedReader(fi);
		        String linie=bf.readLine();
		        while (linie!= null)  {
		            String[] cuvinte = linie.split(",");
		          ClientOcazional co=new ClientOcazional();
		          co.setNume(cuvinte[0]);
		          co.setSumaDisponibila(Double.parseDouble(cuvinte[1]));
		          linie = bf.readLine();
		          c.getClientiOcazionali().add(co);
		          
		          assertEquals(55.5, co.getSumaDisponibila(),0.1);
		        }
		    } 	catch(FileNotFoundException ex){}
			catch(Exception ex){}
			}
	
	@After
	public void tearDown() throws Exception {
		bf.close();
		fi.close();
	}
}
