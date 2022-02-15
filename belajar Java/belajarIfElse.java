public class belajarIfElse {
    public static void main(String[] args) {
        int nilai = 86; //init adalah singkatan dari initialisasi 
        if (nilai < 70) { //pernyataan variable
        System.out.println("Anda tidak lulus"); //owh, pernyataan ini tidak benar
    } else if (nilai < 80) {
        System.out.println("Anda tidak mencapai KKM"); //owh, pernyataan ini tetap salah
    } else {
        System.out.println("Anda lulus"); //pernyataan benar
    }
}
}
