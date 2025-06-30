package Practice_Java;

import ex_01_Java_Basics.Main;

public class Practice_04_Student_Inst_Variables {
    //instance variables are non Static fields
    // we need to create in class level not inside the method
    // we are not using static keyword because of that we r saying that nonstatic fields
    /*
    why we are calling as instance variable means?
    if we want to access the below variable we need to create the object
     */
    int id=101;

    public static void main(String[] args) {
        //creating object
        Practice_04_Student_Inst_Variables student = new Practice_04_Student_Inst_Variables();
        System.out.println(student.id);

    }
}
