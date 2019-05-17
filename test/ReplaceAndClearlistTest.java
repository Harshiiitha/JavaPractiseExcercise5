import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ReplaceAndClearlistTest {

    ReplaceAndClearlist test;

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
        test=new ReplaceAndClearlist();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        test=null;

        System.out.println("Inside After");

    }
    /*Testcase to replace string array with given strings*/
    @Test
    public void replaceList_GivenaList_ShouldReplaceList()
    {

        assertEquals(new ArrayList<String>(Arrays.asList("Kiwi","Grape","Melon","Berry")),test.replaceList(new ArrayList<String>(Arrays.asList("Apple","Grape","Mango","Berry")),new String[]{"Apple","Mango"},new String[]{"Kiwi","Melon"}));
    }
    /*Testcase to clear the list*/
    @Test
    public void clearList_GivenaList_ShouldReturnEmptyList()
    {

        assertEquals(new ArrayList<>(),test.clearList(new ArrayList<String>(Arrays.asList("Apple","Grape","Melon","Berry"))));
    }



}