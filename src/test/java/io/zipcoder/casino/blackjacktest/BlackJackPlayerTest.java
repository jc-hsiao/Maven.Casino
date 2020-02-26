package io.zipcoder.casino.blackjacktest;
import io.zipcoder.casino.blackJack.BlackJackPlayer;
import io.zipcoder.casino.player.Player;
import org.junit.Assert;
import org.junit.Test;

public class BlackJackPlayerTest {

    @Test
    public void constructorTest(){
        Player p = new Player(10, "Apollo", 100, false);
        BlackJackPlayer gfp = new BlackJackPlayer(p);

        String actualName = gfp.getPlayerData().getName();
        String expectedName = "Apollo";

        Assert.assertEquals( expectedName, actualName );
    }

    @Test
    public void getPlayerData(){
        Player p = new Player(10, "Apollo", 100, false);
        BlackJackPlayer gfp = new BlackJackPlayer(p);

        String actualName = gfp.getPlayerData().getName();
        int actualId = gfp.getPlayerData().getId();
        String expectedName = "Apollo";
        int expectedId = 10;

        Assert.assertEquals( expectedName, actualName );
        Assert.assertEquals( expectedId, actualId );
    }

    @Test
    public void placeBetTest(){
        Player p = new Player(10, "Apollo", 100, false);
        BlackJackPlayer gfp = new BlackJackPlayer(p);
        gfp.placeBet(60);
        int actualMoney = p.getPlayerFunds();

        Assert.assertEquals(40,actualMoney);
    }

    @Test
    public void payOutTest(){
        Player p = new Player(10, "Apollo", 100, false);
        BlackJackPlayer gfp = new BlackJackPlayer(p);
        gfp.placeBet(20);
        int actualMoney = p.getPlayerFunds();

        Assert.assertEquals(80,actualMoney);
    }

}
