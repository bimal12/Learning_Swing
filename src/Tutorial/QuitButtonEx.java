package Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by bimal on 0007, 07, 11, 2015.
 */
public class QuitButtonEx extends JFrame {

    public QuitButtonEx() {
        initUI();
    }
    //position a JButton on the window and add an action listener
    private void initUI() {
//create button with string parameter
        JButton quitButton = new JButton("Quit");
        //add action listener to the button.
        //the method action performed will be called when button pressed
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //terminates the application
                System.exit(0);
            }
        });
        //The child components need to be placed into containers
        createLayout(quitButton);

        setTitle("Quit Button");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
//the ... means any number of JComponents
    private void createLayout(JComponent... arg) {
        //container pane is where the components are placed
        //children organised by layoutmanagers. Default is borderLayout, we use GroupLayout
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);
        //creates gaps between components and edges of container
        gl.setAutoCreateContainerGaps(true);
//GroupLayout manager defines the layout for each dimension independently
        //we lay out the horizontal layout and then vertical.
        //we can arrange components sequentially or in parallel
        // In a horizontal layout, a row of components is called a sequential
        // group and a column of components is called a parallel group.
        // In a vertical layout, a column of components is called a sequential
        // group and a row of components a parallel group.
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
        gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                QuitButtonEx ex = new QuitButtonEx();
                ex.setVisible(true);
            }
        });
    }
}
