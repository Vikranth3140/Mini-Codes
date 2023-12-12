class Cellphone{
    public void ring(){
        System.out.println("phone is ringing...");
    }
    public void vibrate(){
        System.out.println("phone is vibrating...");
    }
    public void call(){
        System.out.println("calling Harry...");
    }
}
class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("name "+name);
        System.out.println("salary: "+salary);
        System.out.println("id: "+id);
    }
}

public class class_qs{
    public static void main(String[] args) {
        // Problem 2
        Cellphone asus = new Cellphone();
        asus.ring();
        asus.vibrate();

        // Problem 1
        Employee one = new Employee();
        one.name="Sam";
        one.id=12;
        one.salary=34000;
        one.printDetails();
    }
}


