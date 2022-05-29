package methodJava;

//contoh kedua
public class methodReturn2 {
    public static void main(String[] args) {

        //int nilai1 , int nilai2
        System.out.println("Ini adalah untuk method tambah");
        var hasil1 = hitung(600,600);
        System.out.println(hasil1);

        var hasil2 = hitung(600, 600);
        System.out.println(hasil2);

        System.out.println(hitung(600,600));

        System.out.println();
        System.out.println("Ini adalah untuk method function tambah + case");
        System.out.println(hitung(600 , "+" , 600));
        System.out.println(hitung(600, "-", 600));
        System.out.println(hitung(600, "/", 600));
        System.out.println(hitung(600, "*" , 600));
        System.out.println(hitung(600, "%" , 600));
        System.out.println(hitung(600, "salah", 600));
        System.out.println("\n");
        System.out.println("====it's done====");
        
    } static int hitung(int nilai1 , int nilai2) {
        var keseluruhan = nilai1 + nilai2;
        return keseluruhan;
        
    } // jika ingin melakukan return pada percabangan 
    static int hitung(int nilai1 , String operate , int nilai2) {
        
        switch (operate) {
            case "+" :
            return nilai1 + nilai2;

            case "-" :
            return nilai1 - nilai2;

            case "/" : 
            return nilai1 / nilai2;

            case "*" : 
            return nilai1 * nilai2;

            case "%" : 
            return nilai1 % nilai2;

            default :
            return 0; // < jika tidak ingin dioperasi atau ingin bernilai true.

        }

    }
    
} 
