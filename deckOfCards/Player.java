package com.bl.deckOfCards;

public class Player {
    int cardCount;
    Card[] playerHand = new Card[cardCount];

    Player(int cardCount) {
        this.cardCount = cardCount;
    }
}
