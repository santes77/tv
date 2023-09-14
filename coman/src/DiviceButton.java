import Command.Command;


public class DiviceButton {
   
    private Command command;

    public DiviceButton(VolumenRadioDown volumeDownCommand){
       this.command = VolumeDownCommand;
    }
public void press(){
    command.execute();

}
    public void pressUndo(){
        command.undo();
    }
}
    



