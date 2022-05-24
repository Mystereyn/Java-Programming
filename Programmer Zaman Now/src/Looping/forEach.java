package Looping;

public class forEach {
    public static void main(String[] args) {
        
        String[] names = {
            "Teuku" , "Reynaldi" , "Putra" , "Irwansyah"
        };

        //for biasa
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();

        System.out.println("Ini adalah menggunakan for Each : ");

        for(String name : names) {
            System.out.println(name);
        }    

    }
    
}
