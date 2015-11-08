package Tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by bimal on 0007, 07, 11, 2015.
 */
public class MnemonicEx extends JFrame{

    private void initUI(){
        JButton btn = new JButton("Button");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed");
            }
        });
        //Set the mnemonic for the character from KeyClass (B)
        //and is combined with the modifier (Alt)
        btn.setMnemonic(KeyEvent.VK_B);

        createLayout(btn);

        setTitle("Mnemonics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg){
        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                        .addComponent(arg[0])
                        .addGap(200)
        );

        gl.setVerticalGroup(gl.createParallelGroup()
                        .addComponent(arg[0])
                        .addGap(200)
        );

        pack();

}

    public MnemonicEx() {
        initUI();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MnemonicEx ex = new MnemonicEx();
            ex.setVisible(true);
            }
        });
    }
}


