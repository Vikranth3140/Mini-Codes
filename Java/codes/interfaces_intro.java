interface biCycle{
    int a=45;
    void brake(int decrement);
    void speedup(int increment);
}

interface blowHorn{
    void english();
    void hindi();
}

class avoncycle implements biCycle, blowHorn{

    public void brake(int decrement){

        System.out.println("Applying break with decrement");
    }
    public void speedup(int increment){

        System.out.println("Applying speedup with increment");
    }
    public void english(){
        System.out.println("Good morning");
    }
    public void hindi(){
        System.out.println("Namaste");
    }
}

public class interfaces_intro {
    public static void main(String[] args) {
        avoncycle avon = new avoncycle();

    }
}
