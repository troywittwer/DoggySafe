import com.sun.glass.events.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Robot;

public class doggoKey {
    
    private int value;
    private Robot myThing;
    
    doggoKey(){
        value = -1;
    }
    
    doggoKey(int i){
        value = i;
    }
    
    public int getKeyValue(){
        switch(value){
            case 0:
                return KeyEvent.VK_NUMPAD0;
            case 1:
                return KeyEvent.VK_NUMPAD1;
            case 2:
                return KeyEvent.VK_NUMPAD3;
            case 3:
                return KeyEvent.VK_NUMPAD3;
            case 4:
                return KeyEvent.VK_NUMPAD4;
            case 5:
                return KeyEvent.VK_NUMPAD5;
            case 6:
                return KeyEvent.VK_NUMPAD6;
            case 7:
                return KeyEvent.VK_NUMPAD7;
            case 8:
                return KeyEvent.VK_NUMPAD8;
            case 9:
                return KeyEvent.VK_NUMPAD9;
            default:
                return -1;
        }
                
                    
    }
}
