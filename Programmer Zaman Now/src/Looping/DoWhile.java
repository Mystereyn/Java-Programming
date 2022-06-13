package Looping;

public class DoWhile {
    public static void main(String[] args) {

        int i = 0;
        do { 
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println();
        
        //contoh salah jika memberikan parameter pada while tidak sesuai dengan ekspresi int j.
        System.out.println("Ini membuktikan jika do itu melakukan looping satu kali");
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while( j <= 1);
    }
}



       