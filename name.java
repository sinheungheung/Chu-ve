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
					// �����ڴ� new�� ���� class�� instanceȭ ��ų �� ȣ��Ǵ� �Լ�
					JLabel img = new JLabel();
					BufferedImage picture;
		

					
					public  name(){
						this.frame.setVisible(true);
						this.frame.setSize(1200, 900); 
						this.setResizable(false); // â�� ũ�⸦ �������� ���ϰ�
						//this.frame.getContentPane().setBackground(new Color(79, 19, 19));
						this.frame.setLayout(new BorderLayout());
						this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // �ݱ��ư�� ������ �� �����ϱ�
						this.frame.setLocationRelativeTo(null); // �ڵ����� ������� ���
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
