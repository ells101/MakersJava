/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pricedisplay;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("App should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void appDisplaysItemWithPrice() {
        App classUnderTest = new App();
        assertEquals("App returns item with price", String.valueOf("The price for item: apple is 1"), 
        classUnderTest.getPriceLabel("apple", 1));
    }
}