/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HelloGradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testIsInSelections() {
        Library classUnderTest = new Library("test library");
        assertTrue("Science should be in library's selection", classUnderTest.isInSelection("Science"));
        assertTrue("Children should be in library's selection", classUnderTest.isInSelection("children"));
        assertFalse("Drama should not be in library's selection", classUnderTest.isInSelection("Drama"));
    }
}
