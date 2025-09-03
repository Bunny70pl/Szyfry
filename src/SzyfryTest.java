import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrCzearaJezezliKlucz0() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("ABC",0));
    }
    @Test
    void szyfrCzearaMniejszyOdDlugoAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }
    @Test
    void szyfrCzearaJezeliKluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",81));
    }
    @Test
    void szyfrCzearaJezeliKluczUjemny() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCzearaJezezliBezZawijaniaWierszy3(){
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("XYZ",3));
    }
    @Test
    void szyfrCzearaJezezliZZawijaniaWierszy3(){
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("XYZ",3));
    }
    @Test
    void szyfrCzearaJezezliKlucz0SCII() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("ABC",0));
    }
    @Test
    void szyfrCzearaMniejszyOdDlugoAlfabetuSCII() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }
    @Test
    void szyfrCzearaJezeliKluczWiekszyNizDlugoscAlfabetuSCII() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",81));
    }
    @Test
    void szyfrCzearaJezeliKluczUjemnySCII() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCzearaJezezliBezZawijaniaWierszy3SCII(){
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("XYZ",3));
    }
    @Test
    void szyfrCzearaJezezliZZawijaniaWierszy3ASCII(){
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("XYZ",3));
    }
}