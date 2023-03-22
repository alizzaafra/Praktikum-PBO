/*
	  BujurSangkar.java 22/03/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : Representasi  dari objek bujur sangkar
*/
  
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
       private double panjangSisi;

       public BujurSangkar (double panjangSisi) {
              this.panjangSisi = panjangSisi;
              this.jumlahSisi = 4;
      
       }

       public double hitunganLuas () {
              return this.panjangSisi * this.panjangSisi;

       }

       public double getPanjangSisi() {
              return this.panjangSisi;

       }
