public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hei olen Tulostin-ohjelma");
        System.out.print("Ohjelman tekijä:");
 
        String tekijä = "Arttu";
        System.out.println(tekijä);

        // Ohjelma alkaa tulostamalla "Hei olen Tulostin-ohjelma" ja "Ohjelman tekijä".
        // Ohjelmassa on myös määritetty String-tyyppinen muuttuja nimeltä tekijä ja tulostettu se konsoliin.
 

         // Alustetaan kaksi numeerista muuttujaa luku1, luku2 ja annetaan niille arvot.
         double luku1 = 5;
         double luku2 = 2;
  
         // Luodaan kolmas muuttuja nimeltä tulo ja kerrotaan luku1 ja luku2 ja sijoitetaan tulos tulo-muuttujaan.
         double tulo;
         tulo = luku1*luku2;
  
         System.out.println("Luku1-muuttujan arvo on " + luku1);
         System.out.println("Luku2-muuttujan arvo on " + luku2);
  
          // Tulostetaan konsoliin 5*2=10 jos luku1 on 5 ja luku2 on 2.
         System.out.println(luku1 + "*" + luku2 + "=" + tulo);

        //Määritetään summa, jako ja erotus muuttujat. Määritin muuttujat double-tyyppisiksi, koska tuloksessa voi olla desimaaleja.
         double summa;
         double jako;
         double erotus;
  
         summa = luku1 + luku2;
         jako = luku1/luku2;
         erotus = luku1-luku2; 
 
    }
}