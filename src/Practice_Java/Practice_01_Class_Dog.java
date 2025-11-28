package Practice_Java;

// we need class keyword for creating the class
// Class is creating using the Upper and lower case
public class Practice_01_Class_Dog {

    // below all are variables(Properties) for that variable value
    String breed="German Shepard";
    public int height= 30;
    public int weight= 35;

    public static void main(String[] args) {

        //Object created
        Practice_01_Class_Dog dog = new Practice_01_Class_Dog();

        // by using the object we can execute the methods which is outside of main method
        System.out.println(dog.breed);
    }
}
