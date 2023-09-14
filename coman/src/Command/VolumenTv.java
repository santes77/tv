package Command;

import Devices.ElectronicDevice;

public class VolumenTv implements Command {


    private ElectronicDevice device;

    
    public VolumenTv(ElectronicDevice device) {
        this.device=device;
 
    }


    @Override
    public void execute() {
       device.volumenDown() ;
    }


    @Override
    public void undo() {
    device.volumenOP();
    }

    
    }

    
    

