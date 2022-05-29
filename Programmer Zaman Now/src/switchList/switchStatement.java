package switchList;

public class switchStatement {
    public static void main(String[] args) {

        String nilai = "";

        switch (nilai) {

            case "A":
                System.out.println("anda lulus");
                break;
            case "B":
                System.out.println("Anda cukup baik untuk lulus");
                break;
            case "C":
                System.out.println("Anda cukup lulus");
                break;
            case "D":
                System.out.println("Anda gagal");
                break;
            default: //default hampir sama dengan else.
                System.out.println("Anda lebih baik giat belajar!");

            };
        }
    }
