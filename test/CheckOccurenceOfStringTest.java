import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckOccurenceOfStringTest {
         CheckOccurenceOfString test;
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
            test=new CheckOccurenceOfString();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcase to count whether occurence os string is more than 2 or not*/
        @Test
        public void countNum_GivenaString_ShouldReturnMapContainingCountOfaNumbers()
        {

            assertEquals(new HashMap<String,Boolean>(){{{{put("a",true);put("b",false);put("c",true);put("d",false);}}}},test.checkString(new String[]{"a","b","c","d","a","a","c"}));
        }
        /*Testcase to input empty string and return emptymap*/
        @Test
        public void countNum_GivenaString_ShouldReturnMapContainingCountOfaNumbers1()
        {
        assertEquals(new HashMap<String,Boolean>(),test.checkString(new String[]{}));
        }



}