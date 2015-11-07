package Tutorial;

import javax.swing.*;
import java.awt.*;

/**
 * Created by bimal on 0007, 07, 11, 2015.
 */
public class TooltipEx extends JFrame{

    public TooltipEx(){
initUI();
    }

    public void initUI(){
        JButton btn = new JButton("Button");
        //To enable the tooltip
        btn.setToolTipText("A button component");

        createLayout(btn);

        setTitle("Tooltip");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg){
        //casting container type to JPanel
        JPanel pane = (JPanel) getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        pane.setToolTipText("Content pane");

        gl.setAutoCreateContainerGaps(true);
//Adds some space around the right and bottom of the button
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(200));

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(120));
//Automatically sizes the JFrame on the size of the components
        //includes the spaces defined as well
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TooltipEx ex = new TooltipEx();
                ex.setVisible(true);
            }
        });
    }
}
