package s55_9752762;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class AESCryptoEngine extends CryptoEngine {
    AESCryptoEngine() {
        this.cipherMethod = "AES";
        setSecretKey();
    }
}
