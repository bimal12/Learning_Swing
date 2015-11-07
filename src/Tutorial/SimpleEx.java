package Tutorial;

import javax.swing.*;
import java.awt.EventQueue;
/**
 * Created by bimal on 0007, 07, 11, 2015.
 */

//Jframe is the top level container and holds all the components of the application

public class SimpleEx extends JFrame{

    public SimpleEx(){
        //good programming practice to delegate code in constructors
        initUI();
    }

    private void initUI(){
        //set the title
        setTitle("Simple Example");
        //set window size 300 wide, 200 tall
        setSize(300, 200);
        //centre the window on the screen
        setLocationRelativeTo(null);
        //Closes the window when the close button is clicked, default action is nothing
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        //This places the application on the SwingEventQueue
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleEx ex = new SimpleEx();
                ex.setVisible(true);
            }
        });
    }

}
