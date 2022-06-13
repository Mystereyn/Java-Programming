package methodJava;
import java.util.Scanner;

public class inputan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan barisan deret angka : ");
        int i = input.nextInt();

        for(i = 0; i != 10; i++) {
            if(i % 2 == 1) {
                System.out.println("ini adalah angka ganjil : " + (i));
            }
            input.close();
        }
  

    }
    
}
