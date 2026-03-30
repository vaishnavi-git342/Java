import java.awt.*;
import java.awt.event.*;

public class MaxThreeAWT extends Frame implements ActionListener {
    TextField t1, t2, t3, res;
    Button b;

    MaxThreeAWT() {
        setLayout(new FlowLayout());

        add(new Label("Number 1:"));
        t1 = new TextField(5);
        add(t1);

        add(new Label("Number 2:"));
        t2 = new TextField(5);
        add(t2);

        add(new Label("Number 3:"));
        t3 = new TextField(5);
        add(t3);

        b = new Button("Find Max");
        add(b);
        b.addActionListener(this);

        res = new TextField(15);
        res.setEditable(false);
        add(res);

        setTitle("Maximum of Three Numbers");
        setSize(350, 200);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = Math.max(n1, Math.max(n2, n3));
            res.setText("Maximum = " + max);
        } catch (NumberFormatException ex) {
            res.setText("Enter valid integers");
        }
    }

    public static void main(String[] args) {
        new MaxThreeAWT();
    }
}