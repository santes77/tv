package Command;
import Devices.ElectronicDevice;

public class TurnOnTelevision implements Command {

   private ElectronicDevice divice;

   public TurnOnTelevision(ElectronicDevice device){
    
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

