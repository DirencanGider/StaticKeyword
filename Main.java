/*

static anahtar kelimesi ile yazılan metodlar, bir Objeye bağlı değil bir Sınıfa bağlı oluyor.
static ile yazılmış metodlara erişirken obje oluşturmamıza gerek kalmadan direkt sınıf ismi ile erişebiliyoruz.
Önemli: Java projelerimizin çalışması için mutlaka static bir main metoduna sahip olması gerekiyor.
Her java projesinde static olan bir main metodu olması şart.

 */
public class Main {
    public static void main(String[] args) {

        Seyirci seyirci1 = new Seyirci("Direncan Gider"); /* İlk olarak obje oluşturduk ve static olmadan metodu
                                                                 çağırdık */  //  7
        Seyirci seyirci2 = new Seyirci("Gider Direncan"); /* İlk olarak obje oluşturduk ve static olmadan metodu
                                                                 çağırdık */  //  7

        seyirci1.oyun_seyret(); //  Metodu oluşturduğumuz obje üzerinden çağırdık.  //  8
        /*System.out.println("Seyirci Sayısı : " + Seyirci.seyirci_sayisi); /* Seyirci class'ında seyirci_sayisi static olarak
                                                                             yazıldığı için Direkt Seyirci class'ı üzerinden
                                                                             çağırabildik. */  //  12
        /*System.out.println("Seyirci Sayısı : " + Seyirci.seyirci_sayisi); /* seyirci_sayisi özelliğini publicten private'a
                                                                             çektikten sonra getSeyirciSayisi() metodunu
                                                                             yazmıştık. Sonrasında üst satırı yoruma alıp
                                                                             burada getSeyirciSayisi() metodu ile yeniden
                                                                             çağırdık. Fakat hata verdi. Çünkü getSeyirciSayisi()
                                                                             metodu static olmayan bir metod. Seyirci class'ından
                                                                             direkt olarak çağıramıyoruz.*/  //  18
        System.out.println("Seyirci Sayısı : " + Seyirci.getSeyirciSayisi());/* Üstterki satırı yoruma aldık.Seyirci classındaki
                                                                             getSeyirciSayisi() metoduna static anahtar
                                                                             kelimesini ekleyerek burada get ile tekrar
                                                                             çağırmayı denedik ve bu sefer oldu. */  //  19

        //System.out.println("Seyirci Sayısı : " + seyirci1.seyirci_sayisi); /* seyirci1 obje referansı üzerinden de çağırabildik. */  //  12
        System.out.println("Seyirci Sayısı : " + seyirci1.getSeyirciSayisi()); /* seyirci_sayisi özelliğini publicten private'a
                                                                              çektikten sonra getSeyirciSayisi() metodunu
                                                                              yazmıştık. Sonrasında üst satırı yoruma alıp
                                                                              burada getSeyirciSayisi() metodu ile yeniden
                                                                              çağırdık. */  //  16

        ///System.out.println("Seyirci Sayısı : " + seyirci2.seyirci_sayisi); /* seyirci2 obje referansı üzerinden de çağırabildik. */  //  13
        System.out.println("Seyirci Sayısı : " + seyirci2.getSeyirciSayisi()); /* seyirci_sayisi özelliğini publicten private'a
                                                                              çektikten sonra getSeyirciSayisi() metodunu
                                                                              yazmıştık. Sonrasında üst satırı yoruma alıp
                                                                              burada getSeyirciSayisi() metodu ile yeniden
                                                                              çağırdık. */  //  17


        /* Şimdi biz her yeni seyirci objesi oluştuğu zaman seyirci sayısı adlı bir değişkeni 1 artırmak istiyoruz. Bunu
           yapabilmek için Seyirci classında seyirci_sayisi adlı değişkeni static olarak oluşturmamız gerekecek. */  //  9

        selamla(); //  21

        System.out.println(Math.PI); /* Ctrl tuşuna basılı tutarken Math üzerine tıklarsak direkt Math class'ının içerisine
                                        gidebiliyoruz. Math class'ı içerisinde gezindiğimizde PI değişkeninin hem public hem de
                                         static olarak yazılmış olduğunu gözlemliyoruz. Yani herhangi bir yerden bu değişkene
                                         kolaylıkla bağlı olduğu Math class'ı ismi üzerin ulaşabiliyoruz. */  //  22


    }
    public static void selamla() { /* selamla() adında basit bir metod tanımladık. metodu static anahtar kelimesi olmadan
                                      tanımlayıp hemen üstte main metodu içerisinde çağırdık. main metodu static olduğu ve
                                       selamla() metodu static olmadığı için hata aldık. Sonrasında selamla() metoduna da
                                       static anahtar kelimesini ekleyince hata ortadan kalkmış oldu.
                                       Yani static olan bir metodun içerisinde static olmayan bir metod çağırılamaz.
                                       */  //  20

        System.out.println("Selamlar...");

    }

}
