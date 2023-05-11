/*
	  Car.java 10/05/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Kelas yang berisi atribut dan metode dari sub kelas Car
*/


public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
