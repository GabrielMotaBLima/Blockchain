package blockchain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SHA256 {
  static String sha256(String input) throws NoSuchAlgorithmException {
    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
    byte[] result = messageDigest.digest(input.getBytes());
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < result.length; i++) {
      sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
    }
     
    return sb.toString();
  }
}