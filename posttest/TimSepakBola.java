/*
	  TimSepakBola.java 15/03/2023
	  Nama      : Alizza Afra Afifah
	  NIM       : 24060121140135
	  Deskripsi : class untuk TimSepakBola
*/
  
class TimSepakbola {

  // Assume there are only 2 teams using this class!

  // Attribute
  String nama;
  int skor;
  boolean isOnMatch;

  // Default constructor
  TimSepakbola() {
    nama = "[NAMA]";
    skor = 0;
    isOnMatch = false;
  }

  // TimSepakbola(nama: string)
  // overloading constructor

  public TimSepakbola(String nama, int skor, boolean isOnMatch) {
    this.nama = nama;
    this.skor = skor;
    this.isOnMatch = isOnMatch;
}
  
  void startTandingBola(TimSepakbola lawan) {
    // DO NOT change both if conditions
    if (Boolean.TRUE.equals(this.isOnMatch)) {
      System.out.println("Tim " + this.nama + " sedang dalam pertandingan!");
      return;
    }

    if (Boolean.TRUE.equals(lawan.isOnMatch)) {
      System.out.println("Lawan sedang dalam pertandingan!");
      return;
    }

    System.out.println(
      "Pertandingan antara " + this.nama + " dan " + lawan.getNama() + " dimulai!\n"
    );
    this.setIsOnMatch(true);
    lawan.setIsOnMatch(true);
  }



  // goal() method. Skor will be added by 1 for every single goal from the team
  void goal() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return;
    }

    this.skor++;
    System.out.println("Tim " + this.nama + " mencetak gol! Skor: " + this.skor);
}

  // getSkor() method. This is a selector to get the score for a team
  int getSkor() {
    // DO NOT change the if condition
    if (Boolean.FALSE.equals(this.isOnMatch)) {
      System.out.println(
        "Tim " + this.nama + " TIDAK sedang dalam pertandingan!"
      );
      return 0;
    }

    return this.skor;
}


  // setIsOnMatch() method. This is a mutator to set a new boolean value for isOnMatch
  void setIsOnMatch(boolean onMatch) {
    this.isOnMatch = onMatch;
  }


  void endTandingBola(TimSepakbola lawan) {
    // DO NOT change the if condition
    if (
      Boolean.FALSE.equals(this.isOnMatch) &&
      Boolean.FALSE.equals(lawan.isOnMatch)
    ) {
      System.out.println("Kedua tim TIDAK sedang dalam pertandingan");
      return;
    }

    System.out.println(
      "\nPertandingan antara " +
      this.nama +
      " dan " +
      lawan.nama +
      " selesai!\n"
    );
    this.setIsOnMatch(false);
    lawan.setIsOnMatch(false);
  }

}
