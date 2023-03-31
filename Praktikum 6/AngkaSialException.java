/*   
          AngkaSialException.java 29/03/2023
          Nama      : Alizza Afra Afifah   
          NIM       : 24060121140135   
          Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
*/                                                           
  
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
