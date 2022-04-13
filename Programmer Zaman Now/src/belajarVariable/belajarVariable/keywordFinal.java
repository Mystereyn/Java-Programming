package belajarVariable;

public class keywordFinal {

    public static void main(String[] args) {

        /* keyword final di java adalah konstanta

            Konstanta merupakan sebuah nilai yang tak bisa diubah setelah
            value telah di set diawal.
         */

        final
            var name = "Teuku Reynaldi Putra";
            var name2 = "Teuku reynaldi Putra";
            /*
             String  name = "Teuku Reynaldi Putra";
            name = "Teuku Reynaldi Putra Irwansyah";
            java: cannot assign a value to final variable name

            artinya adalah final (konstan) nilai value yang tak dapat diubah

            jika ingin merubah value (variable) yang sama di keyword Value (konstan), langkah pertama adalah :

            1. Menggunakan keyword Var jika ingin mengubah nilai (value) di final
            2. Menggunakan penegasan value yang berbeda jika ingin memasukan tipe data yang sama

                Contoh :
                final
                        var name = "AAAAAA";
                        var name2 = "AAAAA";
             */

            var umur = 21;
            var alamat = "JL. Raya Bogor KM.25 (KFC CIRACAS)";
            var ejaHurufPertama = 'T';

        System.out.println(name);
        System.out.println(name2);
        System.out.println(umur);
        System.out.println(alamat);
        System.out.println(ejaHurufPertama);

    }
}
