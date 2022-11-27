package mypart;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

   class Rank extends JFrame{
      // 뒷 배경
      Image backgroundImage = new ImageIcon("Image/Ranking.png").getImage();
      // 버튼 이미지
      JButton button;
      
      Rank(){
           this.setTitle("랭킹 확인");
           this.setSize(1200,900);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null);
         
	    	
           MyPanel panel = new MyPanel();
           panel.setLayout(new FlowLayout());
             

           this.add(panel);
           this.setVisible(true);
         
	    

           button = new JButton(new ImageIcon("BtnImage/home.png"));
           button.setBounds(850,680,350,215); 
	   
	   
           button.setContentAreaFilled(false);
           button.setFocusPainted(false);
   	   // button.setBorderPainted(false);
   	 
   	    panel.add(button);
   	    panel.add(panel);
	 
	    add(panel);
   	    
	    setVisible(true);
      
        
       }
                     
    class MyPanel extends JPanel{
               
           public void paintComponent(Graphics g){
               super.paintComponent(g);
               g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
                         
           }
         
       
   }
   }

   public class Ranking {
	  
       public static void main(String[] args) {
            new Rank();
            
       	} 
   }
   
   