package switchList;

public class SwitchLambda {
    public static void main(String[] args) {

        String nilai = "A";

        switch (nilai) {

            case "A" -> System.out.println("Anda lulusan terbaik");
            case "B","C" -> System.out.println("Anda cukup untuk lulus");
            case "D" -> System.out.println("Anda was was untuk lulus");
            case "E" -> System.out.println("Anda gagal untuk lulus ");

            default -> {
                System.out.println("Itulah semua contoh Switch Lambda");
            }


        }
    }
}
