package tr.edu.medipol.yazilimaraclari.yunusemresamat;

import org.junit.Test;
import org.junit.*;


public class MuhasebeProgramiTest {

	@Test
	public final void testUcretHesapla() {
				
		Assert.assertEquals( 3 + " * " + 10 + " = " + (3 * 10) , MuhasebeProgrami.ucretHesapla(3, 10));
		
		Assert.assertEquals( "Hatal� De�er Giri�i Yapt�n�z!!!" , MuhasebeProgrami.ucretHesapla(-4, 20));
		
		Assert.assertEquals( "Hatal� De�er Giri�i Yapt�n�z!!!" , MuhasebeProgrami.ucretHesapla(5, -30));
		
		
	}
	
	

}
