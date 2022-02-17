public class belajarIfElse {
    public static void main(String[] args) {
        int nilai = 86; //int adalah singkatan dari initialisasi 

        if (nilai < 70) { //pernyataan variable
            System.out.println("Anda tidak lulus"); //owh, pernyataan ini tidak benar
        } else if (nilai > 80) {
            System.out.println("Anda mencapai KKM"); //owh, pernyataan ini baru benar
        }
    }
}

//Catatan : untuk setiap statement "Else" itu tidak bisa dimasukan variable.
//Untuk "Else" itu hanya digunakan jika statement If bernilai belum tercapai
//Alias Else untuk menyatakan "FALSE"
