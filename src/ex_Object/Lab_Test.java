package ex_Object;

public class Lab_Test {
    int i, j;

    // parameterless constructor
    public Lab_Test(){
        i=10;
        j=20;

    }
    // parameterized constructor
    public Lab_Test(int i, int j){
        this.i=i;
        this.j=j;

    }

    public static void main(String[] args) {
        Lab_Test t1= new Lab_Test();
        Lab_Test t2= new Lab_Test(10, 30);
        System.out.println(t2.j);
        System.out.println(t1);
        

    }
}
