package Practice_Java;
/* this defines the class name as Practice_014_Outside_Object_P2, which
is the entry point to program
*/
public class Practice_014_Outside_Object_P2 {

    // this is the main method. code executes from the main method
    public static void main(String[] args) {

        // calling another class in this class
        Practice_014_Object_P1 t1=new Practice_014_Object_P1();
        System.out.println(t1.add());

    }
}
