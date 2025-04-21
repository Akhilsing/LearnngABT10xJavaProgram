package Practice_Java;

public class Practice_013_Multi_Explicit_Constructors_P3 {

    public int i;

    /*Access modifier — this constructor can be called from anywhere
    (outside the class too).
    Practice_013_Multi_Explicit_Constructors_P3 -	Constructor name — same
    as the class name. This defines a constructor, not a method.
    ()	Parentheses — indicate that this is a constructor with no
     parameters.
    */
    public Practice_013_Multi_Explicit_Constructors_P3() {
        System.out.println("Start Explicit");

    }
    /*Access modifier — this constructor can be called from anywhere
    (outside the class too).
    Practice_013_Multi_Explicit_Constructors_P3- This is the constructor
    name. It must match the class name exactly.
    (int a)- This constructor takes one parameter of type int, named a.
    That means it is not a default constructor; it’s a parameterized constructor
    */
    public Practice_013_Multi_Explicit_Constructors_P3(int a) {
        System.out.println("Start Explicit");
        i=a;

    }
    public static void main(String[] args) {

        //Practice_013_Multi_Explicit_Constructors_P3
        /* Class name – this is the name of your Java class.
        You're telling Java what type of object you want to create.
         */

        //df
        // This is the name of the object is created

        //=
        //Assignment operator
        // Assigns the new Scanner object (on the right) to the variable sc (on the left).

        // new
        // this is a keyword in java
        // used to create new object

        /* Practice_013_Multi_Explicit_Constructors_P3().
        Constructor call – this is calling the Explicit constructor
         (no arguments) of the class Practice_013_Multi_Explicit_Constructors_P3.
        */

        Practice_013_Multi_Explicit_Constructors_P3 df = new Practice_013_Multi_Explicit_Constructors_P3();

        System.out.println("value of a " + df.i);

    }
}

