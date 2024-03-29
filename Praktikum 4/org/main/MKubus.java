/*
	  MKubus.java 22/03/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Main dari kubus
*/
  
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
              BujurSangkar bujurSangkar = new BujurSangkar(4);
              Kubus kubus = new Kubus (bujurSangkar);

              System.out.println("Kubus dengan panjang sisi : " + bujurSangkar.getPanjangSisi());
	      System.out.println("Luas alas Kubus : " + kubus.hitungLuasAlas());
       	      System.out.println("Volume Kubus : "+ kubus.hitungVolume());
        }
}
