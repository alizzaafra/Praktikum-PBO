/*
          Asersi2.java 29/03/2023
          Nama      : Alizza Afra Afifah
          NIM       : 24060121140135
          Deskripsi : Program untuk demo asersi,
              yang akan menolak input jari-jari lingkaran yang bernilai nol
*/
//class Lingkaran
class Lingkaran{
        private double jariJari;
        public Lingkaran(double jariJari){
                this.jariJari = jariJari;
        }
        public double hitungKeliling(){
                double keliling = 2*Math.PI*jariJari;
                return keliling;
        }
}
//class Asersi2
public class Asersi2{
        public static void main (String[] args){
                double jariJari = 1.0;
                assert(jariJari>0) : "jari jari harus lebih besar dari nol!!!";
                Lingkaran l = new Lingkaran(jariJari);
                double kelilingLingkaran = l.hitungKeliling();
                System.out.println("keliling lingkaran = " +kelilingLingkaran);
        }
}

/*
Pertanyaan : Apa yang kurang tepat dari program tsb?
Jawaban : sebelumnya, program di atas kurang tepat karena nilai jari-jari lingkaran diinisialisasi dengan nol, lalu
diikuti dengan asersi yang memeriksa apakah jari-jari tersebut lebih besar dari nol. Karena jari-jari
memiliki nilai nol, maka asersi akan gagal dan program akan berhenti di sana.
disini, nilai jari-jari harus diinisialisasi dengan nilai yang lebih besar dari nol untuk memastikan bahwa
asersi berhasil. Contohnya, saya inisialisasi dengan 1.0.
*/
      
