package Looping;

public class ganjilGenap {
    public static void main(String[] args) {

        /*genap
        i = 0; i < (kondisi/jumlahkondisi); i = i + 2
         */

        {
            for (int genap = 0; genap <= 20; genap = genap + 2) {
                System.out.println(genap);
            }

            System.out.println();

        /*ganjil
        i = 0; i < (kondisi/jumlahkondisi); i = i + 3
         */
            {
                for (int ganjil = 0; ganjil <= 15; ganjil = ganjil + 3) {
                    System.out.println(ganjil);
                }
            }
        }
    }
}
