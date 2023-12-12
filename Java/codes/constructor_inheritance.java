class base1{
    base1(){
        System.out.println("I am a constructor");
    }
    base1(int a){
        System.out.println("I am a overloaded constructor with value: "+a);
    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I am a derived class constructor");
    }
    derived1(int a, int b){
        super(a);
        System.out.println("I am a derived class overloaded constructor with value: "+b);
    }
}

class child_derived extends derived1{
    child_derived(){

        System.out.println("I am the child of a derived class constructor");
    }
    child_derived(int a, int b, int c){
        super(a, b);
        System.out.println("I am a overloaded child of a derived class constructor with value: "+c);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
        base1 b=new base1();
        derived1 d=new derived1();
        derived1 d1= new derived1(2, 34);
        child_derived c=new child_derived();
        child_derived c1=new child_derived(2, 34, 50);
    }
}
