package com.codebind;
import org.apache.commons.codec.binary.*;

public class App {
	String regularText = "This is a regular text!";
	Base64 base64=new Base64();
	String encodedText= new String(base64.encode(regularText.getBytes()));
	String decodedText= new String(base64.decode(encodedText.getBytes()));
	
	public String getRegularText() {
		return regularText;
	}
	public String getEncodedText() {
		return encodedText;
	}
	public String getDecodedText() {
		return decodedText;
	}
	
	public static void main(String[] args) {
		App newApp = new App();
		
		System.out.println("Original: "+newApp.getRegularText());
		System.out.println("Encoded (Base64): "+newApp.getEncodedText());
		System.out.println("Decoded (Base64): "+newApp.getDecodedText());
	}
}
