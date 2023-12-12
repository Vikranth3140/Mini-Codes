public class methods_overloading {
    static void foo() {
        System.out.println("Hello");
    }

    static void foo(int a) {
        System.out.println("Hello " + a);
    }

    static void foo(int a, int b) {
        System.out.println("Hello " + a + " " + b);
    }
//    static int foo(int a, int b){
//  }
//    cause an error

    static int foo(int a, int b, int c){
        System.out.println("Hello "+a+" "+b);
        return c;
    }

    public static void main(String[] args) {
        foo();
        foo(50);
        foo(30,35);
        int c=foo(20,50,30);
        System.out.println(c);

    }
}
