class A{
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class C{
    public void var1() {
        System.out.println("6");
    }
}

class B extends A{
    @Override               //can be written to make sure there is no error or false overriding
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class methods_overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();
        a.meth2();

        B b=new B();
        b.meth2();
        b.meth3();
    }
}
