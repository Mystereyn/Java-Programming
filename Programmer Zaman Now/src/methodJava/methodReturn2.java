package methodJava;

public class methodReturn2 {
    public static void main(String[] args) {

        var hasil1 = tambah(100,100);
        System.out.println(hasil1);
        
    }
    static int tambah(int nilai1 , int nilai2) {
        var keseluruhan = nilai1 + nilai2;
        return keseluruhan;
    }
}
