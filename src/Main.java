import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        while (!gameOver) {
            Random rand = new Random();
            int x = rand.nextInt(3) + 1;
            String[] options = {"Rock", "Paper", "Scissors"};
            Object UserChoice = JOptionPane.showInputDialog(null, "Select your choice", "Rock Paper Scissors", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            String choice = (String) UserChoice;
            switch (choice) {
                case "Rock" -> {
                    if (x == 1) {
                        JOptionPane.showMessageDialog(null, "You Chose Rock and Computer chose Rock  You Tied");
                    } else if (x == 2) {
                        JOptionPane.showMessageDialog(null, "You Chose Rock and Computer chose Paper You Lose");
                    } else {
                        JOptionPane.showMessageDialog(null, "You Chose Rock and Computer chose Scissors You Win");
                    }
                }
                case "Paper" -> {
                    if (x == 1) {
                        JOptionPane.showMessageDialog(null, "You Chose Paper and Computer chose Rock You Win");
                    } else if (x == 2) {
                        JOptionPane.showMessageDialog(null, "You Chose Paper and Computer chose Paper You Tied");
                    } else {
                        JOptionPane.showMessageDialog(null, "You Chose Paper and Computer chose Scissors You Lose");
                    }
                }
                case "Scissors" -> {
                    if (x == 1) {
                        JOptionPane.showMessageDialog(null, "You Chose Scissors and Computer chose Rock You Lose");
                    } else if (x == 2) {
                        JOptionPane.showMessageDialog(null, "You Chose Scissors and Computer chose Paper You Win");
                    } else {
                        JOptionPane.showMessageDialog(null, "You Chose Scissors and Computer chose Scissors You Tied");
                    }
                }
            }
            int PlayMore = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
            if (PlayMore != JOptionPane.YES_OPTION) {
                gameOver = true;
            }





        }
    }
}