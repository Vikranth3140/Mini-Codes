import java.util.Scanner;
import java.util.Objects;

public class practice_make_library{
    static String []available_books= {"Geeta","Ramayana","Gitanjali","Constitution","Godan","Madhushala","Nirmala","Rashmirathi","Pinjar","Tamas"};

    public int user_input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. To see available books. \n2. To issue a book. \n3. To submit a book. \n4. To see issued book. \n5. To close library.");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public void print_Array(String []array){
        int len=array.length;
        for (int i=0; i<len; i++){
            System.out.println((i+1)+". "+array[i]);
        }
    }

    public String []issue(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the book to be issued: ");
        String isbook=sc.next();

        int i=0;
        while(!Objects.equals(isbook, available_books[i])){
            i++;
            if (i== available_books.length){
                System.out.println("Book is not available in te library");
            }
        }
        System.out.println("Book issued.");

        String []issued_books=new String[available_books.length];
        int j=0;
        while(!Objects.equals(null, issued_books[j])){
            j++;
            issued_books[j]=available_books[i];
            available_books[i]=null;
        }
        return issued_books;
    }

    public void submit(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter book name to be returned: ");
        String subbook=sc.next();

        String []arr=issue();
        int len1=arr.length;
        for (int i=0; i<len1; i++) {
            if(Objects.equals(subbook, arr[i])){
                i=0;
                while(available_books[i]!=null){
                    i++;
                }
                available_books[i]=subbook;
                arr[i]=null;
                System.out.println("Book submitted.");
            }
        }
        System.out.println("This book has not been issued from the library.");
    }

    public static void main(String[] args) {
    }
}