import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calculator{

    public static void main (String[] args) {
    
        Frame f=new Frame("first goo..");
        Label l=new Label("Enter First no: ");
        Label l1=new Label("Enter Second no.: ");
        Label l2=new Label("RESULT-");
        TextField t1=new TextField();
        TextField t2=new TextField();
        TextField result=new TextField();
        Button add=new Button("ADD");
        Button sub=new Button("SUB");
        Button mult=new Button("MULT");
        Button div=new Button("DIVIDE");
    
        f.setSize(1000,1000);
        f.setBackground(Color.yellow);
        t1.setBounds(200,180,100,30);
        t2.setBounds(200,230,100,30);
        result.setBounds(200,380,100,30);
        l.setBounds(100, 150, 100, 80);
        l1.setBounds(100, 200, 100, 80);
        l2.setBounds(100, 350, 100, 80);
        add.setBounds(150, 300, 100, 40);
        sub.setBounds(260, 300, 100, 40);
        mult.setBounds(370,300,100,40);
        div.setBounds(480,300,100,40);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mult);
        f.add(div);
        f.add(result);
                
        
        add.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e ){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum=a+b;
            result.setText(String.valueOf(sum));

    }});
      sub.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e ){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sub=a-b;
            result.setText(String.valueOf(sub));

    }});
      mult.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e ){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int mult=a*b;
            result.setText(String.valueOf(mult));

    }});
      div.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e ){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int div=a/b;
            result.setText(String.valueOf(div ));

    }});
    
    
    

    

    // f.setLayout(new GridBagLayout());
    f.setLayout(null);
    f.setVisible(true);
    
    }}
   