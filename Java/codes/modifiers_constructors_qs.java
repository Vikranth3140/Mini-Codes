class cylinder{
    private int radius;
    private int height;
    private int are;
    private int volume;

    public cylinder(int r, int h){
        this.radius=r;
        this.height=h;
    }

    public int getHt(){
        return height;
    }
    public void setHt(int h){
        this.height=h;
    }
    public int getRd(){
        return radius;
    }
    public void setRd(int r){
        this.radius=r;
    }

    public double surface_area(){
//        2pi r(r+h)
        double ar=2*Math.PI*(radius)*(radius+height);
        return ar;
    }
    public double volume(){
//        pi r^2 h
        double vol=Math.PI*radius*radius*height;
        return vol;
    }
}

public class modifiers_constructors_qs {
    public static void main(String[] args) {
        cylinder cy=new cylinder(9, 12);
//        cy.setRd(9);
//        int radius= cy.getRd();
//        cy.setHt(12);
//        int height= cy.getHt();

        System.out.println("Surface area of cylinder: "+cy.surface_area());
        System.out.println("Volume of cylinder: "+cy.volume());
    }
}
