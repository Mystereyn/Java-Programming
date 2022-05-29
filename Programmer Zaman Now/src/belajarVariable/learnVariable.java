package belajarVariable;

public class learnVariable {

    public static void main(String[] args) {

        /*Jika tidak ingin memasukkan nilai/valure variable
        secara langsung
         */

        /*variable sebelum diganti yang baru */

        String name;
        name = "Teuku Reynaldi";

        byte umur;
        umur = 21;

        String alamat;
        alamat = "JL.Raya bogor KM.25 atau KFC CIracas";


        /*value variable yang telah diganti yang baru */
        /*Outputnya adalah mennjadi "Putra Reynaldi" bukan lagi "Teuku Reynaldi" */


        name = "Putra Reynaldi";

        /* ---------Catatatan---------

        error pada variable line 8 dan 17, tipe data String akan error, karena
        variable tersebut sudah dinyatakan sebelumnya, yaitu pada line 8.
        Maka, line 17 tidak bisa menggunakan tipe Data String lagi. Karena, Java itu adalah
        bahasa Static Type. Sehingga jika ingin merubah value dimasukkan ke tipe data tersebut,
        maka yang diketik hanyalah sebuah penegasan valuenya saja.
         */

        System.out.println("Nama saya adlaah : " + name);
        System.out.println("Umur saya sekarang adalah " + umur);
        System.out.println("Saya tinggal berlamat di " + alamat);
    }
}
