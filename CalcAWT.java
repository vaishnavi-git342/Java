import java.awt.*;
import java.awt.event.*;

public class CalcAWT extends Frame implements ActionListener{
    TextField t1,t2,res;
    Button add,sub,mul,div;

    CalcAWT(){
        setLayout(new FlowLayout());

        t1=new TextField(5);
        t2=new TextField(5);
        res=new TextField(10);

        add=new Button("+");
        sub=new Button("-");
        mul=new Button("*");
        div=new Button("/");

        add(t1); add(t2);
        add(add); add(sub); add(mul); add(div);
        add(res);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(400,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int r=0;

        if(e.getSource()==add) r=a+b;
        if(e.getSource()==sub) r=a-b;
        if(e.getSource()==mul) r=a*b;
        if(e.getSource()==div) r=a/b;

        res.setText(String.valueOf(r));
    }

    public void paint(Graphics g){
        g.drawString("Simple AWT Calculator",50,50);
    }

    public static void main(String[] args){
        new CalcAWT();
    }
}