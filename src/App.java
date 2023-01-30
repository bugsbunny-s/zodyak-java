import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int year,kalan;
        String zodyak="";

        Scanner inp = new Scanner (System.in);
        System.out.print("Doğum Yılınızı Giriniz : ");
        year = inp.nextInt();

        if (year > 0 && year <= 2023){

            kalan = year % 12;

            switch(kalan){
                case 0 : 
                zodyak = "Maymun";
                break;

                case 1 :
                zodyak = "Horoz";
                break;

                case 2 :
                zodyak = "Köpek";
                break;

                case 3 : 
                zodyak = "Domuz";
                break;

                case 4 : 
                zodyak = "Fare";
                break;

                case 5 :
                zodyak = "Öküz";
                break;

                case 6 : 
                zodyak = "Kaplan";
                break;

                case 7 : 
                zodyak = "Tavşan";
                break;

                case 8 :
                zodyak = "Ejderha";
                break;

                case 9 :
                zodyak = "Yılan";
                break;

                case 10 : 
                zodyak = "At";
                break;

                case 11 : 
                zodyak = "Koyun";
                break;

                default :
                System.out.println("Hatalı Çıktı");
            }

            System.out.println("Çin Zodyağı Burcunuz : " + zodyak);
        }
        else{
            System.out.println("Hatalı Tarih Girişi Yaptınız");
             
        }
    }
}