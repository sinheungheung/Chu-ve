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
   // �����ڴ� new�� ���� class�� instanceȭ ��ų �� ȣ��Ǵ� �Լ�
   JLabel img = new JLabel();
   BufferedImage picture;
   
  //   JButton jbutton = new JButton("");  
  // JButton jbutton = new JButton(new ImageIcon());  
    
   // btn2�̶�� ���� ��ư�� ����...
   
   // �ٵ� ������ �ִ� JButton btn1 = new JButton("");�̰Ÿ� ���ϱ�
   // ����� �ȶ� ������ ���� ���� 
   public rule(){
	   
	   super("���ӹ�� â"); // Ÿ��Ʋ
	   JPanel jPanel = new JPanel();
	   JButton btn1 = new JButton("BtnImage/play.jpg"); // ��� 
	   JButton btn2 = new JButton(""); // �г��� �Է�â <- ����� �־������
	 
	  // jPanel.add(btn1);
	   jPanel.add(btn2);
	   add(jPanel);
	   
	   Dimension frameSize = getSize();
	   
	   Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
	   setLocation((windowSize.width - frameSize.width)/2,
			   (windowSize.height - frameSize.height)/2); //  ȭ�� �߾ӿ� ����
	   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);
       
       // �߿��� �κ� (�г��� �Է�â���� �Ѿ���� ���ӹ�� â �� ���̰� �ϱ�)
       btn1.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   new Part1();
    		   setVisible(false); //  â �Ⱥ��̰� �ϱ�
    	   }
       });
 
       
       btn1.setBorderPainted(false); // JButton�� Border(�ܰ���)�� �����ش�
       btn1.setContentAreaFilled(false); // JButton�� ���뿵�� ä��� ����
       btn1.setFocusPainted(false); // JButton�� ����(focus)�Ǿ��� �� ����� �׵θ� ������ 
      
       //   add(jbutton);
       
      this.setSize(1200, 900);
      this.setResizable(false); // â�� ũ�⸦ �������� ���ϰ�
      this.setLocationRelativeTo(null); // �ڵ����� ������� ���
      this.setLayout(new BorderLayout());
      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  // �ݱ��ư�� ������ �� �����ϱ�
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
		super("�г��� �Է�â");
				
		// �г��� �Է�â ��� �̹��� ��������
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
//               (windowSize.height - frameSize.height) / 2); //ȭ�� �߾ӿ� ����
//       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//       setVisible(true);
	}



   public static void main(String[] args) {
	   
      new rule().setVisible(true);
     
   }
   
}


// �� ���� �߳ĸ� https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=grinbi0921&logNo=220386889876
// https://dinae.tistory.com/27