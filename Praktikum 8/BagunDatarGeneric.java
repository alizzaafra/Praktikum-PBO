/**
 * File : BangunDatarGeneric.java
 * Penulis : Alizza Afra Afifah / 24060121140135
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

 public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
 }

 /*
  pertanyaan:
  Simpulkan apa yang terjadi ketika mengganti ‘T’ (dan segala T) pada BangunDatarGeneric.java 
  dengan karakter yang lain seperti, T1,T2,T1234. 

  jawaban:
  Tidak terjadi perubahan maupun masalah pada code, code tetap dapat berjalan dengan baik
  tanpa ada error. 
 */
