package belajarArray;

public class array2d {
    public static void main(String[] args) {

        //array in array atau array2dimensi

        String[][] namaLengkap = { {"Teuku","Reynaldi"}, {"Putra","Irwansyah"}  };

        System.out.println(namaLengkap[0][0]); //Output Teuku
        System.out.println(namaLengkap[0][1]); //Output Reynald
        System.out.println(namaLengkap.length); //output 2
        System.out.println("\n");

        //array kedua
        System.out.println(namaLengkap[1][0]); //output putra
        System.out.println(namaLengkap[1][1]); //output irwansyah
        System.out.println("\n");

        //jika pake nested for
        for (int i=0; i < 2; i++) { //untuk menentukan elemen array1
            for (int j = 0; j < 2; j++) { //untuk menentukan elemen array2
                System.out.println(namaLengkap[i][j]);
            }
        }
    }
}
