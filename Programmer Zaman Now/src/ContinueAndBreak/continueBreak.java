package ContinueAndBreak;

public class continueBreak {
    public static void main(String[] args) {

        /*
         *  diberikan while (true), karena looping akan berjalan infinite
         *  break untuk menghentikan paksa looping,
         */
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke - " + counter);
            counter++;

            if(counter >= 10) {
                break;
            }
        }

    }
}
