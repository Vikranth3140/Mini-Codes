class employee1{
    int id;
    String name;
    int salary;

    public employee1(){
        id =45;
        name="Sam";
    }
    public employee1(int i, String n){
        name=n;
        id=i;
    }
    public employee1(int i, String n, int sal){
        name=n;
        id=i;
        salary=sal;
    }
    public void setName(String n) {

        this.name = n;
    }
    public String getName(){

        return name;
    }
    public void setId(int i){

        this.id=i;
    }
    public int getId(){

        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
        employee1 emp1=new employee1(12, "Sam");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
                                                                         // concept of method overloading
        employee1 emp2=new employee1();
        emp2.name="John";
        emp2.id=40;
        System.out.println(emp2.getId());
        System.out.println(emp2.getName());
                                                                         // concept of method overloading
        employee1 emp3 = new employee1(34, "Harry", 34000);
        System.out.println(emp3.getId());
        System.out.println(emp3.getName());

    }
}