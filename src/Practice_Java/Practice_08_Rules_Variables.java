package Practice_Java;

public class Practice_08_Rules_Variables {

    // below variable are different because variable is case sensitive
    static String name="Adi";
    static String Name="Lucky";

    // if name is single word then it should be lowercase
    static int  a= 10;

    /* camel case- word of the first letter should be lower letter
    subsequent of the next word first letter should be capital letter
     */
    static int studentAge= 20;

    //keywords should not using directly as variable
   // int void=20;

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(Name);
    }
}
