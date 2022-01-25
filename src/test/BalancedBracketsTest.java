package test;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void balancedBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[Launch]"));
    }
    @Test
    public void unBalancedBrackets() {
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("[go"));
    }
    @Test
    public void nullString(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets(" "));
    }
    @Test
    public void string(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("String"));
    }
    @Test
    public void doubleBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[[double]]"));
    }
    @Test
    public void midBrackets(){
        assertFalse(main.BalancedBrackets.hasBalancedBrackets("lau[nch"));
    }
    @Test
    public void nonStringChar(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[this + that] "));
    }
    @Test
    public void invertedBracket() {
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("] not ok["));
    }
    @Test
    public void bracket(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[]"));
    }
//    @Test
//    public void charOnly(){
//        assertFalse(main.BalancedBrackets.hasBalancedBrackets("asl");
//    }
@Test
    public void singleBrackets(){
        assertTrue(main.BalancedBrackets.hasBalancedBrackets("[Being single]"));
}



}
