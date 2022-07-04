package src.javakadai;

import javax.swing.*;
import java.awt.*;

class MemotyWeakness{

    public static MemoryWeaknessFrame memoryWeaknessFrame;
    public static boolean loop;
    
    public static void main(String[] args){

        memoryWeaknessFrame = new MemoryWeaknessFrame();
        loop = true;

        //フレームレートの決定と必要変数
        long starttime;
        int fps = 30;

        Graphics gra = memoryWeaknessFrame.memoryWeaknessPanel.image.getGraphics();

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