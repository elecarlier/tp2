import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void test(){
        Division D = new Division();
        assertEquals(1, D.divide(2, 1, 3));


    }
    @Test
    void test2(){
        Division D = new Division();
        assertEquals(1, D.divide(2, 3, 1));
    }
    @Test
    void test3(){
        Division D = new Division();
        assertEquals(2, D.divide(2, 1, 1));

    }
    @Test
    void test4(){
        Division D = new Division();
        assertEquals(-1, D.divide(7, 49, 23));

    }
}