package snake;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

class Main extends JFrame {
    private JPanel p = new JPanel();

    public Main() {
        p.setBackground(Color.CYAN);
        add(p);
        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
        int snakeX = 100;
        int snakeY = 100;
        int snakeWidth = 500;
        int snakeHeight = 50;
        g2.setColor(Color.RED);
        g2.fillRect(snakeX, snakeY, snakeWidth, snakeHeight);
        g2.setColor(Color.BLACK);
        g2.fillOval((int) (0.95 * (snakeX + snakeWidth)), (int) (snakeY + 0.33 * snakeHeight), 10, 10);
        g2.fillOval((int) (0.95 * (snakeX + snakeWidth)), (int) (snakeY + 0.66 * snakeHeight), 10, 10);
    }

    public static void main(String[] args) {
        new Main();
    }
}