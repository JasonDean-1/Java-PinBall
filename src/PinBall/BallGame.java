package PinBall;

import java.io.IOException;

import javax.swing.JFrame;

public class BallGame
{
	/**
	 * ¿ªÊ¼ÓÎÏ·
	 * 
	 * @return void
	 */
	public static void main(String[] args) throws IOException
	{
		BallFrame ballFrame = new BallFrame();
		ballFrame.pack();
		ballFrame.setVisible(true);
		ballFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
