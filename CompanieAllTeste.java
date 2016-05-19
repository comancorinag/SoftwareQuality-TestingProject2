package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DesignPatternsTests.class,RezultateVanzariTeste.class , 
	ClientiNumarTestare.class, 
	ClientiCitireFisierTestare.class,
	CompanieAdaugareClientTestare.class,
	CompanieStergeClientTeste.class,
	CompanieClientCelMaiMareBuget.class,
	DesignPatternsTests.class,
	ClientCuContractAllTeste.class})
public class CompanieAllTeste {



}
