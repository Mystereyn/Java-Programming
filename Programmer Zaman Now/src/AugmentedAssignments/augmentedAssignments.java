package AugmentedAssignments;

public class augmentedAssignments {
    public static void main(String[] args) {

        int C = 100;

        C += 10;
        System.out.println(C);

        C -= 10; //output adalah 100, karena diatas sudah ditambah 110, maka dikurangin -10 adalah 100
        System.out.println(C);

        C *= 10;
        System.out.println(C);

        C /= 10; //output juga 100, karena diatas sudah dikalikan 1000, maka dibagi /10 menjadi 100 lagi.
        System.out.println(C);

    }
}
