package mypart;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class rule extends JFrame{
   // 생성자는 new를 통해 class를 instance화 시킬 때 호출되는 함수
   JLabel img = new JLabel();
   BufferedImage picture;
   
  //   JButton jbutton = new JButton("");  
  // JButton jbutton = new JButton(new ImageIcon());  
    
   // btn2이라는 투명 버튼을 만들어서...
   
   // 근데 문제가 있다 JButton btn1 = new JButton("");이거를 쓰니까
   // 배경이 안떠 문제가 많다 많아 
   public rule(){
	   
	   super("게임방법 창"); // 타이틀
	   JPanel jPanel = new JPanel();
	   JButton btn1 = new JButton("BtnImage/play.jpg"); // 배경 
	   JButton btn2 = new JButton(""); // 닉네임 입력창 <- 여기다 넣어줘야해
	 
	  // jPanel.add(btn1);
	   jPanel.add(btn2);
	   add(jPanel);
	   
	   Dimension frameSize = getSize();
	   
	   Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	   setLocation((windowSize.width - frameSize.width)/2,
			   (windowSize.height - frameSize.height)/2); //  화면 중앙에 띄우기
	   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);
       
       // 중요한 부분 (닉네임 입력창으로 넘어갔을때 게임방법 창 안 보이게 하기)
       btn1.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   new Part1();
    		   setVisible(false); //  창 안보이게 하기
    	   }
       });
 
       
       btn1.setBorderPainted(false); // JButton의 Border(외곽선)을 없애준다
       btn1.setContentAreaFilled(false); // JButton의 내용영역 채우기 안함
       btn1.setFocusPainted(false); // JButton이 선택(focus)되었을 때 생기는 테두리 사용안함 
      
       //   add(jbutton);
       
      this.setSize(1200, 900);
      this.setResizable(false); // 창의 크기를 변경하지 못하게
      this.setLocationRelativeTo(null); // 자동으로 가운데에서 출력
      this.setLayout(new BorderLayout());
      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  // 닫기버튼을 눌렀을 때 해지하기
       add(img); 

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
   
public class Part1 extends JFrame{
	Part1(){
		super("닉네임 입력창");
				
		// 닉네임 입력창 배경 이미지 가져오기
	      try {
	         picture = ImageIO.read(new File("Image/okay.jpg")); 
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	 
	   @Override
	   public void paint(Graphics g) {

	      img.setIcon(new ImageIcon(picture.getScaledInstance(img.getWidth(), img.getHeight(), 4)));
	      super.paint(g);
	   }
	   Dimension frameSize = getSize();
	   Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
//       setLocation((windowSize.width - frameSize.width) / 2,
//               (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
//       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//       setVisible(true);
	}



   public static void main(String[] args) {
	   
      new rule().setVisible(true);
     
   }
   
}


// 뭐 보고 했냐면 https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=grinbi0921&logNo=220386889876
// https://dinae.tistory.com/27