package Treasurehunt;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

// 게임 시작 화면
public class Start extends JFrame {
	Container c = getContentPane(); // 컨텐트팬 생성
	JButton bt = new JButton();     // 게임 이동 버튼 생성
	JButton bt2 = new JButton();    // 게임 설명 버튼 생성
	
	Start() {
		
		c.setLayout(null); // 배치 관리자 해제

		// 이미지 크기 조절 참고 : https://eating-coding.tistory.com/5
		// 게임 이동 (이미지 크기 조절 후 버튼에 창착)
		ImageIcon bimg = new ImageIcon("img\\startbtn.png");
		Image bimg1 = bimg.getImage();
		Image bimg2 = bimg1.getScaledInstance(400, 70, Image.SCALE_SMOOTH);
		ImageIcon bimg3 = new ImageIcon(bimg2);

		bt = new JButton(bimg3);
		bt.setBounds(400, 430, 400, 70);
		c.add(bt);
		bt.addMouseListener(new clickListener()); // 이벤트 리스너 부착

		// 게임 설명 (이미지 크기 조절 후 버튼에 창착)
		ImageIcon bimg2_1 = new ImageIcon("img\\Explanationbtn.png");
		Image bimg2_2 = bimg2_1.getImage();
		Image bimg2_3 = bimg2_2.getScaledInstance(400, 70, Image.SCALE_SMOOTH);
		ImageIcon bimg2_4 = new ImageIcon(bimg2_3);

		bt2 = new JButton(bimg2_4);
		bt2.setBounds(400, 550, 400, 70);
		c.add(bt2);
		bt2.addMouseListener(new clickListener2()); // 이벤트 리스너 부착

		// 배경
		JLabel bg = new JLabel();

		ImageIcon ba = new ImageIcon("img\\start.png");
		Image bac = ba.getImage();
		Image back = bac.getScaledInstance(1200, 770, Image.SCALE_SMOOTH);
		ImageIcon backg = new ImageIcon(back);
		bg = new JLabel(backg);
		bg.setBounds(0, -5, 1200, 770);
		c.add(bg);

		// 창 설정
		setSize(1200, 800);          // 창 크기
		setVisible(true);            // 화면에 보임
		setTitle("보물찾기");           // 타이틀명
		setLocationRelativeTo(null); // 창 가운데 배치
		setResizable(false);         // 창 크기 고정

		// 종료시 완전 히 끔
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 게임 이동 이벤트 리스너
	public class clickListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			new Level2();
			setVisible(false);
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	// 게임 설명 이벤트 리스너
	public class clickListener2 implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			new Explanation();
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}

	// 메인 함수
	public static void main(String args[]) {
		new Start();
		Music.audio();
	}
}
