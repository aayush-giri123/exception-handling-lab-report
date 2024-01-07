import java.awt.*;
import java.awt.event.*;

public class Test extends Frame implements ActionListener {
    TextField textfield;

    Test() {
        Button button = new Button("click");
        Button clearButton = new Button("clear"); 

        textfield = new TextField();
        button.setBounds(700, 100, 50, 70);
        clearButton.setBounds(700, 400, 50, 70);
        textfield.setBounds(500, 500, 600, 900);

        button.addActionListener(this);
        clearButton.addActionListener(this);

        add(button);
        add(clearButton);
        add(textfield);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("click")) {
            textfield.setText("I AM PLAYING GAME DURING CLASS");
        } else if (e.getActionCommand().equals("clear")) {
            textfield.setText(""); 
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}

