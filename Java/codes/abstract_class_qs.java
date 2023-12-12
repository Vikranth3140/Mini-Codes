abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountain_pen extends pen{
    void write(){
        System.out.println("I am writing with fountain pen");
    }
    void refill(){
        System.out.println("I am refilling fountain pen");
    }
    void change_nib(){
        System.out.println("I am changing nib in fountain pen");
    }
}

class monkey{
    public void jump(){
        System.out.println("monkey jumps");
    }
    public void bite(){
        System.out.println("monkey bites");
    }
}

class human extends monkey implements basicAnimal{

    public void greet1(){
        System.out.println("hello");
    }
    @Override
    public void jump(){
        System.out.println("human jumps");
    }

    @Override
    public void eat(){
        System.out.println("human eats");
    }

    @Override
    public void sleep(){
        System.out.println("human sleeps");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartphone1 extends telephone{
    public void ring(){
        System.out.println("smartphone ringing");
    }
    public void lift(){
        System.out.println("taking call");
    }
    public void disconnect(){
        System.out.println("disconnecting smartphone");
    }
}

interface smartTvRemote{
    void playYt();
    void screen_share();
}

interface tv_remote extends smartTvRemote{
    void switchOn();
    void increaseVol();
}

class Tv implements tv_remote{
    public void switchOn(){
        System.out.println("Switching on");
    }
    public void increaseVol(){
        System.out.println("increasing volume");
    }
    public void playYt(){
        System.out.println("playing youtube");
    }
    public void screen_share(){
        System.out.println("sharing screen");
    }
}


public class abstract_class_qs {
    public static void main(String[] args) {
//        q1, q2
        fountain_pen fp=new fountain_pen();
        fp.change_nib();
        fp.refill();
        fp.write();

//        q3
        human h=new human();
        h.greet1();
        h.eat();
        h.sleep();
        h.jump();

//        q4
        smartphone1 sp=new smartphone1();
        sp.disconnect();
        sp.ring();
        sp.lift();

//        q5
        monkey m1=new human();
        m1.jump();
        m1.bite();

        basicAnimal harry=new human();
        harry.eat();
        harry.sleep();

//        q6, q7
        Tv tv=new Tv();
        tv.switchOn();
        tv.increaseVol();
        tv.playYt();
        tv.screen_share();

    }
}
