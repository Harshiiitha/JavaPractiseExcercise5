import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class SortSetAndStoreInListTest {

    SortSetAndStoreInList test;

    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        test=new SortSetAndStoreInList();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        test=null;

        System.out.println("Inside After");

    }
    /*Testcase to store input in set,sort and store in arraylist*/
    @Test
    public void modifyMap_GivenaMapOfTwoKeyPairValues_ShouldReturnMapWithModifiedValues()
    {

        assertEquals(new ArrayList<String>(Arrays.asList("Alice","Bluto","Eugene","Harry","Olive")),test.sortSet(new TreeSet<String>(Arrays.asList("Harry","Olive","Alice","Bluto","Eugene"))));
    }
    /*Testcase to store input containing duplicate elements*/
    @Test
    public void modifyMap_GivenaMapOfTwoKeyPairValues_ShouldReturnMapWithModifiedValuesAndRemoveDuplicateValues()
    {

        assertEquals(new ArrayList<String>(Arrays.asList("Europe","France","India","Pakistan")),test.sortSet(new TreeSet<String>(Arrays.asList("Pakistan","India","France","India","Europe"))));
    }


}