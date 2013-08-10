package br.com.systextil.siemenscellphone;

import java.util.HashMap;
import java.util.Map;

public class SiemensCellPhone {
	public Map<Character, String> mapaLetraNumeros = new HashMap<Character, String>();
	{
		mapaLetraNumeros.put('a', "2");
		mapaLetraNumeros.put('b', "22");
		mapaLetraNumeros.put('c', "222");
		mapaLetraNumeros.put('d', "3");
		mapaLetraNumeros.put('e', "33");
		mapaLetraNumeros.put('f', "333");
		mapaLetraNumeros.put('g', "4");
		mapaLetraNumeros.put('h', "44");
		mapaLetraNumeros.put('i', "444");
		mapaLetraNumeros.put('j', "5");
		mapaLetraNumeros.put('k', "55");
		mapaLetraNumeros.put('l', "555");
		mapaLetraNumeros.put('m', "6");
		mapaLetraNumeros.put('n', "66");
		mapaLetraNumeros.put('o', "666");
		mapaLetraNumeros.put('p', "7");
		mapaLetraNumeros.put('q', "77");
		mapaLetraNumeros.put('r', "777");
		mapaLetraNumeros.put('s', "7777");
		mapaLetraNumeros.put('t', "8");
		mapaLetraNumeros.put('u', "88");
		mapaLetraNumeros.put('v', "888");
		mapaLetraNumeros.put('w', "9");
		mapaLetraNumeros.put('x', "99");
		mapaLetraNumeros.put('y', "999");
		mapaLetraNumeros.put('z', "9999");
		mapaLetraNumeros.put(' ', "0");
	}

	public String encode(String inputText) {
		
		MyBuilder builder = new MyBuilder();
		char[] chars = inputText.toLowerCase().toCharArray();
		for (char letra : chars) {
			builder.append(mapaLetraNumeros.get(letra));
		}
		return builder.toString();
	}
	
	private static class MyBuilder {
		private final StringBuilder sb = new StringBuilder();
		private void append(String s) {
			if(isMesmoNumero(sb, s))
				sb.append("_");
			sb.append(s);
		}

		private boolean isMesmoNumero(StringBuilder builder, String numero) {
			return builder.toString().endsWith(numero.substring(0,1));
		}

		@Override
		public String toString() {
			return sb.toString();
		}
		
	
	}

}
