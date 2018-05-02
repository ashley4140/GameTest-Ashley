import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class RobinEndBad extends RobinChat{

    static RobinEndBad rbd;

    public RobinEndBad() {

        JFrame frame = new JFrame("Batman And Robin ForNever!");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(245, 255, 221));
        panel.setLayout(new FlowLayout());

        JLabel front = new JLabel(new ImageIcon("End.jpg"));


        panel.add(front);

JLabel bb = new JLabel(new ImageIcon("bb.JPG"));
front.add(bb);
bb.setSize(120,120);
bb.setLocation(600,510);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        JLabel title = new JLabel("Result");
        front.add(title);
        title.setSize(500, 100);
        title.setText("Batman And Robin ForNever!");
        title.setLocation(180, 30);
        title.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel resultp1 = new JLabel("Result");
        front.add(resultp1);
        resultp1.setSize(700, 40);
        resultp1.setText("You really did it didn't you.\n" +
                " You let Dick become Nightwing and \n" +
                "go off on his own. As a result");
        resultp1.setLocation(50, 100);
        resultp1.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp2 = new JLabel("Result");
        front.add(resultp2);
        resultp2.setSize(800, 80);
        resultp2.setText("of this you brought in Jason Todd. You and Jason didn't get to last very long as he got beaten  ");


        resultp2.setLocation(50, 100);
        resultp2.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp3 = new JLabel("Result");
        front.add(resultp3);
        resultp3.setSize(700, 120);
       resultp3.setText("to death by The Joker. As a result of this Jason was resurrected by Ra's Al Gul which   ");
       resultp3.setLocation(50, 100);
        resultp3.setFont(new Font("Arial", Font.BOLD, 15));


        JLabel resultp4 = new JLabel("Result");
        front.add(resultp4);
        resultp4.setSize(700, 160);
        resultp4.setText("brought him back to life and drove him to insanity. He then Became the Red hood.");
        resultp4.setLocation(50, 100);
        resultp4.setFont(new Font("Arial", Font.BOLD, 15));


        JLabel resultp5 = new JLabel("Result");
        front.add(resultp5);
        resultp5.setSize(700, 200);
        resultp5.setText("With your loss of Jason you brought in Tim Drake. Tim lasted longer than Jason but");
        resultp5.setLocation(50, 100);
        resultp5.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp6 = new JLabel("Result");
        front.add(resultp6);
        resultp6.setSize(700, 240);
        resultp6.setText("unfortunately for you he also suffered from the hands of the Joker. He was kidnapped by  ");
        resultp6.setLocation(50, 100);
        resultp6.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp7 = new JLabel("Result");
        front.add(resultp7);
        resultp7.setSize(700, 280);
        resultp7.setText("the Joker and brain washed into releasing all of your secrets and becoming so mentally ");
        resultp7.setLocation(50, 100);
        resultp7.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp8 = new JLabel("Result");
        front.add(resultp8);
        resultp8.setSize(700, 320);
        resultp8.setText("unstable that he became the Jokers son. You were able to snap him out of it but you could");
        resultp8.setLocation(50, 100);
        resultp8.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp9 = new JLabel("Result");
        front.add(resultp9);
        resultp9.setSize(700, 360);
        resultp9.setText("no longer trust him to be your sidekick. This was good on you as it turned out that the");
        resultp9.setLocation(50, 100);
        resultp9.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp10 = new JLabel("Result");
        front.add(resultp10);
        resultp10.setSize(700, 400);
        resultp10.setText("Joker had downloaded his subconscious into Tim's neck and was secretly controlling him ");
        resultp10.setLocation(50, 100);
        resultp10.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp11= new JLabel("Result");
        front.add(resultp11);
        resultp11.setSize(700, 440);
        resultp11.setText("until he could take over Tim's body. But years before knowing this you received a knock");
        resultp11.setLocation(50, 100);
        resultp11.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp12= new JLabel("Result");
        front.add(resultp12);
        resultp12.setSize(700, 480);
        resultp12.setText("on the door by a boy who claimed to be your son. He said his name was Damien Wayne.  ");
        resultp12.setLocation(50, 100);
        resultp12.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp13= new JLabel("Result");
        front.add(resultp13);
        resultp13.setSize(700, 520);
        resultp13.setText("Confused you asked who his mother was. He told you his mother is Talia Al Gul. ");
        resultp13.setLocation(50, 100);
        resultp13.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp14= new JLabel("Result");
        front.add(resultp14);
        resultp14.setSize(700, 560);
        resultp14.setText("It turns out when you went to Talia to get answers about Jason Todd she drugged you ");
        resultp14.setLocation(50, 100);
        resultp14.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp15= new JLabel("Result");
        front.add(resultp15);
        resultp15.setSize(700, 600);
        resultp15.setText("and slept with you resulting in Damien. You allowed him to become Robin but learned");
        resultp15.setLocation(50, 100);
        resultp15.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp16= new JLabel("Result");
        front.add(resultp16);
        resultp16.setSize(700, 640);
        resultp16.setText("too late that he was extremely violent. As a result of this one night when you were");
        resultp16.setLocation(50, 100);
        resultp16.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp17= new JLabel("Result");
        front.add(resultp17);
        resultp17.setSize(700, 680);
        resultp17.setText("working with Nightwing Damien threw a pair of nunchucks at him killing him on impact.");
        resultp17.setLocation(50, 100);
        resultp17.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp18= new JLabel("Result");
        front.add(resultp18);
        resultp18.setSize(700, 720);
        resultp18.setText("He insisted it was an accident but you didn't believe him. You then told him to leave");
        resultp18.setLocation(50, 100);
        resultp18.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp19 = new JLabel("Result");
        front.add(resultp19);
        resultp19.setSize(700, 760);
        resultp19.setText("so Superman took over and trained him. Realising you will never have a Robin as loyal as ");
        resultp19.setLocation(50, 100);
        resultp19.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp20 = new JLabel("Result");
        front.add(resultp20);
        resultp20.setSize(700, 800);
        resultp20.setText("Dick Grayson again you retired the Robin costume. Many years later when you were to old ");
        resultp20.setLocation(50, 100);
        resultp20.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp21 = new JLabel("Result");
        front.add(resultp21);
        resultp21.setSize(700, 840);
        resultp21.setText("to be Batman you took in Terry McGuinness who is currently Batman.");
        resultp21.setLocation(50, 100);
        resultp21.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel resultp22 = new JLabel("Result");
        front.add(resultp22);
        resultp22.setSize(700, 900);
        resultp22.setText("I HOPE YOUR PROUD OF YOURSELF!");
        resultp22.setLocation(200, 100);
        resultp22.setFont(new Font("Arial", Font.BOLD, 20));
        resultp22.setForeground(Color.red);


    JButton again = new JButton();
    front.add(again);
    again.setSize(220,90);
    again.setBackground(new java.awt.Color(196, 1, 255));
    again.setLocation(262,645);
    again.setFont(new Font("Arial", Font.BOLD, 30));
    again.setText("Try Again?");
    again.setForeground(Color.white);


        again.addActionListener(new ActionListener() {
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
