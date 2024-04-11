package Inheritance;

class Overrid{
    int a;
    public void age(int a){
        System.out.println("Age is "+ a);
    }
}
class New extends Overrid{
//    void age(int a){
//
//    } Error because it is public in parent class and you are decreasing its visibility

//    public int age(int a){
//
//    } Error because in the parent class its return type is void

    public void age(int a){

    }
}

public class Override {
    public static void main(String[] args) {
        System.out.println("Hello");
        Overrid objj= new Overrid();
        objj.age(8);
    }
}
