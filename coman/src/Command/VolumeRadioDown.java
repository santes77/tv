package Command;

import Devices.ElectronicDevice;

public class VolumeRadioDown implements Command {


    private ElectronicDevice device;

    
    public VolumeRadioDown(ElectronicDevice device) {
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
