package Practice_Java;

public class Practice_02_Size_DataType {
    public static void main(String[] args) {

        /*
        if its is primitive data type we use  wrapper class
        of that data type,  we can know how much memory is storing
         */
        //short wrapper class is Short
        //output is in bites
        System.out.println(Short.SIZE);

        // output is in bytes
        System.out.println(Short.SIZE/8);

        //int wrapper class is Interger
        //Range
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}
