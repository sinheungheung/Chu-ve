package mypart;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class rule extends JFrame{
   // 생성자는 new를 통해 class를 instance화 시킬 때 호출되는 함수
   JLabel img = new JLabel();
   BufferedImage picture;
  // JButton jbutton = new JButton(new ImageIcon(""));
  
   public rule(){
      this.setSize(1200, 900);
      this.setResizable(false); // 창의 크기를 변경하지 못하게
      this.setLocationRelativeTo(null); // 자동으로 가운데에서 출력
      this.setLayout(new BorderLayout());
      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  // 닫기버튼을 눌렀을 때 해지하기
      add(img); 
     
//      jbutton.setBounds(530,180,68,103);
//      jbutton.setBorderPainted(false);
//      jbutton.setContentAreaFilled(false);
//      jbutton.setFocusPainted(false);
//      jbutton.setToolTipText("text");
//      add(jbutton);
      
      try {
         picture = ImageIO.read(new File("Image/start.jpg")); 
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
     
   @Override
   public void paint(Graphics g) {

      img.setIcon(new ImageIcon(picture.getScaledInstance(img.getWidth(), img.getHeight(), 4)));
      super.paint(g);
   }
   

   public static void main(String[] args) {
      
      new rule().setVisible(true);
      
   }
   
}