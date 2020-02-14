package s55_9752762;

public class DESCryptoEngine extends CryptoEngine {
    DESCryptoEngine() {
        this.cipherMethod = "DES";
        setSecretKey();
    }
}
