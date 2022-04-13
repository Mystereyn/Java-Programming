public class cobaKonstan {

    public static void main(String[] args) {
        
        var firstName = "Teuku";
        var middleName = "Reynaldi";

        final String application = "Belajar Programmer Zaman Now";

              String application2 = "belajar php";

        /* COntoh salah = final String application = "Belajar Programmer Zaman now";
                          application = "belajar  php";
         */

        /* Error, karena value data pada String = application sudah diset diawal

         .Sehingga harus membuat konstanta dengan tipeData yang baru, dibarengi value yang berbeda.

         Jika valuenya sama, maka akan terjadi error duplikasi.

         COntoh = final String application = "Belajar Programmer Zaman Now";
                        String application2 = "belajar php"; */





        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(application);
        System.out.println(application2);
        System.out.println("Nama lengkap saya adalah : " + firstName + " " +middleName);
               
    }
    
}

