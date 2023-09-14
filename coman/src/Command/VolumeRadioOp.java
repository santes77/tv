package Command;

import Devices.ElectronicDevice;

public class VolumeRadioOp implements Command {


    private ElectronicDevice device;

    
    public VolumeRadioOp(ElectronicDevice device) {
        this.device=device;
 
    }


    @Override
    public void execute() {
       device.volumenOP() ;
    }


    @Override
    public void undo() {
    device.volumenDown();
    }

    
    }