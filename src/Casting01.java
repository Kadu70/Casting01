public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        byte byteVar= (byte)128;
        
        
        //Declare and initialize a short with a value of 128
        short shortVar = 128;
        //Create a print statement that casts this short to a byte
                System.out.println("Byte :" + byteVar + " short : " + shortVar);
        
        
        //Declare and initialize a byte with a value of 127
         byte byteVar1= 127;
        //Add 1 to this variable and print it
        byteVar1++;
        //Add 1 to this variable again and print it again
        System.out.println("Byte :" + byteVar1 + " short : " + shortVar);
        byteVar1++;
        System.out.println("Byte :" + byteVar1 + " short : " + shortVar);
        
        
    }    
}
