import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class RemoveWindow extends JFrame
{     
      JTextField ta1=new JTextField();
      JLabel la=new JLabel();
      JLabel la1=new JLabel("QuesId:");
      JLabel la2=new JLabel("Topic:");
      JButton b1=new JButton("Submit");
      JButton b2=new JButton("LogOut");
      JTextField ta2=new JTextField();
     public RemoveWindow()
    {
      super("RemoveWindow");
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
              la1.setBounds(50,50,50,50);
              la.add(la1);
              ta1.setBounds(110,50,70,50);
              la.add(ta1);
               la2.setBounds(50,200,50,50);
              la.add(la2);
              ta2.setBounds(110,200,150,50);
              la.add(ta2);  
              b1.setBounds(150,300,100,50);
              la.add(b1); 
              b1.addActionListener(new Click());
              b2.setBounds(300,300,100,50);
              la.add(b2);
              b2.addActionListener(new Click()); 
         }
class Click implements ActionListener
       {
           public void actionPerformed(ActionEvent e)
                {
                       JButton ba=(JButton)e.getSource();
                          {
                                      if(ba==b1)
                                            {
                                                  int x=Integer.parseInt(ta1.getText());
                                                   
                                                   String query="delete from question where quesid="+ x;
                                       try{
                                                       
                                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","sql");
                                                        PreparedStatement st=con.prepareStatement(query);
                                                         
                                                         
                                                          int count=st.executeUpdate();
                                                          System.out.println("rows affected"+count);
                                                                    st.close();
                                                                    con.close();
                                                }
                                                             catch(Exception en)
				{
				JOptionPane.showMessageDialog(null,en);
                                                                             }
                                            }
                                    else
                                        if(ba==b2)
                                            {
                                                        new SignIn();
                                             }
                          }
                }
        }
public static void main(String [] as)
            {
                 setDefaultLookAndFeelDecorated(true);
                 new RemoveWindow();
            }
}