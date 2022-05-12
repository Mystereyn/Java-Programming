package ifElseStatement;

public class ifStatement2 {
    public static void main(String[] args) {

        var nilai = 80;
        var  absen = 90;

        var lulusNilai = nilai >= 80;
        var lulusAbsen = absen >= 90;

        var kelulusan = lulusAbsen && lulusAbsen;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("Anda dinyatakan lulus!");
        }
    }
}
