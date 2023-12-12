class myEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
        //this.name=n
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
}
public class access_modifiers {
    public static void main(String[] args) {
        myEmployee emp=new myEmployee();
        emp.setName("Sam");
        System.out.println(emp.getName());
        emp.setId(12);
        System.out.println(emp.getId());
    }
}
