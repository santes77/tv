package Command;
import Devices.ElectronicDevice;

public class TurnOffRadio implements Command {

   private ElectronicDevice divice;
   public TurnOffRadio(ElectronicDevice device){
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
