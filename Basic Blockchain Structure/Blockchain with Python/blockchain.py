# Importing essential libraries
import datetime

# Class that shapes a blockchain object
class Blockchain:
  
  # The chain starts with the genesis block (first of all blocks, or root block),
  # with nonce 1 and root hash '0', by default.
  def __init__(self):
    self.chain = []
    self.create_block(nonce = 1, previous_hash = '0')

  def create_block(self, nonce, previous_hash, data):
    block = {'index': len(self.chain) + 1,
             'timestamp': str(datetime.datetime.now()),
             'nonce': nonce,
             'data': data,
             'previous_hash': previous_hash}
    self.chain.append(block)
    return block
