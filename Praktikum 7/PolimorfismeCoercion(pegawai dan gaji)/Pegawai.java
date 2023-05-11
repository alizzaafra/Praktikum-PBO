/*
	  Pegawai.java 10/05/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Superclass yang akan diturunkan ke kelas Manajer dan Pegawai
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        // cara 1
        // System.out.println("Nama : " + this.nama + ", Gaji Pokok : " +
        // this.gajiPokok);
        // cara 2
        System.out.printf("Nama : %s, Gaji pokok : %d \n", nama, gajiPokok);
    }
}
