package blockchain;

import blockchain.Blockchain;

public class Main {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        blockchain.addBlock(0, blockchain.getPreviousBlock().getPreviousHash(), "test");
        System.out.println(blockchain.getBlockByIndex(1));
        System.out.println(blockchain.getPreviousBlock());
        System.out.println(blockchain.getChain());
    }
}