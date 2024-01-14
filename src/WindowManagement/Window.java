package WindowManagement;

import javax.swing.*;

public class Window {

    public static boolean isOpen = false;
    public static void mainWindow(){
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        isOpen = true;

    }




}
