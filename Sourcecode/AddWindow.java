import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class AddWindow extends JFrame
{  JTextField ta1=new JTextField();
   JTextArea ta2=new JTextArea();
   JTextField ta3=new JTextField();
   JTextField ta4=new JTextField();
   JTextField ta5=new JTextField();
   JTextField ta6=new JTextField();
   JTextField ta7=new JTextField();
   JTextField ta8=new JTextField();
   JLabel la=new JLabel();
   JLabel la1=new JLabel("QuesId:");
   JLabel la2=new JLabel("Question:");
   JLabel la3=new JLabel("option1:");
   JLabel la4=new JLabel("option2:");
   JLabel la5=new JLabel("option3:");
   JLabel la6=new JLabel("option4:");
   JLabel la7=new JLabel("Topic:");
   JLabel la8=new JLabel("CorrectAnswer:");
   JButton b1=new JButton("Submit");
   JButton b2=new JButton("LogOut");
     public AddWindow()
    {
      super("AddWindow");
      setSize(700,700);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(null);
      la.setSize(700,700);
      add(la);
      addItems();
      setVisible(true);
    }
    private void addItems()
         {
              la.setLayout(null);
              la1.setBounds(50,50,50,50);
              la.add(la1);
              ta1.setBounds(110,50,70,30);
              la.add(ta1);
              la2.setBounds(50,100,80,50);
              la.add(la2);
              ta2.setBounds(110,100,550,90);
              la.add(ta2);
              la3.setBounds(50,200,50,50);
              la.add(la3);
              ta3.setBounds(110,210,150,30);
              la.add(ta3); 
              la4.setBounds(50,240,50,50);
              la.add(la4);
              ta4.setBounds(110,250,150,30);
              la.add(ta4); 
              la5.setBounds(50,290,50,50);
              la.add(la5);
              ta5.setBounds(110,300,150,30);
              la.add(ta5);
              la6.setBounds(50,340,50,50);
              la.add(la6);
              ta6.setBounds(110,350,150,30);
              la.add(ta6);  
              la7.setBounds(50,390,50,50);
              la.add(la7);
              ta7.setBounds(110,400,150,30);
              la.add(ta7);
               la8.setBounds(50,440,50,50);
              la.add(la8);
              ta8.setBounds(110,450,150,30);
              la.add(ta8);  
              b1.setBounds(150,570,100,50);
              la.add(b1); 
              b1.addActionListener(new Click());
              b2.setBounds(300,570,100,50);
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
                                                   String query="insert into question values(?,?,?,?,?,?,?,?)";
                                       try{
                                                       
                                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","sql");
                                                        PreparedStatement st=con.prepareStatement(query);
                                                          st.setString(1,ta1.getText());
                                                          st.setString(2,ta2.getText());
                                                          st.setString(3,ta3.getText());
                                                          st.setString(4,ta4.getText());
                                                          st.setString(5,ta5.getText());
                                                          st.setString(6,ta6.getText());
                                                          st.setString(7,ta7.getText());
                                                         st.setString(8,ta8.getText());
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
                 new AddWindow();
            }
}