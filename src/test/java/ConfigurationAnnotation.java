import org.testng.annotations.*;

public class ConfigurationAnnotation {

    /* 1. Execute all @Before you have */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Chrome - Set Up System Property");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Open Chrome");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Open Test Application");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Sign-in");
    }

    /* 2. Execute all @Test you have after all @Before you have */

    @Test
    public void searchCustomer(){
        System.out.println("Search for Customer");
    }

    @Test
    public void searchProduct(){
        System.out.println("Search for Product");
    }

    /* Finally execute all @After you have */

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sign-out");
    }


    @AfterClass
    public void afterClass() {
        System.out.println("Close Test Application");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Close Chrome");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Chrome - Clean Up All Cookies");
    }
}