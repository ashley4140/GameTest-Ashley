import javax.swing.JMenuBar;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//https://stackoverflow.com for code checking
//instantiable classes
//improve brain
//improve structure
//add Jtext
//add avatars
//make menu work

public class StartScreen {

    //static MyChoice mc;

    public static void main(String args[]) {

        JFrame frame = new JFrame("Bat Roulette");
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(113, 82, 162));
        panel.setLayout(new FlowLayout());




        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("Player");
        menuBar.add(fileMenu);
        JMenu fileMenu1 = new JMenu("About");
        menuBar.add(fileMenu1);
        frame.setJMenuBar(menuBar);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setResizable(false);

        //final ImageIcon pt = new ImageIcon("pathetic.jpg");

        fileMenu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {

                String name1 = JOptionPane.showInputDialog("Player 1 - Please enter your Name");
                JOptionPane.showInputDialog(name1 +"- Please enter your Age");
                JOptionPane.showMessageDialog(null,"Welcome "+ name1 +" You are Batman!\n\n Press Start to play!");



            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {
                JOptionPane.showMessageDialog(null,"Goodbye!");
            }
        });

        fileMenu1.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                JOptionPane.showMessageDialog(null,"How To Play \n\nThis is a Batman Telltale style game. " +
                        "\n\n You will be given 5 characters to talk to each character will have a good ending and a bad ending." +
                        "\n\n Just be aware that there is always a catch, if you think you made the right choice it could be the wrong choice!" +
                        "\n\n Good Luck!");

            }

            @Override
            public void menuDeselected(MenuEvent e) {

            }

            @Override
            public void menuCanceled(MenuEvent e) {

            }
        });


        //start image
        JLabel front = new JLabel();
        front.setIcon(new ImageIcon("StartScreen.jpg"));
        panel.add(front);

        frame.add(panel);
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

       //Start/Quit actionbuttons
        JButton Start = new JButton();
        JButton Quit = new JButton("CLOSE");

        Start.setBackground(Color.white);
        Quit.setBackground(Color.white);

        Start.setText("Start");
        Quit.setText("Quit");

        panel.add(Start);
        panel.add(Quit);
        //Size and Style
        Start.setFont(new Font("Arial", Font.BOLD, 20));
        Quit.setFont(new Font("Arial", Font.BOLD, 20));



        //open command



        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                MyChoice mc = new MyChoice();
                //mc.setVisible(true);
               //frame.setVisible(false);






            }
        });
        //Close command
        Quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"               Really your already giving up.\n     Come Back when you actually want to play!","Quitter",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        });



    }



}
