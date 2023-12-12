class phone{
    public void time(){
        System.out.println("Time is 8 am.");
    }
    public void on(){
        System.out.println("I am a phone.");
    }
}

class smartphone extends phone{
    public void music(){
        System.out.println("playing music.");
    }
    @Override
    public void on(){
        System.out.println("I am a smartphone.");
    }
}

public class methods_dynamic_dispatch {
    public static void main(String[] args) {
        phone obj =new smartphone();
//        smartphone obj2=new phone             Not Allowed

        obj.on();          // Allowed
        obj.time();        // Allowed
//      obj.music();       Not allowed
    }
}
