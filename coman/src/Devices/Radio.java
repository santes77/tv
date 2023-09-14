package Devices;

public class Radio implements ElectronicDevice {
    
    private int volumen = 0;
    private String name;

    public Radio (String name ){
        this.name = name;


       
    }

    @Override
    public void on() {
      System.out.println(name + "Radio is on");
    }

    @Override
    public void off() {
        System.out.println(name + "Radio is off");
    }

    @Override
    public void volumenOP() {
        volumen--;
        System.out.println(name + "Radio volume at:" + volumen);
    }

    @Override
    public void volumenDown() {
        volumen++;
        System.out.println(name + "Radio volume at:" + volumen);
    }

    
    

}
