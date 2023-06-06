/* 
* Nama File: Lambdalist.java 
* Pembuat: Alizza Afra Afifah - 24060121140135
* Deskripsi: Implementasi lambda pada list, digunakan sebagai parameter pada method
* Lab: B2
*/

 import java.util.ArrayList;

 public class LambdaList {
     public static void main(String[] args) {
         ArrayList<String> mahasiswaList = new ArrayList<>();
         mahasiswaList.add("Alizza");
         mahasiswaList.add("Afra");
         mahasiswaList.add("Afifah");
         mahasiswaList.add("Ameera");
 
         //lambda digunakan sebagai parameter pada method
         mahasiswaList.forEach((nama) -> System.out.println(nama));
     }
 }