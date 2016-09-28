package dev.zero.ticTacToe;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Control extends JFrame {

	/*
	 * this is the main controler that controls and combines different
	 * components of the game.
	 */

	private Board GameBoard; // Board and Button
	private Tools TButtons; // Exit and Reset

	public Control() {

		setLayout(new BorderLayout());

		GameBoard = new Board();
		TButtons = new Tools();

		TButtons.SetObject(GameBoard);

		add(GameBoard, BorderLayout.CENTER);
		add(TButtons, BorderLayout.SOUTH);

		setVisible(true);
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
