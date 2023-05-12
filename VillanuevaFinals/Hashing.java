package VillanuevaFinals;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Scanner;
// A Java program that uses the SHA-256 to do the hashing  
public class Hashing {
	public static String getSHA(String input) {
		try {
			// invoking the static getInstance() method of the MessageDigest class  
			// Notice it has SHA-256 in its parameter.  
			MessageDigest msgDst = MessageDigest.getInstance("SHA-256");
			// the digest() method is invoked to compute the message digest  
			// from an input digest() and it returns an array of byte  
			byte[] msgArr = msgDst.digest(input.getBytes());
			// getting signum representation from byte array msgArr  
			BigInteger bi = new BigInteger(1, msgArr);
			// Converting into hex value  
			String hshtxt = bi.toString(16);

			while (hshtxt.length() < 64) {
				hshtxt = "0" + hshtxt;
			}
			return hshtxt;
		}
		// for handling the exception   
		catch (NoSuchAlgorithmException abc) {
			throw new RuntimeException(abc);
		}
	}
	// main method code  
	public static void main(String args[]) throws NoSuchAlgorithmException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Account Login");
		System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
		String hash = getSHA(password);
		String str = name;
		System.out.println("The HashCode Generated for User " + str + " is: \n" + hash);
		System.out.println("Have a Nice Day! ");
		
		scanner.close();
	}
}