class circle{
    public int radius;

    public circle(int r){
        System.out.println("I am a constructor for circle.");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder1 extends circle{
    public int height;
    public cylinder1(int r, int h){
        super(r);
        System.out.println("I am a constructor for cylinder");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}

public class inheritance_q1{
    public static void main(String[] args) {
        circle ci=new circle(12);
        cylinder cy=new cylinder(12, 4);

        System.out.println(ci.area());
        System.out.println(cy.volume());

    }
}