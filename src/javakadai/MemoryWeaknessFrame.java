package src.javakadai;

import javax.swing.*;

public class MemoryWeaknessFrame extends JFrame{

  //変数として用意
  public MemoryWeaknessPanel memoryWeaknessPanel;

  public MemoryWeaknessFrame(){
      
    //パネルのインスタンス化
    memoryWeaknessPanel = new MemoryWeaknessPanel();

    //JFrameにPanelをadd
    this.add(memoryWeaknessPanel);

    this.setTitle("神経衰弱");
    this.setSize(500, 500);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);

  }
}
