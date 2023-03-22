/*
	  Kubus.java 22/03/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Representasi  dari objek kubus
*/
  
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
       private BujurSangkar permukaan;

       public Kubus (BujurSangkar permukaan) {
              this.permukaan = permukaan;
       }
    
       public double hitungLuasAlas() {
              return this.permukaan.hitungLuas();
       }

       public double hitungVolume() {
              return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
       }

 }
