package mypart;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.*;

   class Ex1 extends JFrame{
      // 뒷 배경
      Image backgroundImage = new ImageIcon("Image/start.jpg").getImage();
      // 버튼 이미지
      ImageIcon startBtnImage = new ImageIcon("BtnImage/Btn_Play.png");
      
     Ex1(){
           this.setTitle("이미지 그리기 연습");
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           MyPanel panel = new MyPanel();
           panel.setLayout(new FlowLayout());
           
           JButton button = new JButton(startBtnImage);
           panel.add(new JButton(startBtnImage));

           this.add(panel);
           this.setSize(1200,900);
           this.setVisible(true);
           
           button.setBorderPainted(false); // JButton의 Border(외곽선)을 없애준다
           button.setContentAreaFilled(false); // JButton의 내용영역 채우기 안함
           button.setFocusPainted(false); // JButton이 선택(focus)되었을 때 생기는 테두리 사용안함 
           button.setOpaque(false);
      
        
       }
                     
    class MyPanel extends JPanel{
               
           public void paintComponent(Graphics g){
               super.paintComponent(g);
               g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
                         
           }
         
       
   }
   }

   public class howtoplay {
	  
       public static void main(String[] args) {
            new Ex1();
            
       	} 
   }
   
   