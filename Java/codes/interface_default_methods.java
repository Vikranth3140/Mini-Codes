interface camera{
    void takeSnap();
    void recordVideo();
    default void record4k(){
        System.out.println("Recording in 4k");
    }
}

interface wifi{
    String[] getNetworks();
    void connectToNetworks(String Network);
}

class cellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class smartPhone extends cellphone implements wifi, camera{
    public void takeSnap(){
         System.out.println("taking a snap");
    }
    public void recordVideo(){
        System.out.println("Recording a video...");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Anjali5G", "Prashant"};
        return networkList;
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to "+network);
    }
}

public class interface_default_methods {
    public static void main(String[] args) {
        smartPhone sp=new smartPhone();
//        sp.record4k();
        String[] ar=sp.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }
    }
}
