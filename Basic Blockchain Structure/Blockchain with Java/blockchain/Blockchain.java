package blockchain;

import java.util.ArrayList;
import java.util.Date;

public class Blockchain {
  
    private ArrayList<Block> chain;
    
    public Blockchain () {
        chain = new ArrayList<Block>();
        addBlock (1, "0", "0");
    }
  
    public ArrayList<Block> getChain() {
        return chain;
    }
    
    public Block CreateBlock (int nonce, String previousHash, String data) {
        Block block = new Block ( chain.size() + 1,
                                  new Date().toString(),
                                  nonce,
                                  data,
                                  previousHash );
        return block;
    }

    public void addBlock (Block block) {
        chain.add(block);
    }
    
    public void addBlock (int nonce, String previousHash, String data) {
        addBlock(CreateBlock(nonce, previousHash, data));
    }
}