package dev.zero.ticTacToe;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Board extends JPanel implements ActionListener {

	private JButton B1, B2, B3, B4, B5, B6, B7, B8, B9; // Buttons
	private GameArray GArray; // Class with Array
	private boolean Player = false;
	private int PlayerMark = 1;

	/*
	 * Player is the Current players turn. if false player 1 will play else
	 * player 2 PlayerMark is to set number to the array "1" for player 1 and
	 * "2" for player 2
	 */
	Board() {

		// creates the panel
		setLayout(new GridLayout(3, 3));

		B1 = new JButton("");
		B2 = new JButton("");
		B3 = new JButton("");
		B4 = new JButton("");
		B5 = new JButton("");
		B6 = new JButton("");
		B7 = new JButton("");
		B8 = new JButton("");
		B9 = new JButton("");

		SetGame();

		add(B1);
		add(B2);
		add(B3);
		add(B4);
		add(B5);
		add(B6);
		add(B7);
		add(B8);
		add(B9);

		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
		B5.addActionListener(this);
		B6.addActionListener(this);
		B7.addActionListener(this);
		B8.addActionListener(this);
		B9.addActionListener(this);

	}

	public void SetGame() {

		GArray = new GameArray(this);

		DefaultText();
		DisableAll(true);

		Player = false; // default Value
		PlayerMark = 1; // default Value
	}

	public void Reset() {

		SetGame(); // To Reset the Game

	}

	public void actionPerformed(ActionEvent E) {

		JButton Pressed = (JButton) E.getSource();

		/*
		 * if any button is pressed the value is sent to GameArray class
		 */
		if (Pressed == B1) {
			GArray.ArrayInitialize(0, 0, PlayerMark);
			SetText(Pressed, Player); // chaneg button text to "X" or "O" based
										// on player turn
			PlayerMark = SwithTurn(Player); // Swithch Turns
			ButtonDisabler(B1); // Disable pressed Button

		} else if (Pressed == B2) {
			GArray.ArrayInitialize(0, 1, PlayerMark);
			SetText(Pressed, Player);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B2);
		} else if (Pressed == B3) {
			GArray.ArrayInitialize(0, 2, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B3);

		} else if (Pressed == B4) {
			GArray.ArrayInitialize(1, 0, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B4);

		} else if (Pressed == B5) {
			GArray.ArrayInitialize(1, 1, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B5);

		} else if (Pressed == B6) {
			GArray.ArrayInitialize(1, 2, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B6);
		} else if (Pressed == B7) {
			GArray.ArrayInitialize(2, 0, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B7);
		} else if (Pressed == B8) {
			GArray.ArrayInitialize(2, 1, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B8);
		} else if (Pressed == B9) {
			GArray.ArrayInitialize(2, 2, PlayerMark);
			SetText(Pressed, Player);
			PlayerMark = SwithTurn(Player);
			ButtonDisabler(B9);
		}

	}

	public int SwithTurn(boolean last) {

		// if the past player was false(player 1) then swith to true(player 2)
		System.out.println();

		if (last == true) {
			Player = false;
			return 1;

		} else if (last == false) {
			Player = true;
			return 2;
		} else {
			return 3;
		}

	}

	public void ButtonDisabler(JButton Btn) {

		Btn.setEnabled(false); // Disable Button

	}

	public void DisableAll(boolean Opp) {

		// Disable All Buttons
		B1.setEnabled(Opp);
		B2.setEnabled(Opp);
		B3.setEnabled(Opp);
		B4.setEnabled(Opp);
		B5.setEnabled(Opp);
		B6.setEnabled(Opp);
		B7.setEnabled(Opp);
		B8.setEnabled(Opp);
		B9.setEnabled(Opp);

	}

	public void SetText(JButton Btn, boolean Play) {

		if (Play == true) {
			Btn.setText("O");
		} else if (Play == false) {
			Btn.setText("X");
		}

	}

	public void DefaultText() {

		B1.setText("");
		B2.setText("");
		B3.setText("");
		B4.setText("");
		B5.setText("");
		B6.setText("");
		B7.setText("");
		B8.setText("");
		B9.setText("");

	}

}