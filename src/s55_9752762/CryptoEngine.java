package s55_9752762;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public abstract class CryptoEngine {
    private SecretKeySpec secretKeySpec;
    protected String cipherMethod;

    public String encrypt(String data) {
        // Verschluesseln
        try {
            Cipher cipher = Cipher.getInstance(cipherMethod);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            byte[] encrypted = cipher.doFinal(data.getBytes());
            // bytes zu Base64-String konvertieren (dient der Lesbarkeit)
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String decrypt(String data) {
        try {
            byte[] crypted2 = Base64.getDecoder().decode(data);
            Cipher cipher2 = Cipher.getInstance(cipherMethod);
            cipher2.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] cipherData2 = cipher2.doFinal(crypted2);
            return new String(cipherData2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    protected void setSecretKey() {
        try {
            String keyStr = "geheim!";
            byte[] key = (keyStr).getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKeySpec = new SecretKeySpec(key, cipherMethod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
