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
      // �� ���
      Image backgroundImage = new ImageIcon("Image/start.jpg").getImage();
      // ��ư �̹���
      ImageIcon startBtnImage = new ImageIcon("BtnImage/Btn_Play.png");
      
     Ex1(){
           this.setTitle("�̹��� �׸��� ����");
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
           MyPanel panel = new MyPanel();
           panel.setLayout(new FlowLayout());
           
           JButton button = new JButton(startBtnImage);
           panel.add(new JButton(startBtnImage));

           this.add(panel);
           this.setSize(1200,900);
           this.setVisible(true);
           
           button.setBorderPainted(false); // JButton�� Border(�ܰ���)�� �����ش�
           button.setContentAreaFilled(false); // JButton�� ���뿵�� ä��� ����
           button.setFocusPainted(false); // JButton�� ����(focus)�Ǿ��� �� ����� �׵θ� ������ 
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
   
   