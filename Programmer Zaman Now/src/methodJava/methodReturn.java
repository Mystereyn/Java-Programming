package methodJava;

//method return value
public class methodReturn { //method return value
    public static void main(String[] args) {

        /* keyword Void, tidak mengembalikan value
        */
        var value1 = 25;
        var value2 = 50;
        var keseluruhan = sum(value1,value2);

        System.out.println(keseluruhan);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
        
        

        

