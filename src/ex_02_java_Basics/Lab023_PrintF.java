package ex_02_java_Basics;

public class Lab023_PrintF {
    public static void main(String[] args) {
        int a=10;
        System.out.print(a);
        System.out.println(a);
        System.out.printf("your variable name is %d", a);
        //%d is replace with a value is 10
        //%d- int, byte, long, short-data
        //%s
        //%f float, %b boolean
        byte b=20;
        System.out.println();
        System.out.printf("%d * 2 = %d",b, b);


    }
}
