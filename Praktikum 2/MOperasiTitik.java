/*
	  MOperasiTitik.java 01/03/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Kelas MOperasiTitik untuk memanggil operasi refleksiSumbuX yang bersifat private,
                dengan perantara operasi refleksiX
*/

class MOperasiTitik{
        public  static void main(String[]args){
                Titik t1 = new Titik();
                t1.setAbsis(5.0);
                t1.setOrdinat(3.0);
                OperasiTitik op = new OperasiTitik();

                System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

                op.refleksiX(t1);
                System.out.println("\nTitik setelah refleksi sumbu X");
                System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");

                op.refleksiY(t1);
                System.out.println("\nTitik setelah refleksi sumbu Y");
                System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        }
}

