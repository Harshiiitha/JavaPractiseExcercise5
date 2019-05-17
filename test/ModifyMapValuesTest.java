import org.junit.*;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ModifyMapValuesTest {

    ModifyMapValues test;

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
            test=new ModifyMapValues();

            System.out.println("Inside Before");

        }

        @After
        public void tearDown()
        {
            //arrange
            test=null;

            System.out.println("Inside After");

        }

        /*Testcases to modify values in given map and return map*/
        @Test
        public void modifyMap_GivenaMapOfTwoKeyPairValues_ShouldReturnMapWithModifiedValues()
        {

            assertEquals(new HashMap<String,String>(){{put("val1","");put("val2","java");}},test.modifyMap(new HashMap<String,String>(){{put("val1","java");put("val2","c++");}}));
        }
        @Test
        public void modifyMap_GivenaMapOfTwoKeyPairValues_ShouldReturnMapWithModifiedValues1()
       {

        assertEquals(new HashMap<String,String>(){{put("val1","");put("val2","mars");}},test.modifyMap(new HashMap<String,String>(){{put("val1","mars");put("val2","saturn");}}));
       }


}