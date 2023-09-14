package Command;

import Devices.ElectronicDevice;
import java.util.List;

public class TurnOffAllDevices implements Command { 
 
List< ElectronicDevice> allDevices;



public TurnOffAllDevices( List<ElectronicDevice>newdDevices){
    allDevices = newdDevices;

}

@Override
public void execute() {
    
    for (ElectronicDevice divice:allDevices){
        divice.off();
    }
}

@Override
public void undo(){


  for (ElectronicDevice divice:allDevices){
        divice.on(); 
}   
    {
        
    }
}
}