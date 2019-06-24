package org.java.interview.codes;

public class VowelsConsonents {

	public static void main(String[] args) {
		String name = "madam";
		char[] ch = name.toCharArray();
		int vCount = 0,vCons=0;
		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				vCount++;
			}else {
				vCons++;
			}
		}
		System.out.println("Vowel Count\n"+vCount);
		System.out.println("Vowel Count\n"+vCons);
		
		//print the vowels and consonents
		String nameCheck="Fernandez",vow="",cons="";
		char[] nch = nameCheck.toCharArray();
		for (char c : nch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				vow=vow+c;
			}else {
				cons=cons+c;
			}
		}
		System.out.println("vowels are\n"+vow);
		System.out.println("consonants are\n"+cons);
	}

}
