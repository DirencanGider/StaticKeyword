public class Seyirci { // 1

    private String isim; //  İlk olarak static olmadan oluşturduk ve objeye özgü oldu.  //  2

    //public static int seyirci_sayisi = 0;  //  static olduğu için hem obje hem de sınıf üzerinden erişebileceğiz.  //  10
    private static int seyirci_sayisi = 0;  /*  Üst satırdaki özelliği privat eyaptık ve aşağılarda get metodu yazdık.
                                                Main.java class'ında erişebilmek için. */  //  14

    public Seyirci(String isim) {  //  3
        this.isim = isim;

        seyirci_sayisi++;  // Main.java da her yeni seyirci oluşturulduğunda seyirci_sayici constructorda 1 artırılacak.  //  11

    }

    public String getIsim() {  //  4
        return isim;
    }

    public void setIsim(String isim) {  //  5
        this.isim = isim;
    }

    public void oyun_seyret() {  //  6

        System.out.println(isim + " oyun seyrediyor...");

    }

    public static int getSeyirciSayisi() { //  15

        return seyirci_sayisi;
    }

}
