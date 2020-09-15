package blockchain;

import java.util.ArrayList;
import java.util.Date;
import blockchain.Block;

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
  
  public Block getBlockByIndex(int index) {
      try {
          return chain.get(index - 1);
      } catch (Exception exception) {
          System.err.println("Error : " + exception);
          return null;
      }
  }
  
  public Block getPreviousBlock(){
      return chain.get(chain.size() - 1);
  }
}