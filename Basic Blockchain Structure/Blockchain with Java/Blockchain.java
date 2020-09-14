import java.util.Date;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

private class Block {
  private final int index;
  private String timestamp;
  private int nonce;
  private String data;
  private String previousHash;
  
  public Block (int index, String timestamp, int nonce, String data, String previousHash) {
    this.index = index;
    this.timestamp = timestamp;
    this.nonce = nonce;
    this.data = data;
    this.previousHash = previousHash;
  }
}

public class Blockchain {
  
  private ArrayList<Block> chain;
  
  public Blockchain () {
    CreateBlock (1, "0", "Algumas Transações");
  }
  
  public Block CreateBlock (int nonce, String previousHash, String data) {
    Block block = new Block ( this.chain.size() + 1,
                              new Date().toString(),
                              nonce,
                              data,
                              previousHash );
    
    this.chain.add(block);
    return block;
  }
}
