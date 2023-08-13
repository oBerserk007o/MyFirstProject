import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
public class TicTacToe implements ActionListener {
    // Initializing main components
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JButton[][] buttons;
    int[][] buttonList = new int[3][3];
    JLabel label1;
    JLabel label2;
    int score1 = 0;
    int score2 = 0;
    int turn = 0;
    Font comfortaa = Font.createFont(Font.TRUETYPE_FONT,
            new File("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\Comfortaa-VariableFont_wght.ttf"));

    public TicTacToe() throws IOException, FontFormatException {
        // Setting up the frame
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(710, 710);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setIconImage(Toolkit.getDefaultToolkit()
                .getImage("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\tictactoe_icon.png"));
        frame.setLayout(new BorderLayout(0, 5));
        frame.setResizable(false);
        frame.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Setting up player score display
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 1));
        panel1.setBackground(new Color(76, 194, 115));
        label1 = new JLabel("Player 1's score: " + score1);
        label2 = new JLabel("Player 2's score: " + score2);
        label1.setFont(comfortaa.deriveFont(Font.BOLD, 20f));
        label2.setFont(comfortaa.deriveFont(Font.BOLD, 20f));
        panel1.setBorder(null);
        panel1.add(label1);
        panel1.add(label2);

        // Setting up Tic Tac Toe display
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 3, 10, 10));
        panel2.setBackground(new Color(0, 0, 0));
        panel2.setBorder(null);

        // Setting up Tic Tac Toe buttons
        buttons = new JButton[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(new Color(76, 194, 115));
                buttons[i][j].addActionListener(this);
                buttons[i][j].setFocusable(false);
                buttons[i][j].setBorder(null);
                panel2.add(buttons[i][j]);
            }
        }

        // Adding everything to the frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException, FontFormatException {new TicTacToe();}

    // Setting up button action
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (e.getSource() == buttons[i][j]) {
                    buttons[i][j].setEnabled(false);
                    if (turn % 2 == 0) {
                        buttons[i][j].setDisabledIcon(
                                new ImageIcon("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\tictactoe_x.png"));
                        buttons[i][j].setIcon(
                                new ImageIcon("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\tictactoe_x.png"));
                        buttonList[i][j] = 1;
                    }
                    else {
                        buttons[i][j].setDisabledIcon(
                                new ImageIcon("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\tictactoe_o.png"));
                        buttons[i][j].setIcon(
                                new ImageIcon("C:\\Users\\Dorno\\Desktop\\Coding projects\\Java\\MyFirstProject\\src\\resources\\tictactoe_o.png"));
                        buttonList[i][j] = 2;
                    }
                }
            }
        }

        for(int i = 0; i < 3; i++) {
            if (buttonList[i][0] == buttonList[i][1] && buttonList[i][1] == buttonList[i][2] && buttonList[i][0] != 0) {
                if (turn % 2 == 0) {
                    score1++;
                    label1.setText("Player 1's score: " + score1);
                    System.out.println("Player 1 scored!");
                }
                else {
                    score2++;
                    label2.setText("Player 2's score: " + score2);
                    System.out.println("Player 2 scored!");
                }
                try {
                    resetAllButtons();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        for(int j = 0; j < 3; j++) {
            if (buttonList[0][j] == buttonList[1][j] && buttonList[1][j] == buttonList[2][j] && buttonList[0][j] != 0) {
                if (turn % 2 == 0) {
                    score1++;
                    label1.setText("Player 1's score: " + score1);
                    System.out.println("Player 1 scored!");
                }
                else {
                    score2++;
                    label2.setText("Player 2's score: " + score2);
                    System.out.println("Player 2 scored!");
                }
                try {
                    resetAllButtons();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }

        if (buttonList[0][0] == buttonList[1][1] && buttonList[1][1] == buttonList[2][2] && buttonList[0][0] != 0) {
            if (turn % 2 == 0) {
                score1++;
                label1.setText("Player 1's score: " + score1);
                System.out.println("Player 1 scored!");
            }
            else {
                score2++;
                label2.setText("Player 2's score: " + score2);
                System.out.println("Player 2 scored!");
            }
            try {
                resetAllButtons();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

        if (buttonList[0][2] == buttonList[1][1] && buttonList[1][1] == buttonList[2][0] && buttonList[0][2] != 0) {
            if (turn % 2 == 0) {
                score1++;
                label1.setText("Player 1's score: " + score1);
                System.out.println("Player 1 scored!");
            }
            else {
                score2++;
                label2.setText("Player 2's score: " + score2);
                System.out.println("Player 2 scored!");
            }
            try {
                resetAllButtons();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

        turn++;
    }

    public void resetAllButtons() throws InterruptedException {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setIcon(null);
                buttons[i][j].setEnabled(true);
                buttonList[i][j] = 0;
                turn = 1;
            }
        }
    }
}
