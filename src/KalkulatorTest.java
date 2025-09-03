import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testDodajJezeliLiczbyCalkowite() {
        Assertions.assertEquals(3,Kalkulator.dodaj(2,1));
    }
    @Test
    void testMetodyDodajJezezliLiczbyDodawaneRzeczywsite(){
        Assertions.assertEquals(3.4,Kalkulator.dodaj(2,1.4));
    }
    @Test
    void testPodzielJezeliLiczbyCalkowitewynik(){
        Assertions.assertEquals(3,Kalkulator.Podziel(6,2));
    }
    @Test
    void testPodzielJezeliLiczbyCalkowitewynikRzeczywsity(){
        Assertions.assertEquals(3.5,Kalkulator.Podziel(7,2));
    }
}