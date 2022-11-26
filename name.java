package mypart;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class name extends JFrame{
			  BufferedImage img = null;
			  JTextField logintTextField;
			  JButton bt;
		     public static void main(String[] args) {
		    	 new name();
		    	 
		     }
		     
		     public name() {
		    	 setTitle("닉네입 입력");
		    	 setSize(1200,900);
		    	 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    	 setLayout(null);
		    	 
		    	 // 이미지 빌려오기
		    	 try {
		    		 img = ImageIO.read(new File("Image/okay1.png"));
		    	 }catch(IOException e) {
		    		 System.out.println("이미지 불러오기 실패");
		    		 System.exit(0);
		    	 }
		    	 
		    	 JLayeredPane layeredPane = new JLayeredPane();
		    	 layeredPane.setBounds(0,0,1200,900);
		    	 layeredPane.setLayout(null);
		    	 
		    	 MyPanel panel = new MyPanel();
		    	 panel.setBounds(0, 0, 1200, 900);
		    	
		    	 logintTextField = new JTextField(5);
		    	 logintTextField.setBounds(162,450,901,100); 
		    	 layeredPane.add(logintTextField);
		    	 
		    	 // 로그인버튼 추가
//		    	 bt = new JButton(new ImageIcon("BtnImage/뭐시기 일단"));
//		    	 bt.setBounds(755,689,104,48);
//		    	 layeredPane.add(bt);
		    	 
		    	 layeredPane.add(panel);
		    	 
		    	 add(layeredPane);
		    	 setVisible(true);
		     }
		     class MyPanel extends JPanel{
		    	 public void paint(Graphics g) {
		    		 g.drawImage(img,  0, 0, null);
		    	 }
		     }
		     
}
