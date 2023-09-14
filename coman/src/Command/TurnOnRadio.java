package Command;
import Devices.ElectronicDevice;

public class TurnOnRadio implements Command {

   private ElectronicDevice divice;
   private TurnOnRadio(ElectronicDevice device){
    
   }
   
    
    @Override
      public void execute() {
        divice.on();
      }
    

    @Override
    public void undo() {
     divice.off();
    }
}
