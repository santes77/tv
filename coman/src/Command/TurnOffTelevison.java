package Command;
import Devices.ElectronicDevice;

public class TurnOffTelevison implements Command {

   private ElectronicDevice divice;
   public TurnOffTelevison(ElectronicDevice device){
    this.divice = device;
   }
   
    
    @Override
      public void execute() {
        divice.off();
      }
    

    @Override
    public void undo() {
     divice.on();
    }
}


    

