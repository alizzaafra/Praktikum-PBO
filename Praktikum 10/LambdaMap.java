/* 
* Nama File: LambdaHashmap.java 
* Pembuat: Alizza Afra Afifah - 24060121140135
* Deskripsi: Implementasi lambda pada hash map
* Lab: B2
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140111", "Afra");
        mahasiswaMap.put("24060121140112", "Icik");
        mahasiswaMap.put( "24060121140113", "Ocha");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " +nim+ ", Nama: " +nama));
    }
}