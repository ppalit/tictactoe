package dev.zero.ticTacToe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Tools extends JPanel {

	private JButton Exit, Reset;
	private Board Brd;

	Tools() {

		setLayout(new FlowLayout());

		Exit = new JButton("Exit");
		Reset = new JButton("Reset");

		Exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});

		Reset.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {

				Brd.Reset();

			}

		});

		add(Exit);
		add(Reset);
	}

	public void SetObject(Board B) {

		Brd = B;

	}

}