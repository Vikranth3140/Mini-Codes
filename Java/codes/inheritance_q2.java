class rectangle{
    float length;
    float breadth;

    public rectangle(float l, float b){
        this.length=l;
        this.breadth=b;
    }

    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}

class cuboid extends rectangle{
    float height;
    public cuboid(float l, float b, float h){
        super(l,b);
        this.height=h;
    }

    public float volume(){
        return height*length*breadth;
    }

    public float surface_area(){
        return 2*((length*breadth)+(breadth*height)+(height*breadth));
    }
}

public class inheritance_q2 {
    public static void main(String[] args) {
        rectangle rec=new rectangle(4, 5);
        cuboid cub=new cuboid(4,5,3);

        System.out.println("surface area of cuboid: "+cub.surface_area());
        System.out.println("volume of cuboid: "+cub.volume());

        System.out.println("area of rectangle: "+rec.area());
        System.out.println("perimeter of rectangle: "+rec.perimeter());
    }
}
