public class Szyfry {
    public static String szyfrCezara(String slowo,int klucz){
        String zaszyfrowane = "";
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetPrzesuniety = "";
        if(klucz>0) {
            klucz = klucz % 26;

            alfabetPrzesuniety = alfabet.substring(klucz, alfabet.length()) + alfabet.substring(0, klucz);
        }
        else {
            klucz = klucz*-1;
            klucz = klucz % 26;

            alfabetPrzesuniety = alfabet.substring(alfabet.length()-klucz,alfabet.length()) + alfabet.substring(0, alfabet.length()-klucz);
        }
        int kod = 0;
        for (int i = 0; i < slowo.length(); i++) {
            kod = alfabet.indexOf(slowo.charAt(i));
            zaszyfrowane = zaszyfrowane + alfabetPrzesuniety.charAt(kod);
        }

        return zaszyfrowane;
    }
    public static String szyfrCzearaASCII(String slowo,int klucz){
        String zaszyfrowane = "";
        klucz =klucz% 26;
        for (int i = 0; i < slowo.length(); i++) {

            int kodLitery = (int)slowo.charAt(i)+klucz;
            if(kodLitery > (int) 'Z'){
                kodLitery =kodLitery - 26;
            }
            if(kodLitery < (int) 'A'){
                kodLitery = kodLitery + 26;
            }
            char litera = (char)kodLitery;
            zaszyfrowane += litera;
        }
        return zaszyfrowane;
    }
    public static String szyfrKwadratu(String slowo){
        String zaszyfrowane = "";
        int bok = 0;
        while(bok * bok < slowo.length()){
            bok++;
        }
        while(bok*bok>slowo.length()){
            slowo += " ";
        }
        for (int i = 0; i < bok; i++) {
            for (int j = i; j < slowo.length(); j+=bok) {
                zaszyfrowane += slowo.charAt(j);
            }
        }

        return zaszyfrowane.trim();
    }
    public static String szyfrPlotkowy(String slowo,int plotek){
        String zaszyfrowane = "";
        for (int i = 0; i < slowo.length(); i++) {
            for (int j = slowo.length() -1 ;j > 0; j-= plotek) {
                System.out.println(slowo.charAt(j));
                zaszyfrowane += slowo.charAt(j);
            }
        }
        System.out.println(zaszyfrowane);
        return zaszyfrowane;
    }
}
