package belajarArray;

public class array2d {
    public static void main(String[] args) {

        //array in array atau array2dimensi

        String[][] fullName = {
                {"Teuku","Reynaldi"}, //array pertama
                {"Putra","Irwansyah"}, //array kedua
        };

        System.out.println(fullName[0][0]); //Output Teuku
        System.out.println(fullName[0][1]); //Output Reynaldi
        System.out.println();
        System.out.println(fullName.length); //output 2
        System.out.println();
        //array kedua
        System.out.println(fullName[1][0]); //output putra
        System.out.println(fullName[1][1]); //output irwansyah

        for (int i=0; i < fullName.length; i++) {
            System.out.println("Semua data array 1 dan 2  = " +  fullName[i][i]);
        }
    }
}
