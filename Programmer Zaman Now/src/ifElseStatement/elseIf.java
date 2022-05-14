package ifElseStatement;

public class elseIf {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 30;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var kelulusan = lulusNilai && lulusAbsen;

        if(lulusNilai = nilai >= 75) { //false
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Ulangi taun depan"); //true
        }

        if(nilai >= 80 && absen >= 80) { //false (awal pengecekan kondisi)
            System.out.println("Nilai aanda A");

        } else if (nilai >= 70 && absen >= 70 ) { //false
            System.out.println("Nilai anda B");

        } else if (nilai >= 65 && absen >= 65 ) { //false
            System.out.println("Nilai anda C");

        } else if (nilai >= 50 && absen >= 50 ) { //false
            System.out.println("Nilai anda D");
        } else {
            System.out.println("anda bodoh lama kelamaan"); //true

        }
    }
}
