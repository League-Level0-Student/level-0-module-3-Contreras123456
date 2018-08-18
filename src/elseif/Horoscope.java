package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		
	String zodiac = JOptionPane.showInputDialog("What is your star sign?");
	
	if(zodiac.equals("aries")) {
		JOptionPane.showMessageDialog(null, "Your zodiac is very courageous, energetic, willful, commanding, and leading.");
	}
	else if(zodiac.equals("taurus")) {
		JOptionPane.showMessageDialog(null, "Taurus's characteristic is to be peaceful and methodical.");
	}
	else if(zodiac.equals("gemini")) {
		JOptionPane.showMessageDialog(null, "Gemini is cerebral, chatty, loves to learn, and is adventurous.");
	}
	else if(zodiac.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "Cancer is emotional, group oriented, seeks security, and family.");
	}
	else if(zodiac.equals("leo")) {
		JOptionPane.showMessageDialog(null, "Leo is generous, organized, and protective.");
	}
	else if(zodiac.equals("virgo")) {
		JOptionPane.showMessageDialog(null, "Virgo is particular, logical, practical, sense of duty, and critical.");
	}
	else if(zodiac.equals("libra")) {
		JOptionPane.showMessageDialog(null, "Libra is balanced, seeks beauty, and sense of justice.");
	}
	else if(zodiac.equals("scorpio")) {
		JOptionPane.showMessageDialog(null, "Scorpio is Passionate, exacting, loves extremes, combative, amd reflective.");
	}
	else if(zodiac.equals("sagittarius")) {
		JOptionPane.showMessageDialog(null, "Sagittarius is happy, absent minded, creative, and adventurous.");
	}
	else if(zodiac.equals("capricorn")) {
		JOptionPane.showMessageDialog(null, "Capricorn is timeless, driven, calculating, and ambitious.");
	}
	}
}
