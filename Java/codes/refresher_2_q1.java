class student {
    String name;
    int age;
    int roll;
    String branch;
    static int new_roll=1001;

    public student() {
        this.roll = new_roll++;
    }

    public student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.roll = new_roll++;
        this.branch = branch;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setAge(int age){
//        this.roll=age;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//    public String getBranch() {
//        return branch;
//    }
//    public int getRoll() {
//        return roll;
//    }
//
//    public static int getNew_roll() {
//        return new_roll;
//    }

    public String toString(){
        return "Name: "+name+", Age: "+age+", Roll number: "+roll+", Branch: "+branch;
    }
}
public class refresher_2_q1 {
    public static void main(String[] args) {
        student[] obj = new student[10];

        obj[0] = new student("John", 20, "Computer Science");
        obj[1] = new student("Alice", 22, "Electrical Engineering");
        obj[2] = new student("Bob", 21, "Mechanical Engineering");
        obj[3] = new student("Eve", 19, "Chemical Engineering");
        obj[4] = new student("Michael", 23, "Civil Engineering");
        obj[5] = new student("Sophia", 20, "Computer Science");
        obj[6] = new student("David", 22, "Electrical Engineering");
        obj[7] = new student("Emma", 21, "Mechanical Engineering");
        obj[8] = new student("Jacob", 19, "Chemical Engineering");
        obj[9] = new student("Olivia", 23, "Civil Engineering");

        for (student s : obj) {
            System.out.println(s.toString());
        }
    }
}
