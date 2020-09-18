#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <jansson.h> // I hasn't been tested Jansson Library yet

typedef struct block {
  const int index;
  char * timestamp;
  int nonce;
  char * data;
  char * previous_hash;
} Block;

typedef struct blockchain {
	const int index;
	Block * block;
} Blockchain;
