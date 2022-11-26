package mypart;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.*;

   class Ex1 extends JFrame{
      // 뒷 배경
      Image backgroundImage = new ImageIcon("Image/rule.png").getImage();
      // 버튼 이미지
      JButton bt;
      
     Ex1(){
           this.setTitle("이미지 그리기 연습");
           this.setSize(1200,900);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null);
         
           
	    	
           MyPanel panel = new MyPanel();
           panel.setLayout(new FlowLayout());
           
           
       
	    	 
           bt = new JButton(new ImageIcon("BtnImage/CheckBtn.png"));
	       bt.setBounds(970,700,200,150);
           

           this.add(panel);
           this.setSize(1200,900);
           this.setVisible(true);
         
	    	
	    	 bt.setContentAreaFilled(false);
	    	 bt.setFocusPainted(false);
	    	// bt.setBorderPainted(false);

		
	    	 setVisible(true);
      
        
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
   
   