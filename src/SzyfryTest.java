import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void szyfrCezaraJezeliKlucz0() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("ABC",0));
    }
    @Test
    void szyfrCezaraJezeliKluczMniejszodDlugosciAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }

    @Test
    void szyfrCezaraJezeliKluczWiekszyNizDlugoscAlfabetu() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",81));
    }
    @Test
    void szyfrCezaraJezeliKluczUjemny() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("DEF",-3));
    }
    @Test
    void szyfrCezaraJezeliBezZawijaniaWierszyKlucz3() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCezara("ABC",3));
    }
    @Test
    void szyfrCezaraJezeliZZawijaniemWierszyKlucz3() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCezara("XYZ",3));
    }
    @Test
    void szyfrCezaraJezeliKlucz0ASCII() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCzearaASCII("ABC",0));
    }
    @Test
    void szyfrCezaraJezeliKluczMniejszodDlugosciAlfabetuASCII() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCzearaASCII("ABC",3));
    }

    @Test
    void szyfrCezaraJezeliKluczWiekszyNizDlugoscAlfabetuASCII() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCzearaASCII("ABC",81));
    }
    @Test
    void szyfrCezaraJezeliKluczUjemnyASCII() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCzearaASCII("DEF",-3));
    }
    @Test
    void szyfrCezaraJezeliBezZawijaniaWierszyKlucz3ASCII() {
        Assertions.assertEquals("DEF",Szyfry.szyfrCzearaASCII("ABC",3));
    }
    @Test
    void szyfrCezaraJezeliZZawijaniemWierszyKlucz3ASCII() {
        Assertions.assertEquals("ABC",Szyfry.szyfrCzearaASCII("XYZ",3));
    }
    @Test
    void szyfrKwadratowyPotegaLiczby(){
        Assertions.assertEquals("peis",Szyfry.szyfrKwadratu("pies"));
    }
    @Test
    void szyfrKwadratowyLiczbaMniejszaOdPotegiZPustymWierszem(){
        Assertions.assertEquals("prs rat oma gi",Szyfry.szyfrKwadratu("programista"));
    }
    @Test
    void szyfrKwadratowyLiczbaMniejszaOdPotegibezPustegoWiersza(){
        Assertions.assertEquals("crayy tn",Szyfry.szyfrKwadratu("cytryna"));
    }
    @Test
    void szyfrPlotkowyProgramista(){
        Assertions.assertEquals("omargaitprs",Szyfry.szyfrPlotkowy("programista",3));
    }
    @Test
    void szyfrPlotkowyPies(){
        Assertions.assertEquals("eisp",Szyfry.szyfrPlotkowy("pies",3));
    }
}