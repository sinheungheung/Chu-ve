package mypart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Chu_verup extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphics;
	
	Image backgroundImage = new ImageIcon("Image/mainScreen.png").getImage();
	private Image mouse = new ImageIcon("Image/mouse.png").getImage();
	private Image meet = new ImageIcon("Image/meet.png").getImage();
	
	// �÷��̾��� ��ǥ
	private int mouseX, mouseY;
	// �÷��̾�� ������ �浹 ���� �Ǵ��� ���� �� �̹����� ũ��
	private int mouseWidth = mouse.getWidth(null);
	private int mouseHeight = mouse.getHeight(null);

	// ���� ��ǥ
	private int meetX, meetY;
	// �÷��̾�� ������ �浹 ���� �Ǵ��� ���� �� �̹����� ũ��
	private int meetWidth = meet.getWidth(null);
	private int meetHeight = meet.getHeight(null);
		
	// ����
	private int score;
	
	// Ű������ �������� �޴� ����
	private boolean up, down, left, right;
	
	Chu_verup() {
		setTitle("���� ȭ��");
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				screenDraw(g);
			}
		};
		
		setSize(1200, 900);
		
		add(panel);
		
		Dimension frameSize = getSize();
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //ȭ�� �߾ӿ� ����
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
		
        addKeyListener(new KeyAdapter() {
			// Ű�� ������ �� ���� �� �޼ҵ�
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()){
				case KeyEvent.VK_W:
					up = true;
					break;
				case KeyEvent.VK_S:
					down = true;
					break;
				case KeyEvent.VK_A:
					left = true;
					break;
				case KeyEvent.VK_D:
					right = true;
					break;
				}
				keyProcess();
				crashCheck();
			}
				
			// Ű�� ���� �� ������ �޼ҵ�
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()){
				case KeyEvent.VK_W:
					up = false;
					break;
				case KeyEvent.VK_S:
					down = false;
					break;
				case KeyEvent.VK_A:
					left = false;
					break;
				case KeyEvent.VK_D:
					right = false;
					break;
				}
				keyProcess();
				crashCheck();
			}
		});
		init();
	}
	
	// ���ӽ����� �� �ʱ�ȭ
	public void init() {
		score = 0;
		
		mouseY = (900 - mouseHeight)/2;
		
		//( â��ũ��+1)-�̹����� ����
		meetX = (int)(Math.random()*(901-mouseWidth-250))+250;
		meetY = (int)(Math.random()*(651-mouseHeight-190))+190;	// ���� �ʱ�ȭ, �÷��̾�� ���� ��ġ ����
									// �ִ밪 - �ּҰ�))+�ּҰ�
		System.out.println("��� X��ǥ : " + meetX + " ��� Y��ǥ : " + meetY);
	}
	
	// up, down, left, right�� boolean������ �÷��̾ �̵���ų �޼ҵ�
	public void keyProcess() {
		if(up && mouseY - 3 > 180) mouseY -=5;
		if(down && mouseY + mouseHeight + 3 < 800) mouseY+=5;
		if(left && mouseX -3 > 220) mouseX -=5;
		if(right && mouseX + mouseWidth + 3 < 1000) mouseX+=5;
	}
	
	// �÷��̾�� ������ ����� �� ���� ȹ�� �޼ҵ�
	public void crashCheck() {
		if (mouseX + mouseWidth > meetX+ 70 && 
				meetX + meetWidth > mouseX+70 && 
				mouseY + mouseHeight > meetY+70 && 
				meetY + meetHeight > mouseY+70) {
			score+=100;
			
			meetX = (int)(Math.random()*(901-mouseWidth-250))+250;
			meetY = (int)(Math.random()*(651-mouseHeight-190))+190;
			System.out.println("��� X��ǥ : " + meetX + " ��� Y��ǥ : " + meetY);
		}
	}
	

	// ȭ�� �������� ���� ���� ���۸� ��� ���
	public void paint(Graphics g) {
		// ȭ�� ũ���� ���� �̹����� �����ϰ� getGraphics()�� ���� �׷����� �޾ƿ�
		bufferImage = createImage(1200, 900);
		screenGraphics = bufferImage.getGraphics();
		// �ٽ��ѹ� ȣ���ϰ� ���� �̹����� ȭ�鿡 �׷��ֱ�
		screenDraw(screenGraphics);
		g.drawImage(bufferImage, 0,0,null);
	}
	
	
	
	public void screenDraw(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
		g.drawImage(meet, meetX, meetY, null);
		g.drawImage(mouse, mouseX, mouseY, null);
		// ����
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("SCORE : " + score, 900, 80);
		repaint();
	}
	public static void main(String[] args) {
		new Chu_verup();
	}

}