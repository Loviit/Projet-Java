package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <h1>The test for example.</h1>
 * 
 * @author Alyssa BINARD
 * @version 1.0
 * @see assertEquals
 * @see After
 * @see AfterClass
 * @see Before
 * @see BeforeClass
 * @see Test
 */
public class ExampleTest {
	/** The exemple */
    private Example example;
    
    /**
     * setUpBeforceclass
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
	 * tearDownAfterClass
	 * @throws Exception
	 */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * setUp
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.example = new Example(1, "Example test");
    }

    /**
     * tearDown
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of GetID.
     */
    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.example.getId());
    }

    /**
     * test of GetName.
     */
    @Test
    public void testGetName() {
        final String expected = "Example test";
        assertEquals(expected, this.example.getName());
    }

    /**
     * Test of SetName
     */
    @Test
    public void testSetName() {
        String expected = "Example test";
        assertEquals(expected, this.example.getName());
        expected = "Example test modified";
        this.example.setName(expected);
        assertEquals(expected, this.example.getName());
    }

  /*  @Test
    public void testToString() {
        final String expected = "1 : Example test";
        assertEquals(expected, this.example.toString());
    }
    */

}
