package com.chaitu.games.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class GamesUtil {
	
	public static String generateQrCode() {
		return "QR Code";
	}
	
	public static String getEncodedPassword(String plainText) {
		return BCrypt.hashpw(plainText, BCrypt.gensalt());
	}
	
	public static boolean checkPassword(String password, String hashedPassword) {
		return BCrypt.checkpw(password, hashedPassword);
	}
}
