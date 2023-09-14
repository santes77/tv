package Devices;

public class Television implements ElectronicDevice {
    
    private int volumen = 0;
    private String name;

    public Television (String name ){
        this.name = name;


       
    }

    @Override
    public void on() {
    System.out.println(name + " Television is on");
    }

    @Override
    public void off() {
        System.out.println(name + "Television is  off");
    }

    @Override
    public void volumenOP() {
        volumen++;
       System.out.println(name + "Televison volume at: " + volumen);
    }

    @Override
    public void volumenDown() {
        volumen--;
     System.out.println(name + "Television volume at : " +  volumen );
    }

}
