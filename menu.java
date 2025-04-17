import java.awt.*;
import java.awt.event.*;
class screen{
    screen(){
        Frame f2=new Frame("file 2");
        f2.setSize(800,800);
        f2.setVisible(true);
    }

}
public class menu {
    public static void main(String[] args) {
        Frame f = new Frame("Menu");
        MenuBar M = new MenuBar();
        f.setMenuBar(M);
        Menu m2 = new Menu("Edit");
        Menu m1 = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        
        m1.add(open);
        m1.add(save);
        m1.addSeparator();

        MenuItem exit = new MenuItem("Exit");
exit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
open.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        new screen();
    
    }

});
m1.add(exit);
M.add(m1);
M.add(m2);
f.setSize(800, 800);
f.setVisible(true);
    }
}