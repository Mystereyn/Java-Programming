package TernaryOperator;

public class ternary {
    public static void main(String[] args) {

        var nilai = 70;
        String said;

        if(nilai >= 75) {
            said = "Anda lulus";
        } else {
            said = "Try again!";
        }
        System.out.println(said);

        //jika pakai ternary operator, bentuknya jika  = (?) , sedangkan untuk else adalah = (:)

        {
            var nilai2 = 80;
            String said2 = nilai >= 75 ? "Anda lulus, anda pintar!" : "Try again!!";

            System.out.println(said2);

        }
    }
}



