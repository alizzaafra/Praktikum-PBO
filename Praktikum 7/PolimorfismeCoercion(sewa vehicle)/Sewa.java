 /*
	  Sewa.java 10/05/23
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Main file untuk vehicle, bus, dan car.
*/


public class Sewa {

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}

// javac -cp "." Sewa.javac
// java -cp "." Sewa
