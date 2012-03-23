import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guisandbuttons 
{
    JButton button;
    String buttontext1 = "Explanation: How this program works";
    String buttontext2 = "About this program";
    String buttontext3 = "Easter Eggs";
    String buttontext4 = "Quit program";
    String buttontextyes = "yes";
    
    public static void main (String[] args)
    {
        guisandbuttons app = new guisandbuttons();
        app.initialize();
    }
    
    
    public void startingWindow()
    {
        JOptionPane.showMessageDialog(null, "Welcome to my experimental Swing GUI for Coursework 4", "University of London: Java Coursework 4", 1);
        
    }
    
    
    public void mainApp()
    {
        JFrame frame = new JFrame("University of London: Java Coursework 4");
        
        
        button = new JButton(buttontext1);
        button.addActionListener(new captureClicks());
        JPanel panel = new JPanel(new GridLayout(5,3,2,2));
        panel.add(button);
        button = new JButton(buttontext2);
        button.addActionListener(new captureClicks());
        panel.add(button);
        button = new JButton(buttontext3);
        button.addActionListener(new captureClicks());
        panel.add(button);
        button = new JButton(buttontext4);
        button.addActionListener(new captureClicks());
        panel.add(button);
        frame.add(panel);
        frame.setSize(500, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public class captureClicks implements ActionListener
    {
        
        int selection = 0;
        int selection1 = 0;
        String[] choices = {"I'm out of here!", "No thanks", "Huh?"};
        String[] joke = {"Nobody wants to play with me..."};
        String[] pissed = {"Sorry... T.T"};
        
        public void actionPerformed(ActionEvent ae)
        {
            String[] explanation = new String[5];
            explanation[0] = "I will now explain how this program works.";
            explanation[1] = "The goal is to create a program that a user can use to navigate back and forth, \nmuch like how a typical installer prompt or a basic step-by-step FAQ window \nwould work.";
            explanation[2] = "String arrays are used to contain the text to be displayed in each window";
            explanation[3] = "Finally, the act of moving back and forth is mapped to 'YES' and 'NO' buttons, which have been renamed to reflect their functions";
            explanation[4] = "When the last entry in the array is reached, the window closes once the user selects 'Next'.";
            
            String[] navigate1 = {"Next"};
            String[] navigate2 = {"Back", "Next"};
            String buttonword = ae.getActionCommand();
            if(buttonword.equals(buttontext1))
            {
                selection1=JOptionPane.showOptionDialog(null, explanation[0], "Thank you for viewing", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, navigate2, navigate2[1]);
                {
                    int i = 0;
                    while (i <= 4)
                   {
                       if (selection1 == JOptionPane.NO_OPTION)
                       {
                           i++;
                           if(i<=4)
                           selection1=JOptionPane.showOptionDialog(null, explanation[i], "Thank you for viewing", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, navigate2, navigate2[1]);
                           else
                           return;
                       }
                       else if (selection1 == JOptionPane.YES_OPTION)
                       {
                           i--;
                           if(i>0)
                           selection1=JOptionPane.showOptionDialog(null, explanation[i], "Thank you for viewing", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, navigate2, navigate2[1]);
                           else
                               return;
                       }
                   }
                
                }                
            }
            
            else if (buttonword.equalsIgnoreCase(buttontext2))
            {
               
                JFrame frame = new JFrame("About this Program");
        
                JPanel panel = new JPanel(new GridLayout(4,3,2,2));
                JLabel text1 = new JLabel("<html>This program makes use of code from the following sources: <br /></html>");
                ImageIcon icon = new ImageIcon("banner.png");
                JLabel banner = new JLabel(icon);
                JLabel text2 = new JLabel("<html><br />Written with Java SDK v1.7.0 and compilled with Netbeans 7.0.1 for <br />Linux x64 distributions</html>");
                JLabel text3 = new JLabel("This project binary and its source is licensed under the GPLv2");
                panel.add(text1);
                panel.add(banner);
                panel.add(text2);
                panel.add(text3);
                frame.add(panel);
                frame.setSize(500, 200);
                frame.setVisible(true);
                
            }
                   
            else if (buttonword.equalsIgnoreCase(buttontext3))
            {
                JOptionPane.showOptionDialog(null, "Sorry, no easter eggs in this program.", "Thank you for viewing", JOptionPane.YES_OPTION, JOptionPane.ERROR_MESSAGE, null, joke, joke[0]);
            }
            
            else if (buttonword.equals(buttontext4))
            {
                selection = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?", "Exit program", JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
                {
                    if (selection == JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "The program will now terminate.", "Thank you for viewing", 1);
                        System.exit(0);
                    }
                    
                    else if (selection == JOptionPane.NO_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "The program will not terminate.", "Thank you for staying", 1);
                    }
                    
                    else if (selection == JOptionPane.CANCEL_OPTION)
                    {
                        JOptionPane.showOptionDialog(null, "Make up your mind already!", "Sheesh...", JOptionPane.YES_OPTION,
    JOptionPane.WARNING_MESSAGE, null, pissed, pissed[0]);
                    }
                
                }
            }
        }
    }    
    public void initialize()
    {
        startingWindow();
        mainApp();
    }

}

