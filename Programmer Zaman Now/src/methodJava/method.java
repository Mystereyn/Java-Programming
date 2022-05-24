package methodJava;

public class method {
    public static void main(String[] args) { //ini adalah mainmethod
        
        /*
            1. Method juga disebut function
            2. Penggunaan Method selalu huruf kecil diawal
            3. Menggunakan kaa kunci Void
            4. Jika Method main menggunakan Static, maka function
               selanjutnya menggunakan Static
            5. Method itu bisa di reusable, artinya adalah bisa dipanggil 
                kembali, contoh pada line-17 dan line 18

        */    
        
        myName();
        System.out.println();
        myName();
        
        
    }

    static void myName() {
        String awalNama = "Teuku"; System.out.println("Nama depan saya : " + awalNama);
        String tengahNama = "Reynaldi"; System.out.println("Nama tengah saya : " + tengahNama);
        String namaTerakhir = "Irwansyah"; System.out.println("Nama terakhir saya : " + namaTerakhir);
        
    }
}
