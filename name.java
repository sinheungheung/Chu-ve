package mypart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


	public class name extends JFrame{
		JFrame frame = new JFrame();
					// 생성자는 new를 통해 class를 instance화 시킬 때 호출되는 함수
					JLabel img = new JLabel();
					BufferedImage picture;
		

					
					public  name(){
						this.frame.setVisible(true);
						this.frame.setSize(1200, 900); 
						this.setResizable(false); // 창의 크기를 변경하지 못하게
						//this.frame.getContentPane().setBackground(new Color(79, 19, 19));
						this.frame.setLayout(new BorderLayout());
						this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 닫기버튼을 눌렀을 때 해지하기
						this.frame.setLocationRelativeTo(null); // 자동으로 가운데에서 출력
						this.add(img);

						try {
							picture = ImageIO.read(new File("./okay1.png"));
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
						new name();
						
					}

	}
