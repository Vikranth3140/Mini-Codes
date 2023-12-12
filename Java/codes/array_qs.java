public class array_qs {
    public static void main(String[] args) {
        // System.out.println(5/2);

        int [] num={1, 2, 3, 4 , 5, 6, 7};
        int temp;
        int l=num.length;
        int n=l/2;

        for (int i = 0; i < n; i++) {
            temp=num[i];
            num[i]=num[l-i-1];
            num[l-i-1]=temp;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
    }
}
