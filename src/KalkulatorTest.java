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
    @Test
    void czyPierwsza1(){
        Assertions.assertEquals(false,Kalkulator.czyLiczbaPierwsz(1));
    }
    @Test
    void czyPierwsza2(){
        Assertions.assertEquals(true,Kalkulator.czyLiczbaPierwsz(2));
    }
    @Test
    void czyPierwsza3(){
        Assertions.assertEquals(true,Kalkulator.czyLiczbaPierwsz(3));
    }
    @Test
    void czyPierwsza17(){
        Assertions.assertEquals(true,Kalkulator.czyLiczbaPierwsz(17));
    }
    @Test
    void czyPierwsza25(){
        Assertions.assertEquals(false,Kalkulator.czyLiczbaPierwsz(25));
    }
    @Test
    void czyPierwsza10(){
        Assertions.assertEquals(false,Kalkulator.czyLiczbaPierwsz(10));
    }
    @Test
    void potegowanieGdyPotegowana0(){
        Assertions.assertEquals(1,Kalkulator.potega(1,0));
    }
    @Test
    void potegowanie0(){
        Assertions.assertEquals(0,Kalkulator.potega(0,1));
    }
    @Test
    void potegowanieMinus2(){
        Assertions.assertEquals(0.25,Kalkulator.potega(2,-2));
    }
    @Test
    void potegowanieObaPlusy(){
        Assertions.assertEquals(4,Kalkulator.potega(2,2));
    }
    @Test
    void potegowanieObaMinusyParzysta(){
        Assertions.assertEquals(0.25,Kalkulator.potega(-2,-2));
    }
    @Test
    void potegowanieObaMinusyNieParzysta(){
        Assertions.assertEquals(-0.125,Kalkulator.potega(-2,-3));
    }
}