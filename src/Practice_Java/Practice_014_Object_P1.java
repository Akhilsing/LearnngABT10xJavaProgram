/*package	A keyword that defines the package (folder-like structure)
where the class belongs.
 */
//Practice_Java	The name of the package. Helps organize your code in projects.
package Practice_Java;

/*this define class name as Practice_014_Object_P1, which is
   entry point to the program
*/
public class Practice_014_Object_P1 {
    //Declare the two variable
    int i, j;


    //Public
    //access modifier
    //Practice_014_Object_P1
    //this is no parameterized constructor and used the exact class name

    public Practice_014_Object_P1(){
        //this.i = 20;	this refers to the instance variable i, and assigns it the value 20.
        //this.j = 30;	Assigns 30 to the instance variable j.
        this.i=20;
        this.j=30;
    }
    //Public
    //access modifier
    //Practice_014_Object_P1
    //this is parameterized constructor and used the exact class name
    public Practice_014_Object_P1(int i, int j){

        //this.i-	Refers to the instance variable i of the class.
        //i-	Refers to the parameter i passed to the constructor.
        //this.j-	Refers to the instance variable j.
        //j-	Refers to the parameter j.
        //this.i = i; means: assign the value of parameter i to the class variable i.
        this.i=i;
        this.j=j;
    }

    public int add(){
        return i+j;
    }

    public static void main(String[] args) {
        Practice_014_Object_P1 t1=new Practice_014_Object_P1();
        Practice_014_Object_P1 t2=new Practice_014_Object_P1(20,40);
        Practice_014_Object_P1 t3=new Practice_014_Object_P1(50,60);
        System.out.println(t1.add());
        System.out.println(t2.add());
        System.out.println(t3.add());
    }
}
