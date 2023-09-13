package PasswordEncryption;

import java.util.Base64;

public class EncryptDecrypt {

	public static void main(String[] args) {
	
		String Password = "Bighnesh@1231";
		byte[] encrypt= Base64.getEncoder().encode(Password.getBytes());
		System.out.println("Encrypted Password is  "+new String(encrypt));
		
		byte[] decrypt= Base64.getDecoder().decode(encrypt);
		System.out.println("Encrypted Password is  "+new String(decrypt));

	}

}
