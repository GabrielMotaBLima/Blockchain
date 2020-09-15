package blockchain;

class Block {
  private final int index;
  private String timestamp;
  private int nonce;
  private String data;
  private String previousHash;

  Block (int index, String timestamp, int nonce, String data, String previousHash) {
    this.index = index;
    this.timestamp = timestamp;
    this.nonce = nonce;
    this.data = data;
    this.previousHash = previousHash;
  }
  
  int getIndex() {
    return index;
  }
  String getTimestamp() {
    return timestamp;
  }

  void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  int getNonce() {
    return nonce;
  }

  void setNonce(int nonce) {
    this.nonce = nonce;
  }

  String getData() {
    return data;
  }

  void setData(String data) {
    this.data = data;
  }

  String getPreviousHash() {
    return previousHash;
  }

  void setPreviousHash(String previousHash) {
    this.previousHash = previousHash;
  }
}
