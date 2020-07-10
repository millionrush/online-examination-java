import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class SignIn extends JFrame
 {
     JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/login.png")));  
     JLabel la1=new JLabel("UserName  :");
     JLabel la2=new JLabel("Password  :");
     JPanel loginpanel;
     JLabel msg=new JLabel("If not registered first SignIn");
     JButton b1=new JButton("Login");
     JButton b2=new JButton("SignIn");
     JTextField t1=new JTextField();
     JPasswordField t2=new JPasswordField();
     JButton b3=new JButton("Admin Login");
     
    public SignIn()
     {
      super("Student SignIn Page");
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
      msg.setBounds(490,600,500,100);
      msg.setFont(new Font("elephant",2,20));
      msg.setForeground(Color.red);
      la.add(msg);
      la1.setBounds(100,20,100,50);
      la1.setFont(new Font("elephant",0,16));
      la.add(la1);
      t1.setBounds(200,20,300,40);
      la.add(t1);
      la2.setBounds(100,120,100,50);
      la2.setFont(new Font("elephant",0,16));
      la.add(la2);
      t2.setBounds(200,120,300,40);
      la.add(t2);
      b1.setBounds(450,550,100,30);
      la.add(b1);
      b1.addActionListener(new Click());
      b2.setBounds(750,550,100,30);
      la.add(b2);
      b2.addActionListener(new Click());
      b3.setBounds(900,350,300,50);
      la.add(b3);
      b3.addActionListener(new Click());
      
    }
   class Click implements ActionListener
   {
       public void actionPerformed(ActionEvent evt2)
         {
             JButton bc2=(JButton)evt2.getSource();
                     {
                      if( bc2==b3)
                        {
                         
                          new AdminLogin();
                          setVisible(false);
                        }
                      
                        if(bc2==b1)
                           {
                                    String query="select * from SignInValues ";
                                       try{
                                                       
                                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","root");
                                                        Statement st=con.createStatement();
                                                         ResultSet rs=st.executeQuery(query);
                                                            while(rs.next())
                                                              {
                                                                 if(rs.getString(1).equals(t1.getText()) && rs.getString(2).equals(t2.getText()))
                                                                             {
                                                                                            new ChooseSubject();
                                                                                             setVisible(false);
                                                                                             JOptionPane.showMessageDialog(loginpanel,"Choose your topic");
                                                                                             System.out.println("correct");
                                                                                             
                                                                               } 
                                                                    else
                                                                             {
                                                                                System.out.println("incorrect");
                                                                             }
                                                              }
                                                         
                                                                    st.close();
                                                                    con.close();
                                                }
                                                             catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,e);
                                                                             }
                                                                
                               
                           }
                      else
                        if(bc2==b2)
                            {
                                    String query="insert into SignInValues values(?,?)";
                                       try{
                                                       
                                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","sql");
                                                        PreparedStatement st=con.prepareStatement(query);
                                                          st.setString(1,t1.getText());
                                                          st.setString(2,t2.getText());
                                                          int count=st.executeUpdate();
                                                          System.out.println("rows affected"+count);
                                                                    st.close();
                                                                    con.close();
                                                }
                                                             catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,e);
                                                                             }
                                                          new ChooseSubject();
                        }
                                                     
              }
                                        
       } 
}                           
                      
  public static void main(String [] args)
     {
        setDefaultLookAndFeelDecorated(true);
        new SignIn();
     }
 }
