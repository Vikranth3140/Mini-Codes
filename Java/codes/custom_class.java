class employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("name "+name);
        System.out.println("salary: "+salary);
        System.out.println("id: "+id);
    }
}

public class custom_class {
    public static void main(String[] args) {
        employee one = new employee();
        one.name="Sam";
        one.id=12;
        one.salary=34000;
        one.printDetails();
    }
}
