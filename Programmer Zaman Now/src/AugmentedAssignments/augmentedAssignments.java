package AugmentedAssignments;

public class augmentedAssignments {
    public static void main(String[] args) {

        int C = 100;
        C += 10;
        System.out.println(C);

        C -= 50; // output adalah 60 karena c = 100+10-50.
                 //Artinya variable C = 100; lalu di jumlahkan terlebih dahulu dengan 10,
                 //lalu dikurangin dengan 50  
        System.out.println(C);

        C *= 10;
        System.out.println(C);

        C /= 10; //output juga 100, karena diatas sudah dikalikan 1000, maka dibagi /10 menjadi 100 lagi.
        System.out.println(C);

        System.out.println();
    }
}
