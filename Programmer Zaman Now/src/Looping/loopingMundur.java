package Looping;

public class loopingMundur {
    public static void main(String[] args) {

        //catatan untuk looping mundur.
        {
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
            }

            System.out.println("\n");
            
            {
                for (int ayam = 10; ayam > 0; ayam--) {
                    System.out.println("Anak ayam terdiri dari" + "\t" + ayam);
                }
            }
        }
    }
}