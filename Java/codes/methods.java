public class methods {
    static int logic(int x, int y){
        int z;
        if (x>y){
            z=x-y;
        }
        else {
            z = y - x;
        }
        return z;
    }

//    method 2 if static is not written (process of method invocation)
    int logic2(int x, int y){
        int z;
        if (x>y){
            z=x/y;
        }
        else{
            z=y/x;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=logic(a,b);
        System.out.println("difference: "+c);

        int p=16;
        int q=4;
        int r;
        methods obj = new methods();
        r=obj.logic2(p,q);
        System.out.println("quotient: "+r);
    }
}
