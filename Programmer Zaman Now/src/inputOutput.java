import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        String nama, alamat;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan nama anda : ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukkan Alamat saya : ");
        alamat = keyboard.nextLine();

        System.out.println();
        System.out.println("Nama saya adalah : " + nama);
        System.out.println("Alamat saya ada di : " + alamat);
        System.out.println();
        System.out.println("===========Done====================");

    }
}
