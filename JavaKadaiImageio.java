import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//パネル用のクラス
class GamePanel extends JPanel{
    
    //バッファリングするのに使う
    public BufferedImage image;

    //コンストラクタ *super()の意味*
    public GamePanel(){
        super();
        this.image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
    }

    //JFrameからオーバーライドしてpaintを再定義
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(image, 0, 0, this);
    }

    //このメソッドを読んだら画面が描画される
    public void draw(){
        this.repaint();
    }
}

class GameFrame extends JFrame{

    //変数として用意
  public GamePanel panel;

  public GameFrame(){

    //パネルのインスタンス化
    panel = new GamePanel();

    //JFrameにPanelをadd
    this.add(panel);

    this.setTitle("神経衰弱");
    this.setSize(500, 500);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }
 
}

class JavaKadaiImageio{

    public static GameFrame gameframe;
    public static boolean loop;

    public static void main(String[] args){
        gameframe = new GameFrame();
        loop = true;

        //フレームレートの決定と必要変数
        long starttime;
        int fps = 30;

        Graphics gra = gameframe.panel.image.getGraphics();

        //ゲームのループ
        while(loop){
            //現在の時刻を記録
            starttime = System.currentTimeMillis();

            //描画
            gra.setColor(Color.WHITE);
            gra.fillRect(0, 0, 500, 500);

            gra.setColor(Color.BLACK);
            gra.fillRect(100, 100, 100, 100);

            //フレームレート用のスリープと計算
            try{
                Thread.sleep((1000 / fps) - (System.currentTimeMillis() - starttime));
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
