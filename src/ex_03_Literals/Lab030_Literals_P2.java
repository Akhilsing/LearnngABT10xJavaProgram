package ex_03_Literals;

public class Lab030_Literals_P2 {
    public static void main(String[] args) {
        // this is floating type of variable
        float Li=10.03f;
        float Lit=10.03F;
        //
        final int a=10;

        /* this is possible because by default is .00, JVM and compiler is smart
            so they will remove.00
         */

        float x=10;
        System.out.println(x + Li + Lit + a );

    }
}
