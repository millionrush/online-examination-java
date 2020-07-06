import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class ChooseSubject extends JFrame
{ 
      JLabel la1=new JLabel(new ImageIcon(getClass().getResource("images/c.jpg")));
      JLabel la2=new JLabel(new ImageIcon(getClass().getResource("images/c++.jpg")));
      JLabel la3=new JLabel(new ImageIcon(getClass().getResource("images/core-java.jpg")));
      JLabel la4=new JLabel(new ImageIcon(getClass().getResource("images/advance-java.jpg")));        
      JLabel la5=new JLabel(new ImageIcon(getClass().getResource("images/js.jpg")));
      JLabel la6=new JLabel(new ImageIcon(getClass().getResource("images/php.png")));
       int i=1;
      static String topic;
        
       
  public ChooseSubject()
    {
       super("ChooseTopic");
       setSize(1300,700);
       setLocationRelativeTo(null);
       setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       addLabel();
       setVisible(true);
    }
      private void addLabel()
       {
       
  
      la1.setBounds(50,50,250,200);
      la2.setBounds(310,50,250,200);
      la3.setBounds(600,50,290,200);
      la4.setBounds(900,50,350,200);
      
      la5.setBounds(310,290,310,220);
      la6.setBounds(620,290,310,220);
      add(la1);
      la1.addMouseListener(new Click());
      add(la2);
      la2.addMouseListener(new Click());
      add(la3);
      la3.addMouseListener(new Click());
      add(la4);
      la4.addMouseListener(new Click());
      add(la5);
      la5.addMouseListener(new Click());
      add(la6);
      la6.addMouseListener(new Click());
        }

  class Click implements MouseListener
      {
           public void mouseClicked(MouseEvent e)
                  {
                      JLabel l=(JLabel)e.getSource();
                       {
                            
                           if(l==la1)
                             {
                                topic="C";
                                    
                                     new QuestionWindow();
                                    QuestionWindow.question();  
                                             
                                                               
                             }
                           
                              if(l==la2)
                               {
                                  topic="C++";
                                   new QuestionWindow();                    
                                     QuestionWindow.question();
                                }
                              
                              if(l==la3)
                               {
   		topic="CoreJava";
                                new QuestionWindow();
                                QuestionWindow.question(); 
                                }
                              
                              if(l==la4)
                               {
		topic="AdvanceJava";
                                   new QuestionWindow();
                                QuestionWindow.question();                                       }
                              
                              if(l==la5)
                               {
		topic="Python";
                                new QuestionWindow();
                              QuestionWindow.question();  
                                }
                              
                              if(l==la6)
                               {
		topic="PHP";
                                   new QuestionWindow();
                                 QuestionWindow.question();    }
                          }
                   }
           public void mousePressed(MouseEvent e){}
           public void mouseEntered(MouseEvent e){
                        }
           public void mouseExited(MouseEvent e)
            {
             }
           public void mouseReleased(MouseEvent e){}
      }

}