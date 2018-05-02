import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;



public class RobinEndGood extends RobinChat{
    JFrame frame;
    static RobinEndGood rgd;
    JPanel panel;
    public RobinEndGood(){

        JFrame frame = new JFrame("Batman And Robin Forever!");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(245, 255, 221));
        panel.setLayout(new FlowLayout());

        JLabel front = new JLabel(new ImageIcon("End.jpg"));




        panel.add(front);

        JLabel bn = new JLabel(new ImageIcon("bn.JPG"));
        front.add(bn);
        bn.setSize(250,250);
        bn.setLocation(250,400);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        JLabel title = new JLabel("Result");
        front.add(title);
        title.setSize(500, 100);
        title.setText("Batman And Robin Forever!");
        title.setLocation(180, 50);
        title.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel resultp1 = new JLabel("Result");
        front.add(resultp1);
        resultp1.setSize(700, 110);
        resultp1.setText("Congratulations! You saved Dick Grayson. Yes you may have had to be a  ");
        resultp1.setLocation(50, 100);
        resultp1.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp2 = new JLabel("Result");
        front.add(resultp2);
        resultp2.setSize(800, 150);
        resultp2.setText("little harsh but you prevented his death as you would never of had to ");


        resultp2.setLocation(50, 100);
        resultp2.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp3 = new JLabel("Result");
        front.add(resultp3);
        resultp3.setSize(700, 190);
        resultp3.setText("replace him resulting in Damien Wayne who would have killed Dick Grayson. ");
        resultp3.setLocation(50, 100);
        resultp3.setFont(new Font("Arial", Font.BOLD, 18));


        JLabel resultp4 = new JLabel("Result");
        front.add(resultp4);
        resultp4.setSize(700, 230);
        resultp4.setText("You and Dick stayed as a team. You may not have been Batman and Robin");
        resultp4.setLocation(50, 100);
        resultp4.setFont(new Font("Arial", Font.BOLD, 18));


        JLabel resultp5 = new JLabel("Result");
        front.add(resultp5);
        resultp5.setSize(700, 270);
        resultp5.setText("but you were still Bruce Wayne and Dick Grayson you were still the ultimate");
        resultp5.setLocation(50, 100);
        resultp5.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp6 = new JLabel("Result");
        front.add(resultp6);
        resultp6.setSize(700, 310);
        resultp6.setText("superhero duo. You gave nightwing the freedom to work on his own but still ");
        resultp6.setLocation(50, 100);
        resultp6.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp7 = new JLabel("Result");
        front.add(resultp7);
        resultp7.setSize(700, 350);
        resultp7.setText("be by your side. You showed him that he isn't just your sidekick he is your ");
        resultp7.setLocation(50, 100);
        resultp7.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp8 = new JLabel("Result");
        front.add(resultp8);
        resultp8.setSize(700, 390);
        resultp8.setText("family and you would do anything to make him happy because he is like a");
        resultp8.setLocation(50, 100);
        resultp8.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp9 = new JLabel("Result");
        front.add(resultp9);
        resultp9.setSize(700, 430);
        resultp9.setText("son to you and you never wanted to change that. Ever since he lost his");
        resultp9.setLocation(50, 100);
        resultp9.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp10 = new JLabel("Result");
        front.add(resultp10);
        resultp10.setSize(700, 470);
        resultp10.setText("parents you never wanted him to face the same outcome as they did.");
        resultp10.setLocation(50, 100);
        resultp10.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel resultp11 = new JLabel("Result");
        front.add(resultp11);
        resultp11.setSize(700, 980);
        resultp11.setText("CONGRATULATIONS YOU SAVED DICK GRAYSON!");
        resultp11.setLocation(70, -100);
        resultp11.setFont(new Font("Arial", Font.BOLD, 25));
        resultp11.setForeground(Color.green);



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






            }
        });
frame.setVisible(true);

    }


}



