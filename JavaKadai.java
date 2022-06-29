import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Dimension;

class Card{

  private ImageIcon icon;
  private JLabel label;

  Card(Integer argc){
    icon = new ImageIcon(argc + ".png");
    label = new JLabel(icon);
    label.setPreferredSize(new Dimension(200, 100));
  }

  public JLabel labelreturn(){
    return(label);
  }
}

class GameFrame extends JFrame{

  JPanel panel = new JPanel();

  public GameFrame(String title){
    setTitle(title);
    setBounds(100, 100, 600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void GameCleate(){

    Card card1 = new Card(1);
    Card card2 = new Card(2);
    Card card3 = new Card(3);

    panel.add(card1.labelreturn());
    panel.add(card2.labelreturn());
    panel.add(card3.labelreturn());
    
    Container contentPane = getContentPane();
    contentPane.add(panel, BorderLayout.CENTER);
  } 
}

class JavaKadai extends JFrame{
  public static void main(String args[]){
    GameFrame frame = new GameFrame("神経衰弱ゲーム");
    
    frame.GameCleate();

    frame.setVisible(true);
  }
}