package Treasurehunt;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ����
// ���� : https://selfdevelope.tistory.com/623
// ���� ����Ʈ : https://selfdevelope.tistory.com/623
//            https://www.sellbuymusic.com/search/soundeffect/1134,1140/0/1
public class Music {
    
	// ��� ����
	public static void audio() {
		try {
			File file = new File("music\\musicA.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (Exception e) {
		}
	}
	
	// ���� ȿ����
	public static void audio1() {
		try {
			File file = new File("music\\m1.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
		} catch (Exception e) {
		}
	}
	
	// �� ���� ȿ����
	public static void audio2() {
		try {
			File file = new File("music\\m2.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(file));
			clip.start();
		} catch (Exception e) {
		}
	}
}