import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AddOrRemove extends JFrame
{
    JLabel la=new JLabel();
    JButton b1=new JButton("Add Questions");
    JButton b2=new JButton("Remove Questions");
    JButton b3=new JButton("Show All Questions"); 
    public AddOrRemove()
      {
       super("AdminLogin");
       setSize(500,500);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(null);
       la.setSize(500,500);
       add(la);
       addItems();
       setVisible(true);
      }
  private void addItems()
      {
         la.setLayout(null);
         b1.setBounds(50,50,400,50);
         la.add(b1);
         b1.addActionListener(new Click());
         b2.setBounds(50,150,400,50);
         la.add(b2);
         b2.addActionListener(new Click());
         b3.setBounds(50,250,400,50);
         la.add(b3);
         b3.addActionListener(new Click());
      }
  class Click implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
            {
                JButton bc=(JButton)e.getSource();
                if(bc==b1)
                     {
                         new AddWindow();
                         setVisible(false);
                      }
                else if(bc==b2)
                      {
                            new RemoveWindow();
                            setVisible(false);
                      }
                else 
                     {
                               new QuestionWindow();
                               setVisible(false);
                     }
            }
    }
}
