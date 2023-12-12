abstract class parent{
    public parent(){
        System.out.println("I am a parent constructor");
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    abstract public void greet();
}

class child2 extends parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
}

abstract class child3 extends parent{
    public void greet(){
        System.out.println("Namaste");
    }
}

public class abstract_class {
    public static void main(String[] args) {
//        parent p=new parent();       error  abstract classes can be used to create other classes
        child2 c=new child2();
        c.greet();
//        child3 c2=new child3();       error   abstract classes do not have objects
    }
}
