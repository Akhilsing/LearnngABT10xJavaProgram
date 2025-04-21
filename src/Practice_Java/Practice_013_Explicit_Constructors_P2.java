package Practice_Java;
/* this defines the names as Practice_013_Explicit_Constructors_P2, which
 is the entry point to the program
*/
public class Practice_013_Explicit_Constructors_P2 {

   /*Access modifier — this constructor can be called from anywhere
    (outside the class too).
    Practice_013_Explicit_Constructors_P2 -	Constructor name — same
    as the class name. This defines a constructor, not a method.
    ()	Parentheses — indicate that this is a constructor with no
     parameters.
    */
    public Practice_013_Explicit_Constructors_P2(){
       System.out.println("Start Explicit");

   }
   public static void main(String[] args) {

       //Practice_013_Explicit_Constructors_P2
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

        /* Practice_013_Explicit_Constructors_P2().
        Constructor call – this is calling the Explicit constructor
         (no arguments) of the class Practice_013_Explicit_Constructors_P2.
        */

       Practice_013_Explicit_Constructors_P2 df = new Practice_013_Explicit_Constructors_P2();
       System.out.println("Explicit Constructor will have the access modifier is public");
   }
}
