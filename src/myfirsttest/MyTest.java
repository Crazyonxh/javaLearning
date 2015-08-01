package myfirsttest;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.image.*;
import myfirsttest.FileDownLoad;

public class MyTest {
    	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 		MyFrame myTestFrame=new MyFrame("my test");

	}
}
	


class MyFrame extends JFrame{
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8;
	JPanel jp1,jp2,jp3,jp4;
 	Drawing jp5;
 	Drawing card1,card2,card3;
	JTextField jt1,jt2,jt3;
	JMenuBar jmb;
	JMenu jm1,jm2,jm3,jm4;
	JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5;
	MousEven me1;
	KeyEven ke1;
	ActPerformed action1;
	public MyFrame(String s) throws IOException {
		super(s);
//		this.setSize(1000,1000);
		me1=new MousEven();
		ke1=new KeyEven();
		action1=new ActPerformed();
		this.setBounds(0, 0,1000,1000);
		jmb=new JMenuBar();
		this.setJMenuBar(jmb);
		jm1=new JMenu("File");
		jmi1=new JMenuItem("Open");
		jmi5=new JMenuItem("Close");
		jmi2=new JMenu("New");
		jm1.add(jmi2);
		jm1.add(jmi1);
		jmb.add(jm1);
		jm1.addSeparator();
		jm1.add(jmi5);
		jm3=new JMenu("Edit");
		jmi3=new JMenuItem("mc");
		jm3.add(jmi3);
		jmb.add(jm3);
		jmi4=new JMenuItem("New File");
		jmi2.add(jmi4);

		jp5=new Drawing("E:/新建文件夹/myfirsttest/src/myfirsttest/a.jpg");
//		Panel 1
		jp1=new JPanel();
		jt1=new JTextField("0");
		jt2=new JTextField("0");
		jt3=new JTextField("0");
		jp1.setLayout(new GridLayout(2,3));
		jp1.add(new JLabel("test1"));
		jp1.add(new JLabel("test2"));
		jp1.add(new JLabel("test3"));
		jp1.add(jt2);
		jp1.add(jt3);
		jp1.add(jt1);
		jp1.add(jt2);
		jp1.add(jt3);
//		Panel 2
		jp2=new JPanel();
		jb1=new JButton("Input");
		jb2=new JButton("Cancel");
		jb3=new JButton("Reset");
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
//		Panel 3
		jp3=new JPanel();
		card1=new Drawing("E:/新建文件夹/myfirsttest/src/myfirsttest/a.jpg");
		card2=new Drawing("E:/新建文件夹/myfirsttest/src/myfirsttest/a.jpg");
		card3=new Drawing("E:/新建文件夹/myfirsttest/src/myfirsttest/a.jpg");
		jp3.setLayout(new CardLayout());
		jp3.add(card1);
		jp3.add(card2);
		jp3.add(card3);

//		panel4
		jp4=new JPanel();
		jp4.setLayout(new BorderLayout());
		jb4=new JButton("UP");
		jb5=new JButton("DOWN");
		jb6=new JButton("LEFT");
		jb7=new JButton("RIGHT");
		jb8=new JButton("OK");
		jp4.add(jb4,"North");
		jp4.add(jb5,"South");
		jp4.add(jb6,"West");
		jp4.add(jb7,"East");
		jp4.add(jb8,"Center");
//		add panels to frame
 		this.setLayout(new GridLayout(4,1));
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		this.add(jp4);

		
		jb1.addActionListener(action1);
		jb2.addActionListener(action1);
		jb3.addActionListener(action1);
		jb4.addActionListener(action1);
		jb5.addActionListener(action1);
		jb6.addActionListener(action1);
		jb7.addActionListener(action1);
		jb8.addActionListener(action1);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}		

			
		
	class MousEven implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class KeyEven implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int t=e.getKeyCode();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	class ActPerformed implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String s=e.getActionCommand();
			switch (s) {
			case "Input":
				String s1=jt1.getText();
				String s2=jt2.getText();
				String s3=jt3.getText();
				System.out.println("Input clicked"+" "+s1+" "+s2+" "+s3);
				Boolean downloadStatus=false;
				try {
					FileDownLoad fd=new FileDownLoad("http://attach3.bdwm.net/attach/0Announce/groups/GROUP_0/PersonalCorpus/M/Manwe/D13212914/AA30337D9/01.png", "./test5.png");
					downloadStatus=true;
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					downloadStatus=false;
				}
				break;
			case "Cancel":
				System.out.println("Cancel clicked");
				break;
			case "Reset":
				System.out.println("Reset clicked");
				break;
			case "UP":
				System.out.println("Up clicked");
				break;
			case "DOWN":
				System.out.println("Down clicked");
				break;
			case "LEFT":
				System.out.println("Lest clicked");
				break;
			case "RIGHT":
				System.out.println("right clicked");
				break;
			case "OK":
				System.out.println("OK clicked");
				break;
			default:
				break;
			}

			
		}
		
	}
	class Drawing extends JPanel{
		String imgPath;
		public Drawing(String imgPath) throws IOException{
			// TODO Auto-generated constructor stub
			super();
			this.imgPath=imgPath;
			
//			System.out.println(imgPath);
//				img = ImageIO.read(new File("E:/新建文件夹/myfirsttest/src/myfirsttest/a.jpg"));			
//				Graphics2D g2d=img.createGraphics();

//				System.out.println(p);
			


		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
//			Graphics2D g2D=(Graphics2D)g;
//			Boolean p=g2D.drawImage(img, 100, 700, 300, 300, null);
//			System.out.println(p+" "+img.getWidth());
//		  Image img = this.getToolkit().getImage("E:\\新建文件夹\\myfirsttest\\src\\myfirsttest\\a.jpg"); 
		  try {
			  BufferedImage img = ImageIO.read(new File(imgPath));
//			System.out.println(Class.class.getClass().getResource("/").getPath());
			g.drawImage(img, 300, 0,300,200, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}

}



