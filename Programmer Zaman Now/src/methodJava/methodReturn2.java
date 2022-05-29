package methodJava;

//contoh kedua
public class methodReturn2 {
    public static void main(String[] args) {

        //int nilai1 , int nilai2
        var hasil1 = tambah(100,100);
        System.out.println(hasil1);

        var hasil2 = tambah(200, 200);
        System.out.println(hasil2);
        System.out.println(tambah(400,400));
        
    } static int tambah(int nilai1 , int nilai2) {
        var keseluruhan = nilai1 + nilai2;
        return keseluruhan;
        
    } static int tambah(int nilai1 , String operate , int nilai2) {

        switch (operate) {
            case "+" :
            return nilai1 + nilai2;

            case "-" :
            return nilai1 - nilai2;

            case
        }

    }
    
} 
