package Boolean;

public class operateBoolean {

    public static void main(String[] args) {

        var absen = 70;
        var nilaiAkhir = 80;


        boolean lulusAbsen = absen >= 75; // nilai false, karena absen adalah 70
        System.out.println(lulusAbsen);

        boolean lulusNilai = nilaiAkhir >= 75; // nilai true, karena value nilai akhirnya adalah 80
        System.out.println(lulusNilai);

        var lulus = lulusAbsen && lulusNilai; //false && true adalah false
        System.out.println(!lulus); //output false, jika ditambahkan ! (swap boolean) outputnya true

    }
}
