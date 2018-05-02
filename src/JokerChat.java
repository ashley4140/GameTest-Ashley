import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class JokerChat {
    public JokerChat() {

        JFrame frame = new JFrame("Chat With Joker");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(245, 255, 221));
        panel.setLayout(new FlowLayout());

        //start image
        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("ChatJoker.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton Exit = new JButton("CLOSE");
        Exit.setLocation(9,688);
        front.add(Exit);
        Exit.setSize(180,55);
        Exit.setText("Exit");
        Exit.setFont(new Font("Arial", Font.BOLD, 31));
        Exit.setForeground(Color.white);
        Exit.setBackground(new java.awt.Color(85, 27, 140));

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                MyChoice mc = new MyChoice();

                //frame.setVisible(false);




            }
        });
        frame.setVisible(true);


    }
}