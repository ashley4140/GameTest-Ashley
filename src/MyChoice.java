import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class MyChoice { //extends JFrame { //StartScreen {
    JFrame frame;
    static MyChoice mc;
    static JokerChat tj;
    static HarveyChat tf;
    static SelinaChat cw;
    static RobinChat dg;
    static AlfredChat ap;
    JPanel panel;
    //public static void main(String args[]) {
    public MyChoice(){
        JFrame frame = new JFrame("Bat Roulette");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(93, 103, 175));
        panel.setLayout(new FlowLayout());

        //start image
        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("game screen.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



        JButton joker = new JButton();
        joker.setLocation(28, 630);
        front.add(joker);
        joker.setSize(93, 38);
        joker.setBackground(Color.cyan);
        joker.setText("Joker");
        joker.setFont(new Font("Arial", Font.BOLD, 15));


        JButton harvey = new JButton();
        harvey.setLocation(178, 630);
        front.add(harvey);
        harvey.setSize(93, 38);
        harvey.setBackground(Color.cyan);
        harvey.setText("Harvey");
        harvey.setFont(new Font("Arial", Font.BOLD, 15));


        JButton catwoman = new JButton();
        catwoman.setLocation(328, 630);
        front.add(catwoman);
        catwoman.setSize(93, 38);
        catwoman.setBackground(Color.cyan);
        catwoman.setText("Selina");
        catwoman.setFont(new Font("Arial", Font.BOLD, 15));


        JButton robin = new JButton();
        robin.setLocation(480, 630);
        front.add(robin);
        robin.setSize(93, 38);
        robin.setBackground(Color.cyan);
        robin.setText("Robin");
        robin.setFont(new Font("Arial", Font.BOLD, 15));

        JButton alfred = new JButton();
        alfred.setLocation(628, 630);
        front.add(alfred);
        alfred.setSize(93, 38);
        alfred.setBackground(Color.cyan);
        alfred.setText("Alfred");
        alfred.setFont(new Font("Arial", Font.BOLD, 15));



        joker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                tj = new JokerChat();


            }
        });

        harvey.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                tf = new HarveyChat();


            }
        });

        catwoman.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                cw = new SelinaChat();



            }
        });

        robin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                RobinChat dg = new RobinChat();


            }
        });






       alfred.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                ap = new AlfredChat();


            }

        });






    frame.setVisible(true);

    }
    }

