import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static javax.swing.UIManager.put;
import static org.junit.Assert.*;

public class NumberOfCountsTest {

    NumberOfCounts test;

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
            test=new NumberOfCounts();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }
        /*Testcases to find the number of counts*/
        @Test
        public void countNum_GivenaString_ShouldReturnMapContainingCountOfaNumbers()
        {

            assertEquals(new HashMap<String,Integer>(){{{{put("one",4);put("two",2);put("three",2);put("nine",1);}}}},test.countNum("one nine one two three one three one two"));
        }
        @Test
        public void countNum_GivenaString_ShouldReturnMapContainingCountOfaNumbers1()
        {

        assertEquals(new HashMap<String,Integer>(){{{{put("one",5);put("two",2);put("three",2);}}}},test.countNum("one one -one___two,,three,one @three*one?two"));
        }
        /*Testcase for input without numbers*/
        @Test
        public void countNum_GivenaStringwithoutNums_ShouldReturnEmptyMap()
        {

        assertEquals(new HashMap<String,Integer>(),test.countNum("immersive full stack development"));
        }
    }

