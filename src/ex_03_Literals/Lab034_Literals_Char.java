package ex_03_Literals;

public class Lab034_Literals_Char {
    public static void main(String[] args) {
        char c1='A';
        /*we can't use double quote then it will become
        string, String means bunch of characters
         */
        char c2='@';
        char c3='_';
        char c4='9';
        char c5='(';
        char c6=' ';

        //Escape char
        char new_line='\n';
        char tab_line='\t';
        char  back_space='\b';
        char carriage_return='\r';

        //what is the purpose of all the Escape characters
        //+ is concatenation
        //output
        // Automation
        // testing
        System.out.println("Automation" + new_line + "Testing");

        //output
        // Automation Testing
        System.out.println("Automation" + tab_line + "Testing");


        //back_space means remove the first character
        //output
        //AutomatioTesting
        System.out.println("Automation" + back_space + "Testing");

        //carriage_return means delete the first characters
        //output
        //Testing
        System.out.println("Automation" + carriage_return + "Testing");


        char rupees='₹';
        System.out.println("Price is" +rupees+ 10);



    }
}
