package mypart;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.*;

class Start extends JFrame {
	
	// ¹öÆ° ÀÌ¹ÌÁö
	ImageIcon startBtnImage = new ImageIcon("Image/pepper.png");
	ImageIcon explainBtnImage = new ImageIcon("Image/lettuce.png");
	JButton startBtn = new JButton(startBtnImage);
	JButton explainBtn = new JButton(explainBtnImage);
	
	Start() {
		// µÞ ¹è°æ
		JPanel panel = new JPanel() {
			Image backgroundImage = new ImageIcon("Image/startbackground.png").getImage();
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backgroundImage, 0, 0, null);
			}
		};
		setTitle("°í±â Ãòº£¸¨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		startBtn.setBounds(890, 630, startBtnImage.getIconWidth(), startBtnImage.getIconHeight());
		startBtn.setBorderPainted(false);
		startBtn.setContentAreaFilled(false);
		startBtn.setFocusPainted(false);
		startBtn.setOpaque(false);
		explainBtn.setBounds(0, 630, explainBtnImage.getIconWidth(), explainBtnImage.getIconHeight());
		explainBtn.setBorderPainted(false);
		explainBtn.setContentAreaFilled(false);
		explainBtn.setFocusPainted(false);
		explainBtn.setOpaque(false);
		panel.add(explainBtn);
		panel.add(startBtn);
		setSize(1200, 900);
		add(panel);
		
		Dimension frameSize = getSize();
		 
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //È­¸é Áß¾Ó¿¡ ¶ç¿ì±â
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
        startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Chu_verup();
				setVisible(false);
				
			}
		});
        
        explainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ExplainFrame();
				setVisible(false);
				
			}
		});
		
	}
}

public class StartFrame {
	public static void main(String[] args) {
		new Start();
	}
}