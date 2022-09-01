package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue(){

        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }


    @Test
    public void characterAndBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse() {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode["));
    }

    @Test
    public void noLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launchcode"));
    }

    @Test
    public void noRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
    @Test
    public void tooManyCloseBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]Launchcode"));
    }
    @Test
    public void tooManyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]Launchcode"));
    }

}
