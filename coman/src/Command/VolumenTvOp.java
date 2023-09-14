package Command;

import Devices.ElectronicDevice;

public class VolumenTvOp implements Command {


    private ElectronicDevice device;

    
    public VolumenTvOp(ElectronicDevice device) {
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

    