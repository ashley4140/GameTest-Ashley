import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


public class RobinChat {
   static RobinEndBad rbd;
   static RobinEndGood rgd;
    //public static void main(String args[]) throws FontFormatException {
public RobinChat(){
        JFrame frame = new JFrame("Chat With Robin");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(245, 255, 221));
        panel.setLayout(new FlowLayout());




        //start image
        JLabel front = new JLabel(new ImageIcon("ChatRobin.jpg"));

        panel.add(front);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        JButton Exit = new JButton("CLOSE");
        Exit.setLocation(9,688);
        front.add(Exit);
        Exit.setSize(180,55);
        Exit.setText("Exit");
        Exit.setFont(new Font("Arial", Font.BOLD, 31));
       Exit.setForeground(Color.white);
        Exit.setBackground(new java.awt.Color(85, 27, 140));
        //Exit.setVisible(false);

        JButton b1 = new JButton();
b1.setLocation(310,685);
front.add(b1);
b1.setSize(100,50);
b1.setBackground(Color.white);
b1.setText("Hello");
b1.setFont(new Font("Arial", Font.BOLD, 15));

JButton b2 = new JButton();
b2.setLocation(450,685);
front.add(b2);
b2.setSize(250,50);
b2.setBackground(Color.white);
b2.setText("What do You Want?");
b2.setFont(new Font("Arial", Font.BOLD, 15));

/*JButton b3 = new JButton();
        b3.setLocation(310,685);
        front.add(b3);
        b3.setSize(220,50);
        b3.setBackground(Color.white);
        b3.setText("You can tell me anything");
        b3.setFont(new Font("Arial", Font.BOLD, 15));

        JButton b4 = new JButton();
        b4.setLocation(550,685);
        front.add(b4);
        b4.setSize(150,50);
        b4.setBackground(Color.white);
        b4.setText("What is it?");
        b4.setFont(new Font("Arial", Font.BOLD, 15));
*/

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JLabel ao1 = new JLabel("Hello");
                front.add(ao1);
                ao1.setSize(350, 50);
                ao1.setText("Batman: Hello Dick.");
                ao1.setLocation(210, 415);
                ao1.setFont(new Font("Arial", Font.BOLD, 24));
                ao1.setForeground(Color.BLUE);

                JLabel r1p1 = new JLabel("Hello");
                front.add(r1p1);
                r1p1.setSize(250, 100);
                r1p1.setText("Robin: Hi Bruce.");
                r1p1.setLocation(210, 430);
                r1p1.setFont(new Font("Arial", Font.BOLD, 24));
                r1p1.setForeground(Color.red);

                JLabel r1p2 = new JLabel("Hello");
                front.add(r1p2);
                r1p2.setSize(550, 100);
                r1p2.setText("I have to talk to you about something.");
                r1p2.setLocation(210, 460);
                r1p2.setFont(new Font("Arial", Font.BOLD, 24));
                r1p2.setForeground(Color.red);

                b1.setVisible(false);
                b2.setVisible(false);

                JButton b1 = new JButton();
                b1.setLocation(310, 685);
                front.add(b1);
                b1.setSize(220, 50);
                b1.setBackground(Color.white);
                b1.setText("You can tell me anything");
                b1.setFont(new Font("Arial", Font.BOLD, 15));

                JButton b2 = new JButton();
                b2.setLocation(550, 685);
                front.add(b2);
                b2.setSize(150, 50);
                b2.setBackground(Color.white);
                b2.setText("What is it?");
                b2.setFont(new Font("Arial", Font.BOLD, 15));

                b1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JLabel bo1 = new JLabel("You Can Tell Me Anything");
                        front.add(bo1);
                        bo1.setSize(500, 50);
                        bo1.setText("Batman: Dick you know you can tell me");
                        bo1.setLocation(210, 530);
                        bo1.setFont(new Font("Arial", Font.BOLD, 24));
                        bo1.setForeground(Color.BLUE);

                        JLabel bo1p1 = new JLabel("You Can Tell Me Anything");
                        front.add(bo1p1);
                        bo1p1.setSize(500, 50);
                        bo1p1.setText("anything.");
                        bo1p1.setLocation(210, 560);
                        bo1p1.setFont(new Font("Arial", Font.BOLD, 24));
                        bo1p1.setForeground(Color.BLUE);

                        JLabel r2p1 = new JLabel("You can tell me anything");
                        front.add(r2p1);
                        r2p1.setSize(450, 100);
                        r2p1.setText("Robin: I appreciate that Bruce.");
                        r2p1.setLocation(210, 570);
                        r2p1.setFont(new Font("Arial", Font.BOLD, 24));
                        r2p1.setForeground(Color.red);

                        JLabel r2p2 = new JLabel("You can tell me anything");
                        front.add(r2p2);
                        r2p2.setSize(600, 100);
                        r2p2.setText("I've been thinking and I feel like its time.");
                        r2p2.setLocation(210, 600);
                        r2p2.setFont(new Font("Arial", Font.BOLD, 24));
                        r2p2.setForeground(Color.red);

                        b1.setVisible(false);
                        b2.setVisible(false);

                        JButton b1 = new JButton();
                        b1.setLocation(310, 685);
                        front.add(b1);
                        b1.setSize(220, 50);
                        b1.setBackground(Color.white);
                        b1.setText("Are You Sure?");
                        b1.setFont(new Font("Arial", Font.BOLD, 15));

                        JButton b2 = new JButton();
                        b2.setLocation(550, 685);
                        front.add(b2);
                        b2.setSize(150, 50);
                        b2.setBackground(Color.white);
                        b2.setText("Time?");
                        b2.setFont(new Font("Arial", Font.BOLD, 15));

                        b1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {

                                JLabel co1 = new JLabel("Are You Sure");
                                front.add(co1);
                                co1.setSize(500, 50);
                                co1.setText("Batman: Do you really want ");
                                co1.setLocation(210, 540);
                                co1.setFont(new Font("Arial", Font.BOLD, 24));
                                co1.setForeground(Color.BLUE);

                                JLabel co1p1 = new JLabel("You Can Tell Me Anything");
                                front.add(co1p1);
                                co1p1.setSize(500, 50);
                                co1p1.setText("to do this.");
                                co1p1.setLocation(210, 570);
                                co1p1.setFont(new Font("Arial", Font.BOLD, 24));
                                co1p1.setForeground(Color.BLUE);

                                JLabel r3p1 = new JLabel("Are You Sure");
                                front.add(r3p1);
                                r3p1.setSize(470, 100);
                                r3p1.setText("Robin: I think i'm ready I even came up ");
                                r3p1.setLocation(210, 580);
                                r3p1.setFont(new Font("Arial", Font.BOLD, 24));
                                r3p1.setForeground(Color.red);

                                JLabel r3p2 = new JLabel("You can tell me anything");
                                front.add(r3p2);
                                r3p2.setSize(600, 100);
                                r3p2.setText("with a new name.");
                                r3p2.setLocation(210, 610);
                                r3p2.setFont(new Font("Arial", Font.BOLD, 24));
                                r3p2.setForeground(Color.red);

                                b1.setVisible(false);
                                b2.setVisible(false);
                                ao1.setVisible(false);
                                r1p1.setVisible(false);
                                r1p2.setVisible(false);
                                bo1.setLocation(210, 410);
                                bo1p1.setLocation(210, 440);
                                r2p1.setLocation(210, 450);
                                r2p2.setLocation(210, 480);

                                JButton b1 = new JButton();
                                b1.setLocation(310, 685);
                                front.add(b1);
                                b1.setSize(150, 50);
                                b1.setBackground(Color.white);
                                b1.setText("What name?");
                                b1.setFont(new Font("Arial", Font.BOLD, 15));

                                JButton b2 = new JButton();
                                b2.setLocation(470, 685);
                                front.add(b2);
                                b2.setSize(250, 50);
                                b2.setBackground(Color.white);
                                b2.setText("I don't like the sound of this");
                                b2.setFont(new Font("Arial", Font.BOLD, 15));

                                b1.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {

                                        JLabel do1 = new JLabel("What Name");
                                        front.add(do1);
                                        do1.setSize(500, 50);
                                        do1.setText("Batman: What name have you chosen? ");
                                        do1.setLocation(210, 540);
                                        do1.setFont(new Font("Arial", Font.BOLD, 24));
                                        do1.setForeground(Color.BLUE);

                                        JLabel r4p1 = new JLabel("What Name");
                                        front.add(r4p1);
                                        r4p1.setSize(450, 100);
                                        r4p1.setText("Robin: NightWing ");
                                        r4p1.setLocation(210, 560);
                                        r4p1.setFont(new Font("Arial", Font.BOLD, 24));
                                        r4p1.setForeground(Color.red);

                                        b1.setVisible(false);
                                        b2.setVisible(false);
                                        bo1.setVisible(false);
                                        bo1p1.setVisible(false);
                                        r2p1.setVisible(false);
                                        r2p2.setVisible(false);
                                        co1.setLocation(210, 410);
                                        co1p1.setLocation(210, 440);
                                        r3p1.setLocation(210, 450);
                                        r3p2.setLocation(210, 480);


                                        JButton b1 = new JButton();
                                        b1.setLocation(310, 685);
                                        front.add(b1);
                                        b1.setSize(150, 50);
                                        b1.setBackground(Color.white);
                                        b1.setText("I like it!");
                                        b1.setFont(new Font("Arial", Font.BOLD, 15));

                                        JButton b2 = new JButton();
                                        b2.setLocation(470, 685);
                                        front.add(b2);
                                        b2.setSize(250, 50);
                                        b2.setBackground(Color.white);
                                        b2.setText("Robin?");
                                        b2.setFont(new Font("Arial", Font.BOLD, 15));

                                        b1.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                JLabel eo1 = new JLabel("i like it");
                                                front.add(eo1);
                                                eo1.setSize(500, 50);
                                                eo1.setText("Batman: I Like it!");
                                                eo1.setLocation(210, 500);
                                                eo1.setFont(new Font("Arial", Font.BOLD, 24));
                                                eo1.setForeground(Color.BLUE);

                                                JLabel r5p1 = new JLabel("i like it");
                                                front.add(r5p1);
                                                r5p1.setSize(450, 100);
                                                r5p1.setText("Robin: Thanks Bruce. ");
                                                r5p1.setLocation(210, 520);
                                                r5p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                r5p1.setForeground(Color.red);

                                                b1.setVisible(false);
                                                b2.setVisible(false);
                                                co1.setVisible(false);
                                                co1p1.setVisible(false);
                                                r3p1.setVisible(false);
                                                r3p2.setVisible(false);
                                                do1.setLocation(210, 410);
                                                r4p1.setLocation(210, 430);



                                                JButton b1 = new JButton();
                                                b1.setLocation(310, 685);
                                                front.add(b1);
                                                b1.setSize(150, 50);
                                                b1.setBackground(Color.white);
                                                b1.setText("Support");
                                                b1.setFont(new Font("Arial", Font.BOLD, 15));

                                                JButton b2 = new JButton();
                                                b2.setLocation(490, 685);
                                                front.add(b2);
                                                b2.setSize(150, 50);
                                                b2.setBackground(Color.white);
                                                b2.setText("Reconsider!");
                                                b2.setFont(new Font("Arial", Font.BOLD, 15));

                                                b1.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        JLabel fo1 = new JLabel("support");
                                                        front.add(fo1);
                                                        fo1.setSize(500, 50);
                                                        fo1.setText("Batman: I hope you know I will");
                                                        fo1.setLocation(210, 500);
                                                        fo1.setFont(new Font("Arial", Font.BOLD, 24));
                                                        fo1.setForeground(Color.BLUE);

                                                        JLabel fo1p1 = new JLabel("support");
                                                        front.add(fo1p1);
                                                        fo1p1.setSize(500, 50);
                                                        fo1p1.setText("always be there for you");
                                                        fo1p1.setLocation(210, 540);
                                                        fo1p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                        fo1p1.setForeground(Color.BLUE);


                                                        JLabel r6p1 = new JLabel("support");
                                                        front.add(r6p1);
                                                        r6p1.setSize(450, 100);
                                                        r6p1.setText("Robin: I appreciate it Bruce.");
                                                        r6p1.setLocation(210, 560);
                                                        r6p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                        r6p1.setForeground(Color.red);

                                                        b1.setVisible(false);
                                                        b2.setVisible(false);
                                                        do1.setVisible(false);
                                                        r4p1.setVisible(false);
                                                        eo1.setLocation(210, 410);
                                                        r5p1.setLocation(210, 430);


                                                        JButton b1 = new JButton();
                                                        b1.setLocation(310, 685);
                                                        front.add(b1);
                                                        b1.setSize(150, 50);
                                                        b1.setBackground(Color.white);
                                                        b1.setText("Bye");
                                                        b1.setFont(new Font("Arial", Font.BOLD, 15));

                                                        b1.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent e) {
                                                                JLabel go1 = new JLabel("Bye");
                                                                front.add(go1);
                                                                go1.setSize(500, 50);
                                                                go1.setText("Batman: Bye Dick");
                                                                go1.setLocation(210, 530);
                                                                go1.setFont(new Font("Arial", Font.BOLD, 24));
                                                                go1.setForeground(Color.BLUE);


                                                                JLabel r7p1 = new JLabel("support");
                                                                front.add(r7p1);
                                                                r7p1.setSize(450, 100);
                                                                r7p1.setText("Robin: Bye Bruce.");
                                                                r7p1.setLocation(210, 560);
                                                                r7p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                                r7p1.setForeground(Color.red);

                                                                b1.setVisible(false);
                                                                b2.setVisible(false);
                                                                eo1.setVisible(false);
                                                                r5p1.setVisible(false);
                                                                fo1.setLocation(210, 410);
                                                                fo1p1.setLocation(210, 450);
                                                                r6p1.setLocation(210,460);

                                                                JButton end = new JButton();
                                                                end.setLocation(310, 685);
                                                                front.add(end);
                                                                end.setSize(150, 50);
                                                                end.setBackground(Color.white);
                                                                end.setText("End Chat");
                                                                end.setFont(new Font("Arial", Font.BOLD, 15));

                                                                end.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        frame.dispose();
                                                                       RobinEndBad rbd = new RobinEndBad();




                                                                    }
                                                                });

                                                            }
                                                        });



                                                    }
                                                });

                                            }
                                        });


                                    }
                                });


                            }
                        });


                    }
                });










            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JLabel ao2 = new JLabel();
                front.add(ao2);
                ao2.setSize(420,50);
                ao2.setForeground(Color.blue);
                ao2.setFont(new Font("Arial", Font.BOLD, 24));
                ao2.setText("Batman: What do you want?");
                ao2.setLocation(210,420);

                JLabel r1p1 = new JLabel();
                front.add(r1p1);
                r1p1.setSize(550,50);
                r1p1.setForeground(Color.red);
                r1p1.setFont(new Font("Arial", Font.BOLD, 24));
                r1p1.setText("Robin: Jeez Bruce a Hi would have been nice!");
                r1p1.setLocation(210,460);

                JLabel r1p2 = new JLabel();
                front.add(r1p2);
                r1p2.setSize(520,50);
                r1p2.setForeground(Color.red);
                r1p2.setFont(new Font("Arial", Font.BOLD, 24));
                r1p2.setText("Anyways I have to tell you something.");
                r1p2.setLocation(210,490);


                b1.setVisible(false);
                b2.setVisible(false);

                JButton b1 = new JButton();
                front.add(b1);
                b1.setSize(230,50);
                b1.setBackground(Color.white);
                b1.setFont(new Font("Arial", Font.BOLD, 15));
                b1.setText("You Can Tell Me Anything.");
                b1.setLocation(320,685);

                JButton b2 = new JButton();
                front.add(b2);
                b2.setSize(140,50);
                b2.setBackground(Color.white);
                b2.setFont(new Font("Arial", Font.BOLD, 15));
                b2.setText("What is it?");
                b2.setLocation(560,685);

                b2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JLabel bo2 = new JLabel();
                        front.add(bo2);
                        bo2.setSize(420,50);
                        bo2.setForeground(Color.blue);
                        bo2.setFont(new Font("Arial", Font.BOLD, 24));
                        bo2.setText("Batman: What is it?");
                        bo2.setLocation(210,530);

                        JLabel r2p1 = new JLabel();
                        front.add(r2p1);
                        r2p1.setSize(550,50);
                        r2p1.setForeground(Color.red);
                        r2p1.setFont(new Font("Arial", Font.BOLD, 24));
                        r2p1.setText("Robin: I have been thinking about this for ");
                        r2p1.setLocation(210,570);

                        JLabel r2p2 = new JLabel();
                        front.add(r2p2);
                        r2p2.setSize(520,50);
                        r2p2.setForeground(Color.red);
                        r2p2.setFont(new Font("Arial", Font.BOLD, 24));
                        r2p2.setText("awhile and I think it's time Bruce.");
                        r2p2.setLocation(210,600);


                        b1.setVisible(false);
                        b2.setVisible(false);

                        JButton b1 = new JButton();
                        front.add(b1);
                        b1.setSize(180,50);
                        b1.setBackground(Color.white);
                        b1.setFont(new Font("Arial", Font.BOLD, 15));
                        b1.setText("Are You Sure?");
                        b1.setLocation(320,685);

                        JButton b2 = new JButton();
                        front.add(b2);
                        b2.setSize(150,50);
                        b2.setBackground(Color.white);
                        b2.setFont(new Font("Arial", Font.BOLD, 15));
                        b2.setText("Time?");
                        b2.setLocation(550,685);


                        b2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                JLabel co2 = new JLabel();
                                front.add(co2);
                                co2.setSize(420,50);
                                co2.setForeground(Color.blue);
                                co2.setFont(new Font("Arial", Font.BOLD, 24));
                                co2.setText("Batman: Time! Time for What?");
                                co2.setLocation(210,530);

                                JLabel r3p1 = new JLabel();
                                front.add(r3p1);
                                r3p1.setSize(550,50);
                                r3p1.setForeground(Color.red);
                                r3p1.setFont(new Font("Arial", Font.BOLD, 24));
                                r3p1.setText("Robin: You know for what Bruce. ");
                                r3p1.setLocation(210,570);

                                JLabel r3p2 = new JLabel();
                                front.add(r3p2);
                                r3p2.setSize(520,50);
                                r3p2.setForeground(Color.red);
                                r3p2.setFont(new Font("Arial", Font.BOLD, 24));
                                r3p2.setText("I'm ready to go solo. I even came up ");
                                r3p2.setLocation(210,600);

                                JLabel r3p3 = new JLabel();
                                front.add(r3p3);
                                r3p3.setSize(520,50);
                                r3p3.setForeground(Color.red);
                                r3p3.setFont(new Font("Arial", Font.BOLD, 24));
                                r3p3.setText("with a new name.");
                                r3p3.setLocation(210,630);

                                b1.setVisible(false);
                                b2.setVisible(false);
                                ao2.setVisible(false);
                                r1p1.setVisible(false);
                                r1p2.setVisible(false);
                                bo2.setLocation(210,420);
                                r2p1.setLocation(210,460);
                                r2p2.setLocation(210,490);


                                JButton b1 = new JButton();
                                front.add(b1);
                                b1.setSize(180,50);
                                b1.setBackground(Color.white);
                                b1.setFont(new Font("Arial", Font.BOLD, 15));
                                b1.setText("What Name is it?");
                                b1.setLocation(320,685);

                                JButton b2 = new JButton();
                                front.add(b2);
                                b2.setSize(150,50);
                                b2.setBackground(Color.white);
                                b2.setFont(new Font("Arial", Font.BOLD, 15));
                                b2.setText("Robin?");
                                b2.setLocation(550,685);

                                b2.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        JLabel do2 = new JLabel();
                                        front.add(do2);
                                        do2.setSize(520,50);
                                        do2.setForeground(Color.blue);
                                        do2.setFont(new Font("Arial", Font.BOLD, 24));
                                        do2.setText("Batman: Whats wrong with the name Robin?");
                                        do2.setLocation(210,555);

                                        JLabel r4p1 = new JLabel();
                                        front.add(r4p1);
                                        r4p1.setSize(550,50);
                                        r4p1.setForeground(Color.red);
                                        r4p1.setFont(new Font("Arial", Font.BOLD, 24));
                                        r4p1.setText("Robin: I want to re-brand myself. I can't ");
                                        r4p1.setLocation(210,590);

                                        JLabel r4p2 = new JLabel();
                                        front.add(r4p2);
                                        r4p2.setSize(520,50);
                                        r4p2.setForeground(Color.red);
                                        r4p2.setFont(new Font("Arial", Font.BOLD, 24));
                                        r4p2.setText("be known as Batman's bird boy from forever.");
                                        r4p2.setLocation(210,620);


                                        b1.setVisible(false);
                                        b2.setVisible(false);
                                        bo2.setVisible(false);
                                        r2p1.setVisible(false);
                                        r2p2.setVisible(false);
                                        co2.setLocation(210,420);
                                        r3p1.setLocation(210,460);
                                        r3p2.setLocation(210,490);
                                        r3p3.setLocation(210,520);

                                        JButton b1 = new JButton();
                                        front.add(b1);
                                        b1.setSize(150,50);
                                        b1.setBackground(Color.white);
                                        b1.setFont(new Font("Arial", Font.BOLD, 15));
                                        b1.setText("I understand");
                                        b1.setLocation(320,685);

                                        JButton b2 = new JButton();
                                        front.add(b2);
                                        b2.setSize(160,50);
                                        b2.setBackground(Color.white);
                                        b2.setFont(new Font("Arial", Font.BOLD, 15));
                                        b2.setText("What name is it?");
                                        b2.setLocation(500,685);

                                        b2.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                JLabel eo2 = new JLabel();
                                                front.add(eo2);
                                                eo2.setSize(520,50);
                                                eo2.setForeground(Color.blue);
                                                eo2.setFont(new Font("Arial", Font.BOLD, 24));
                                                eo2.setText("Batman: Whats name have you chosen?");
                                                eo2.setLocation(210,530);

                                                JLabel r5p1 = new JLabel();
                                                front.add(r5p1);
                                                r5p1.setSize(550,50);
                                                r5p1.setForeground(Color.red);
                                                r5p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                r5p1.setText("Robin: NightWing.");
                                                r5p1.setLocation(210,570);


                                                b1.setVisible(false);
                                                b2.setVisible(false);
                                                co2.setVisible(false);
                                                r3p1.setVisible(false);
                                                r3p2.setVisible(false);
                                                r3p3.setVisible(false);
                                                do2.setLocation(210,420);
                                                r4p1.setLocation(210,460);
                                                r4p2.setLocation(210,490);

                                                JButton b1 = new JButton();
                                                front.add(b1);
                                                b1.setSize(130,50);
                                                b1.setBackground(Color.white);
                                                b1.setFont(new Font("Arial", Font.BOLD, 15));
                                                b1.setText("I Like it");
                                                b1.setLocation(320,685);

                                                JButton b2 = new JButton();
                                                front.add(b2);
                                                b2.setSize(130,50);
                                                b2.setBackground(Color.white);
                                                b2.setFont(new Font("Arial", Font.BOLD, 15));
                                                b2.setText("Stay with me");
                                                b2.setLocation(500,685);

                                                b2.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        JLabel fo2 = new JLabel();
                                                        front.add(fo2);
                                                        fo2.setSize(520,50);
                                                        fo2.setForeground(Color.blue);
                                                        fo2.setFont(new Font("Arial", Font.BOLD, 24));
                                                        fo2.setText("Batman: I like the name. But please stay");
                                                        fo2.setLocation(210,500);

                                                        JLabel fo2p1 = new JLabel();
                                                        front.add(fo2p1);
                                                        fo2p1.setSize(520,50);
                                                        fo2p1.setForeground(Color.blue);
                                                        fo2p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                        fo2p1.setText("with me we can be a team together.");
                                                        fo2p1.setLocation(210,530);

                                                        JLabel r6p1 = new JLabel();
                                                        front.add(r6p1);
                                                        r6p1.setSize(550,50);
                                                        r6p1.setForeground(Color.red);
                                                        r6p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                        r6p1.setText("Robin: Ok. Bruce i'll stay.");
                                                        r6p1.setLocation(210,570);

                                                        JLabel r6p2 = new JLabel();
                                                        front.add(r6p2);
                                                        r6p2.setSize(550,50);
                                                        r6p2.setForeground(Color.red);
                                                        r6p2.setFont(new Font("Arial", Font.BOLD, 24));
                                                        r6p2.setText("But can I go solo sometimes?");
                                                        r6p2.setLocation(210,600);


                                                        b1.setVisible(false);
                                                        b2.setVisible(false);
                                                        do2.setVisible(false);
                                                        r4p1.setVisible(false);
                                                        r4p2.setVisible(false);
                                                        eo2.setLocation(210,420);
                                                        r5p1.setLocation(210,460);


                                                        JButton b1 = new JButton();
                                                        front.add(b1);
                                                        b1.setSize(130,50);
                                                        b1.setBackground(Color.white);
                                                        b1.setFont(new Font("Arial", Font.BOLD, 15));
                                                        b1.setText("No");
                                                        b1.setLocation(320,685);

                                                        JButton b2 = new JButton();
                                                        front.add(b2);
                                                        b2.setSize(130,50);
                                                        b2.setBackground(Color.white);
                                                        b2.setFont(new Font("Arial", Font.BOLD, 15));
                                                        b2.setText("Yes");
                                                        b2.setLocation(500,685);

                                                        b2.addActionListener(new ActionListener() {
                                                            public void actionPerformed(ActionEvent e) {
                                                                JLabel go2 = new JLabel();
                                                                front.add(go2);
                                                                go2.setSize(520,50);
                                                                go2.setForeground(Color.blue);
                                                                go2.setFont(new Font("Arial", Font.BOLD, 24));
                                                                go2.setText("Batman: That's okay with me.");
                                                                go2.setLocation(210,580);

                                                                JLabel r7p1 = new JLabel();
                                                                front.add(r7p1);
                                                                r7p1.setSize(550,50);
                                                                r7p1.setForeground(Color.red);
                                                                r7p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                                r7p1.setText("Robin: Thanks Bruce.");
                                                                r7p1.setLocation(210,620);


                                                                b1.setVisible(false);
                                                                b2.setVisible(false);
                                                                eo2.setVisible(false);
                                                                r5p1.setVisible(false);
                                                                fo2.setLocation(210,420);
                                                                fo2p1.setLocation(210,460);
                                                                r6p1.setLocation(210,500);
                                                                r6p2.setLocation(210,540);


                                                                JButton b2 = new JButton();
                                                                front.add(b2);
                                                                b2.setSize(130,50);
                                                                b2.setBackground(Color.white);
                                                                b2.setFont(new Font("Arial", Font.BOLD, 15));
                                                                b2.setText("Bye");
                                                                b2.setLocation(320,685);



                                                                b2.addActionListener(new ActionListener() {
                                                                    public void actionPerformed(ActionEvent e) {
                                                                        JLabel ho2 = new JLabel();
                                                                        front.add(ho2);
                                                                        ho2.setSize(520,50);
                                                                        ho2.setForeground(Color.blue);
                                                                        ho2.setFont(new Font("Arial", Font.BOLD, 24));
                                                                        ho2.setText("Batman: See you later Dick.");
                                                                        ho2.setLocation(210,540);

                                                                        JLabel r8p1 = new JLabel();
                                                                        front.add(r8p1);
                                                                        r8p1.setSize(550,50);
                                                                        r8p1.setForeground(Color.red);
                                                                        r8p1.setFont(new Font("Arial", Font.BOLD, 24));
                                                                        r8p1.setText("Robin: Bye Bruce.");
                                                                        r8p1.setLocation(210,580);


                                                                        b1.setVisible(false);
                                                                        b2.setVisible(false);
                                                                        fo2.setVisible(false);
                                                                        r6p1.setVisible(false);
                                                                        r6p2.setVisible(false);
                                                                        go2.setLocation(210,420);
                                                                        r7p1.setLocation(210,500);

                                                                        JButton end = new JButton();
                                                                        end.setLocation(310, 685);
                                                                        front.add(end);
                                                                        end.setSize(150, 50);
                                                                        end.setBackground(Color.white);
                                                                        end.setText("End Chat");
                                                                        end.setFont(new Font("Arial", Font.BOLD, 15));

                                                                        end.addActionListener(new ActionListener() {
                                                                            public void actionPerformed(ActionEvent e) {
                                                                                frame.dispose();
                                                                               RobinEndGood rgd = new RobinEndGood();


                                                                            }
                                                                        });
                                                                          frame.setVisible(true);



                                                                    }
                                                                });




                                                            }
                                                        });



                                                    }
                                                });

                                            }
                                        });

                                    }
                                });


                            }
                        });




                    }
                });



            }
        });


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

