/*
          Asersi1.java 29/03/2023
          Nama      : Alizza Afra Afifah
          NIM       : 24060121140135
          Deskripsi : Program untuk demo asersi,
*/
public class Asersi1{
        public static void main(String[] args){
                int x=0;
                if(x>0){
                        System.out.println("x bilangan positif");
                        }
                else {
                        assert(x<0) : "ada kesalaham kode";
                        System.out.println("x bilangan negatif");
                }
        }
}
