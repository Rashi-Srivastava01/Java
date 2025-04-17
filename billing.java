
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class billing{
    public static void main(String[] args){
        JFrame f=new JFrame("billling system");
        JCheckBox a=new JCheckBox("APPLE=100");
        JCheckBox b=new JCheckBox("MANGO=150");
        JCheckBox c=new JCheckBox("BANANA=120");
        JCheckBox d=new JCheckBox("GRAPES=140");
        JButton add=new JButton("ADD");

        add.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int sum=0;
            if(a.isSelected())
                sum=sum+100;
            if(b.isSelected())
                sum=sum+150;
            if(c.isSelected())
                sum=sum+120;
            if(d.isSelected())
                sum=sum+140;  
            

        JOptionPane.showMessageDialog(f, "total:"+sum);      


        }});

        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(add);
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);



    }
}