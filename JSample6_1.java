import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;

class JSample6_1 extends JFrame{
  public static void main(String args[]){
    JSample6_1 frame = new JSample6_1("MyTitle");
    frame.setVisible(true);
  }

  JSample6_1(String title){
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon icon1 = new ImageIcon("1.png");
    ImageIcon icon2 = new ImageIcon("1.png");

    JLabel label1 = new JLabel(icon1);

    JLabel label2 = new JLabel();
    label2.setIcon(icon2);

    JPanel p = new JPanel();
    p.add(label1);
    p.add(label2);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}