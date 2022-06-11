package ifElseStatement;
import java.util.Scanner;

public class inputIfElse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        if(angka % 2 == 0) {
            System.out.println("Ini adalah angka ganjil");
        } else {
            System.out.println("Ini adalah angka genap");
        }
        input.close();
    }
    
}
