package io.zipcoder.casino.blackjack;

import io.zipcoder.casino.dealer.CardDealer;

public class BlackJackDealer extends CardDealer {

    BlackJackHand blackJackHand;

    public BlackJackDealer() {
        this.blackJackHand = new BlackJackHand();
    }

    public BlackJackHand getBlackJackHand() {
        return blackJackHand;
    }

}
