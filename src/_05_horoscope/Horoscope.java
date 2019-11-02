package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String star=JOptionPane.showInputDialog("What's your star sign?");
	if (star.equals("Scorpio")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope Is: Do your best to avoid being possessive of someone or something today, it's not what you think it is.\n" + 
				"You are likely to feel some fear over a situation today and this will cause you be possessive about someone or something. Unfortunately, this wont lead to a good conclusion so you will be better off letting go a little and seeing what happens next. In all likelihood, things are not how you imagine them to be and holding onto something too tightly will only backfire on you.");
	}
	else if(star.equals("Cancer")){
		JOptionPane.showMessageDialog(null, "Your Horoscope Is: When your plans or changed or called off today, see it positively and use the time well.\n" + 
				"Plans you have will be changed last minute or called off altogether and this will make you annoyed and frustrated. While this is a natural reaction, try to see things positively, take a step back and realise that this could actually work in your favour. A postponement gives you more time to make sure you have everything organised and understood.");
	}
	else if(star.equals("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "Your Horoscope Is: Potential arises in your work life and in your love life today, but maintain stability when making decisions.\n" + 
				"Theres a lot of potential being pulled into your house today and what you choose to do with it is up to you. On the love front, you have the potential for new love or for deeper love with your partner. At work you have the potential for new opportunities, a pay rise, more responsibility, or a change of career completely. Make sure you have stability while deciding");
	}
}
}
