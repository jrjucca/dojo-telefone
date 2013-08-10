package br.com.systextil.siemenscellphone;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SiemensCellPhoneTest {
	@Test
	public void testeUsabilidade() {
		String inputText = "SEMPRE ACESSO O DOJOPUZZLES";
		
		SiemensCellPhone cellPhone = new SiemensCellPhone();
		
		String outputText = cellPhone.encode(inputText);
		System.out.print(outputText);
		assertEquals("77773367_7773302_222337777_777766606660366656667889999_9999555337777", outputText);
	}

}
