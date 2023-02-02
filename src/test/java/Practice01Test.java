
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class Practice01Test {

    //Task-1: Her bir testten önce Practice01 classından obje oluşturup, testten sonra null a set ediniz.
    public static Practice01 object;
    //    @BeforeEach
//    public void beforeEach(){
//        object=new Practice01();
//        System.out.println("beforeeach çalıştı.");
//    }
//    @AfterEach
//    public void afterEach(){
//        object=null;
//        System.out.println("aftereach çalıştı.");
//    }
    //Task-2-a:Practice01 classının Hypotenuse Metodunu pozitif senaryo ile test ediniz.->5,12->13
    //Task-2-b:Practice01 classının Hypotenuse Metodunu negatif senaryo ile test ediniz.->5,12->17
    @Test
    @DisplayName("Hypotenuse Metodunun Testi")
    public void testHypotenuse(TestInfo info){
        double act=object.hypotenuse(5,12);
        double exp=13;
        double notExp=17;
        assertEquals(exp,act);
        assertNotEquals(notExp,act);
        System.out.println(info.getDisplayName()+" çalıştı.");
    }
    //Task-3:Testin ismini değiştiriniz.
    //Task-4:Testin ismini konsolda yazdırınız.
    //Task-5: tüm testlerde kullanmak üzere Practice01 classından obje oluşturup, kullanımı bitince null a set ediniz.
    @BeforeAll
    public static void beforeAll(){
        object=new Practice01();
        System.out.println("beforeAll çalıştı.");
    }
    @AfterAll
    public static void afterAll(){
        object=null;
        System.out.println("afterAll çalıştı.");
    }
    //Task-6-a:Practice01 classının IsPalindrom Metodunu pozitif senaryo ile test ediniz.
    //Task-6-b:Practice01 classının IsPalindrom Metodunu negatif senaryo ile test ediniz.
    @Test
    public void testIsPalindrom(TestInfo info){
        assertTrue(object.isPalindrom("kayak"));
        assertFalse(object.isPalindrom("palindrom"));
        System.out.println(info.getDisplayName()+" çalıştı.");
    }
    //Task-7:Practice01 classının Factorial metodunu 0,1,3 parametreleri için test ediniz.
    //negatif parametre verirsek? Az sonra.....
    @Test
    public void testFactorial(TestInfo info){
        assertEquals(1,object.factorial(0));
        assertEquals(1,object.factorial(1));
        assertEquals(6,object.factorial(3));
        // assertTrue(object.factorial(1)==1);
        System.out.println(info.getDisplayName()+" çalıştı.");
    }

}
