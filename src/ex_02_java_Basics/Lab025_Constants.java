package ex_02_java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a= 10; // it is not a constant we can change the value
        a= 20;
        System.out.println(a); // output is 20

        final int b= 15; // it is  a constant we can't change the value
        //b= 25;
        /*
        what is the use of it final-- whatever the constants are there
        in ur program they will be always final in nature
         */
    }
}
