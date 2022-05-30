package methodJava;

public class methodOverLoad {
    public static void main(String[] args) {
        
        sayHello();
        sayHello("Putra");
        sayHello("Teuku Reynaldi" , 21 );
    }
    

    static void sayHello() {
        System.out.println("Hello Mystereyn!");
    }
    static void sayHello(String nama) {
        System.out.println("Hello Juga!");
    }
    static void sayHello(String nama1 , int umur) {
        System.out.println("Hallo nama gue adalah" + " " + nama1 + " " +  "Umur Gue adalah "  + umur);
    }
}