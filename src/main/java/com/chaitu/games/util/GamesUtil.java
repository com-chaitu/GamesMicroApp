package com.chaitu.games.util;


public class GamesUtil {
	
	public static String generateQrCode() {
		return "QR Code";
	}
	
	public static String getEncodedPassword(String plainText) {
		//return BCrypt.hashpw(plainText, BCrypt.gensalt());
		return plainText;
	}
	
	public static boolean checkPassword(String password, String hashedPassword) {
		//return BCrypt.checkpw(password, hashedPassword);
		return true;
	}
}
