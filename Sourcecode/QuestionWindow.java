
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class QuestionWindow extends JFrame
{   
    JLabel la=new JLabel();
   static JTextArea t=new JTextArea();
    static JRadioButton b1=new JRadioButton();
    static JRadioButton b2=new JRadioButton();
    static JRadioButton b3=new JRadioButton();
    static JRadioButton b4=new JRadioButton();
    static ButtonGroup bg=new ButtonGroup();
   static JTextArea t1=new JTextArea();
     static JButton ba1=new JButton("Next");
     static JButton ba2=new JButton("Back to first");
 static   JButton ba3=new JButton("Submit");

    static int i;
     int count;
     public QuestionWindow()
    {
      super("QuestionWindow");
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
 public void addItems()
    {
      la.setLayout(null);
      t1.setBounds(50,50,50,30);
      t1.setText("1");
      la.add(t1);
      t.setBounds(150,50,700,100);
      la.add(t);
      b1.setBounds(50,190,200,30);
      la.add(b1); 
      b2.setBounds(50,250,200,30);
      la.add(b2);
      b3.setBounds(50,310,200,30);
      la.add(b3);
      b4.setBounds(50,370,200,30);
      la.add(b4);
      ba2.setBounds(450,450,120,50);
      la.add(ba2);  
      ba1.setBounds(650,450,100,50);
      la.add(ba1);
      
     ba3.setBounds(550,550,100,50);
      la.add(ba3);   
       bg.add(b1);
      bg.add(b2);
        bg.add(b3);
          bg.add(b4);
    }
     public static void question()
                         {
                                                     try{
                                                     String query="select * from question where Topic ='"+ChooseSubject.topic+"'";
                                                         
                                                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examination","root","root");
                                                        Statement st=con.createStatement();
                                                        ResultSet rs=st.executeQuery(query);
                                                            
                                                              
                                                                        while(rs.next())  
                                                                             {
                                                                          Va.QuesId[i]=rs.getString(1);
                                                                          Va.Ques[i]=rs.getString(2);
                                                                           Va.option1[i]=rs.getString(3);
                                                                           Va.option2[i]=rs.getString(4);
                                                                           Va.option3[i]=rs.getString(5);
                                                                           Va.option4[i]=rs.getString(6);
                                                                           Va.Co[i]=rs.getString(7);
                                                                            i++;    
                                                                           
                                                                          
                                                    }     
                                                                         i=0;
                                                                         
                                                                        t1.setText(Va.QuesId[i]);
                                                                         t.setText(Va.Ques[i]);  
                                                                         b1.setText(Va.option1[i]);
                                                                         b2.setText(Va.option2[i]);
                                                                         b3.setText(Va.option3[i]);
                                                                         b4.setText(Va.option4[i]);  
                                                                           
                                                                        
 class Clicked implements ActionListener
{
     public void actionPerformed(ActionEvent e)
         {
                 JButton bc=(JButton)e.getSource();
                    {
                      if(bc==ba1  )
                         {                                               
                                                                       bg.clearSelection();
                                 int x=Integer.parseInt(t1.getText());
                               if( x<10)
                                                 {                      
                                                                        t1.setText(Va.QuesId[x]);
                                                                         t.setText(Va.Ques[x]);  
                                                                         b1.setText(Va.option1[x]);
                                                                         b2.setText(Va.option2[x]);
                                                                         b3.setText(Va.option3[x]);
                                                                         b4.setText(Va.option4[x]);
                                                                   x++;
                                                                  
                                                                          }     
                           }
                        if(bc==ba2)
                         {
                                         
                           
                                                 
                                                            
                                                                        t1.setText(Va.QuesId[0]);
                                                                         t.setText(Va.Ques[0]);  
                                                                         b1.setText(Va.option1[0]);
                                                                         b2.setText(Va.option2[0]);
                                                                         b3.setText(Va.option3[0]);
                                                                         b4.setText(Va.option4[0]);
                                                                            
                                             }
                         if(bc==ba3)
                         {      int C=0;
                                  JRadioButton  button=new JRadioButton();
                                  bg.add(button);
                              button=bg.getSelectedJRadioButton();
                                bg.setSelectedJRadioButton(button);
                                                  if(button.getText()==Va.Co[i])
                                                      {
                                                               C++;
                                                       }                         
                                             }
                        }
              }
      }
                                                                                  ba1.addActionListener(new Clicked());
                                                                                  ba2.addActionListener(new Clicked());
                                                                              st.close();
                                                                             con.close();  
                                                                        }
                                                             catch(Exception x)
				{
				JOptionPane.showMessageDialog(null,x);
                                                                             }     
                           }


}