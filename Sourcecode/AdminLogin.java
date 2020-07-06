import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class AdminLogin extends JFrame
{
     JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/admin.png")));  
     JLabel la1=new JLabel("UserName  :");
     JLabel la2=new JLabel("Password  :");
     JButton b1=new JButton("Login");
     JPanel loginpanel;
     JTextField t1=new JTextField();
     JPasswordField t2=new JPasswordField();
  public AdminLogin()
    {
      super("AdminLogin");
      setSize(1300,700);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(null);
      la.setSize(1300,700);
      add(la);
      addItems();
      setVisible(true);
    }
  private void addItems()
     {
      la.setLayout(null);
      la1.setBounds(350,20,100,50);
      la1.setFont(new Font("elephant",0,16));
      la.add(la1);
      t1.setBounds(450,20,300,40);
      la.add(t1);
      la2.setBounds(350,120,100,50);
      la2.setFont(new Font("elephant",0,16));
      la.add(la2);
      t2.setBounds(450,120,300,40);
      la.add(t2);
      b1.setBounds(650,550,100,30);
      la.add(b1);
      b1.addActionListener(new Click ());
    }
   class Click implements ActionListener
   {
       public void actionPerformed(ActionEvent evt2)
         {
             JButton bc2=(JButton)evt2.getSource();
                {
                 if(bc2==b1 )
                           {
                                if(t1.getText().equals("Administrator")  && t2.getText().equals("admin5455"))
                                  {
                              new AddOrRemove();
                               setVisible(false);
                               }
                               else
                                  {
                                    JOptionPane.showMessageDialog(loginpanel,"Incorrect login");      
                                  }
                           }
                }
         }
    } 
}