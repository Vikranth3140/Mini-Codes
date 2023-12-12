import java.util.ArrayList;

class myGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public myGeneric(T1 t1, T2 t2, int val){
        this.t1=t1;
        this.t2=t2;
        this.val=val;
    }

    public T2 getT2(){
        return t2;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public void setT2(T2 t2){
        this.t2=t2;
    }

    public int getVal(){
        return val;
    }

    public T1 getT1(){
        return t1;
    }
}

public class generics {
    public static void main(String[] args) {
        myGeneric<String, Integer> g1=new myGeneric("hello", 12, 5);
        int x= g1.getT2();
        System.out.println(x);
    }
}

//class MyGeneric<T1, T2>{
//    int val;
//    private T1 t1;
//    private T2 t2;
//
//    public MyGeneric(int val, T1 t1, T2 t2) {
//        this.val = val;
//        this.t1 = t1;
//        this.t2= t2;
//    }
//
//    public T2 getT2() {
//        return t2;
//    }
//
//    public void setT2(T2 t2) {
//        this.t2 = t2;
//    }
//
//    public int getVal() {
//        return val;
//    }
//
//    public void setVal(int val) {
//        this.val = val;
//    }
//
//    public T1 getT1() {
//        return t1;
//    }
//
//    public void setT1(T1 t1) {
//        this.t1 = t1;
//    }
//}
//public class generics {
//    public static void main(String[] args) {
//        MyGeneric<String, Integer> g1 = new MyGeneric(23, "MyString is my string ", 45);
//        String str = g1.getT1();
//        Integer int1 = g1.getT2();
//        System.out.println(str + int1);
//    }
//}
//
