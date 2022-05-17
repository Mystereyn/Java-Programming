package Looping;

public class DoWhile {
    public static void main(String[] args) {

        // menggunakan objek String.

        int i = 0;
        String nama = "Teuku";

        do {
            System.out.println("Nama saya adalah : " + nama);
            i++;
        } while (i <= 10);

        System.out.println();

        /*

        jika variable untuk looping tidak sesuai
        dengan parameter condition, maka perulangan akan cukup sekali saja pada
        konsep Do-While. Karena Do, akan melakukan perulangan sekali saja

         */

        //jika variable tidak sesuai dengan kondisi perulangan.

        {
           String nama2 = "Reynaldi";
           int j = 100;

           do {
               System.out.println("Nama kedua saya : " + nama);
               j++;
           } while (j <= 10);
        }
        System.out.println();

        {
            //jika menggunakan While

            String nama3 = "Putra";
            int k = 100;

            while (k <=10) {
                System.out.println(nama3 + k);
                k++;

                //ouput akan menghasilkan kosong(null)
            }
        }
    }
}
