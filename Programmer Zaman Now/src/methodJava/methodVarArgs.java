package methodJava;

/* Method Variable Arguments
*/

public class methodVarArgs {
    public static void main(String[] args) {
        
        //jika tidak memakai method variable arguments
        System.out.println("Ini adalah non method var arguments");
        int[] rata_rata = {60,65,70,75};
        ucapSelamat( "Teuku Reynaldi " , rata_rata);
        System.out.println();

        System.out.println("Ini adalah method var arguments");
        //menggunakan method variable arguments
        ucapSelamat( "Putra Irwansyah", 70,75,80,85,90);
    }

    static void ucapSelamat(String nama , int... rata_rata) {
        var total = 0;
        for(var nilai : rata_rata) {
            total += nilai;
        }
        var akhirNilai = total / rata_rata.length;

        if(akhirNilai >= 75) {
            System.out.println("Anda lulus " + nama);

        } else {
            System.out.println("Anda gagal " + nama);
        }
        
    }
    
}
