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
    public void oneSetBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wrongOrderBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oneBracketOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void wrongNestedBracketInputStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void matchingBracketsThenCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringIsInsideBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

}
