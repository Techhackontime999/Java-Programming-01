public class Datatype {
    public static void main(String[] args) {
        // java follow Unicode not ASCII
        // Datatype in java are of two types
        // 1.primitive or built-in 
        /*primitive data type like
         1.integer(int,byte ,short,long)
         Range & size:
             int= 4 bytes of size in memory & range is 
             byte=1 bytes of size in memory  & range is    
             short=2 bytes of size in memory  & range is   
             long=8 bytes of size in memory  & range is   
         2.floating-point number(float,double)
         Range & size:
            float= 4 bytes of size in memory.
            double= 8 bytes of size in memory

             float have less precision and double have more after decimal.
             when we asign decimal value directly in a variable then it take it double by default.
             for assigning float must need to add suffix "f" in decimal value.
         3.charecter (char) it store only a charecter not word
         Range & size: it takes 2 bytes of size in memory in java.
         4.boolean(True or False) it also take 1 byte of size in memory
         5.void(nothing) it does not store any value
         */
        int a =89;
        byte b=6;
        short c=56;
        double d=4.3456789;
        float e=3.5f;
        long f=12121;
        char g= 'D';
        // char always in single quiatation ''
        boolean h=true;
        System.out.println("int = "+a);
        System.out.println("byte = "+b);
        System.out.println("short = "+c);
        System.out.println("double= "+d);
        System.out.println("float= "+e);
        System.out.println("double= "+f);
        System.out.println("char= "+g);
        System.out.println("boolean= "+h);




        // 2.non-primitive or user-defined
        /*
         1.string (string )it stores a word or sentence
         2.Array:-it is collection of items of similar datatypes stored in a continous manner.
         etc.
         */
    //Declare string without new operator
    String st="Hello world";
    //Declare string using new operator
    String st1=new String ("Hello Amit");
    // Declare an integer array without new operator
    int [] arr ={1,2,3,4,5};
    // Declare an integer array using new operator
    int arr1[]=new int[3];
    arr1[0]=6;
    arr1[1]=7;
    arr1[2]=8;

    System.out.println("string st= "+st);
    System.out.println("string st1= "+st1);
    // Array not print directly like below use loop or array_name[position] for printing
    //   System.out.println("Array arr= "+arr);
    //   System.out.println("Array arr1= "+arr1);
System.out.println("Array arr printing");

for (int index = 0; index < arr.length; index++) {
    System.out.print(" "+arr[index]);
    if (index==arr.length-1) {
System.out.println();
        
    }
    
}
System.out.println("Array arr1 printing\n");

for (int index = 0; index < arr1.length; index++) {
    System.out.print(" "+arr1[index]);
    
    
}

     

    }
}
