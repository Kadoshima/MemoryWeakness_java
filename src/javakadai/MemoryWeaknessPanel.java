package src.javakadai;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

//パネル用のクラス
public class MemoryWeaknessPanel extends JPanel {

    //バッファリングするのに使う
    public BufferedImage image;

    //コンストラクタ *super()の意味*
    public MemoryWeaknessPanel(){
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
