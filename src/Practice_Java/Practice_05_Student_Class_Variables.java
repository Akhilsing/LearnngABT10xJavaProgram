package Practice_Java;

public class Practice_05_Student_Class_Variables {

    //class variable or static variables
    // we need to create in class level not inside the method
    /*Global variables-this below statement we can in all the methods
    which are in available in class
     */
    // no need to create any reference for static variables directly we can call them
    static int id=1001;
    String name="Adi";

    public static void main(String[] args) {

        /* if we want to use the non static variable we need to create the
        object which is present in out side of the method
        *Practice_04_Student_Class_Variables stu_name= new Practice_04_Student_Class_Variables();
        System.out.println(stu_name.name);
         */
        System.out.println(id);


    }
}
