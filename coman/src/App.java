import Command.TurnOffAllDevices;
import Command.TurnOffRadio;
import Command.TurnOffTelevison;
import Command.TurnOnRadio;
import Command.TurnOnTelevision;
import Command.VolumenTvDown;
import Command.VolumenTvOp;
import Devices.ElectronicDevice;
import Devices.Radio;
import Devices.Television;



public class App {
    public static void main(String[] args) throws Exception {
        ElectronicDevice televisionone = new Television("SAMSUNG");

        TurnOnTelevision onCommand = new TurnOnTelevision(televisionone);

        DiviceButton onpressd;
        onpressd = new DiviceButton(onCommand);
        onpressd.press();


        TurnOffTelevison offcommand = new TurnOffTelevison(televisionone);
        onpressd = new DiviceButton(offcommand);
        onpressd.press();

        VolumenTvOp volOpcommandtv = new VolumenTvOp(televisionone);
        onpressd = new DiviceButton(volOpcommandtv);
        onpressd.press();
        onpressd.press();
        onpressd.press();

        VolumenTvDown volumenDownCommandtv = new VolumenTvDown(televisionone);
        onpressd = new DiviceButton(volumenDownCommandtv);
        onpressd.press();



 ElectronicDevice Radiotwo = new Radio("two");

        TurnOnRadio onCommandTwo = new TurnOnRadio(RadioTwo);

        DiviceButton onpressdTwo;
        onpressd = new DiviceButton(onCommand);
        onpressd.press();


        TurnOffRadio offcommandR = new TurnOffRadio(RadioTwo);
        onpressd = new DiviceButton(offcommandR);
        onpressd.press();

        VolumenTvOp volOpcommand = new VolumenTvOp(Radiotwo);
        onpressd = new DiviceButton(volOpcommand);
        onpressd.press();
        onpressd.press();
        onpressd.press();

        VolumenRadioDown volumenDownCommand = new VolumenDownRadio(RadioTwo);
        onpressd = new DeviceButton(volumenDownCommand);
        onpressd.press();
    }
}

    

