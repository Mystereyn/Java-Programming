package ContinueAndBreak;

public class sampleContinue {
    public static void main(String[] args) {
        
        /**
         * Konsep kontinue adalah :
         * 
         *  1. Code setelah penggunaan keyword continue, tidak akan dieksekusi
         *  2. Perulangan continue akan lanjut ke loop selanjutnya 
         *  3  Keyword continue akan masuk ke post statement (i++) , lalu masuk ke post jumlah
         *  4. Continue adalah menghentikan looping saat ini, lalu dilanjutkan ke loop selanjutnya
         */ 


         //Looping dan menentukan bilangan ganjil dan genap

        for(int i=0; i <= 100;  i++) {
            if(i % 2 == 0) {
                continue;

            }

            System.out.println("Bilangan Ganjil " + (i));
        }

    }
    
}
