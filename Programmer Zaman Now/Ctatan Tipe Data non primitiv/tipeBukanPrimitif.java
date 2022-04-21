package nonPrimitive;
public class tipeBukanPrimitif {

    public static void main(String[] args) {
        

        /*jika tidak ingin mengisi nilai, maka insert saja null.
        
        secara default, nilai dari semua TipeNonPrimitive adalah null(kosong)

        String bukan lah Primitive maupun non-Primitive. Melainkan adalah tipe Data
        Objek.
        
        */

    
        Float thisFloat= 20.2f;
        Integer thisInteger = 1000;
        Byte thisByte = null;

        //jika Byte diganti dengan value 100

        thisByte = 100;

        //menampilkan variabel
        System.out.println(thisByte);
        System.out.println(thisFloat);
      
      
        System.out.println(thisInteger);
        
        System.out.println("Semua Hasil tipe datanya = " + thisFloat*thisInteger*thisByte);

    }
    
}
