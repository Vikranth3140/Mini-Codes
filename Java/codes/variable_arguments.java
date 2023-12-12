public class variable_arguments {
    static int sum(int ...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }
        return result;
    }

    static int average(int ...arr1){
        int result=0;
        for (int a:arr1){
            result+=a;
        }
        result=result/ arr1.length;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of nothing is: "+sum());
        System.out.println("The sum of 1 is: "+sum(1));
        System.out.println("The sum of 1, 2 is: "+sum(1, 2));
        System.out.println("The sum of 1, 2, 3, 4, 5 is: "+sum(1, 2, 3, 4, 5));
        System.out.println("The average of 1, 2, 3, 4, 5 is: "+average(1, 2, 3, 4, 5));
    }
}
