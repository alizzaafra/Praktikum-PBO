/*
	  Vehicle.java 10/05/23
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : kelas yang berisi rumus untuk menghitung harga sewa kendaraan.
*/

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}
