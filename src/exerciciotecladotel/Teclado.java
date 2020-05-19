/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciotecladotel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Teclado extends JFrame{
    private JButton Jnum0;
    private JButton JLimpar;
    private JButton Jnum1;
    private JButton Jnum2;
    private JButton Jnum3;
    private JButton Jnum4;
    private JButton Jnum5;
    private JButton Jnum6;
    private JButton Jnum7;
    private JButton Jnum8;
    private JButton Jnum9;
    private JButton JAsteristico;
    private JButton Jjogodavelha;
    private JLabel JText;
    private JTextField JMostraValor;
    public static Teclado frame;
    
    
public Teclado() {
  incializarComponentes();      
  Eventos();
    }
    
    public void incializarComponentes(){
        setTitle("Teclado Digital");
        setBounds(0,0,250,250);
        setLayout(null);
        JText = new JLabel("Valor digitado") ;
        JMostraValor = new JTextField("");
        JLimpar = new JButton("Limpar");
        Jnum0 = new JButton("0"); 
        Jnum1 = new JButton("1");
        Jnum2 = new JButton("2");
        Jnum3 = new JButton("3");
        Jnum4 = new JButton("4");
        Jnum5 = new JButton("5");
        Jnum6 = new JButton("6");
        Jnum7 = new JButton("7");
        Jnum8 = new JButton("8");
        Jnum9 = new JButton("9");
        JAsteristico = new JButton("*");
        Jjogodavelha = new JButton("#"); 
        
        JLimpar.setBounds(250, 30, 80, 25);
        JText.setBounds(30, 30, 80, 25);
        JMostraValor.setBounds(120, 30, 120, 25);
        Jnum1.setBounds(30,80,50,30);
        Jnum2.setBounds(110,80,50,30); 
        Jnum3.setBounds(190,80,50,30);
        Jnum4.setBounds(30,130,50,30);
        Jnum5.setBounds(110,130,50,30);
        Jnum6.setBounds(190,130,50,30);
        Jnum7.setBounds(30,180,50,30);
        Jnum8.setBounds(110,180,50,30);
        Jnum9.setBounds(190,180,50,30);
        Jjogodavelha.setBounds(190,230,50,30);
        JAsteristico.setBounds(30,230,50,30);
        Jnum0.setBounds(110, 230, 50, 30);
             
        add(Jnum1);
        add(JMostraValor);
        add(Jnum2);     
        add(Jnum3);
        add(Jnum4);
        add(Jnum5);
        add(Jnum6);
        add(Jnum7);
        add(Jnum8);
        add(Jnum9);
        add(JText);
        add(Jjogodavelha);
        add(JAsteristico);
        add(Jnum0);
        add(JLimpar);
       
    }
    
    public void Eventos(){
            JLimpar.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
            JMostraValor.setText("");
        }
        });
        
          Jnum1.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
            JMostraValor.setText(JMostraValor.getText()+ "1");
            
        }
        });
          
            Jnum2.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
            JMostraValor.setText(JMostraValor.getText()+ "2");
        }
        });
            
              Jnum3.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "3");
        }
        });
              
                Jnum4.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "4");
        }
        });
                Jnum5.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "5");
        }
        });
            
                Jnum6.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "6");
        }
        });
                
                Jnum7.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "7");
        }
        });
                
                Jnum8.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "8");
        }
        });
                Jnum9.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "9");
        }
        });
                
            Jjogodavelha.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "#");
        }
        });
            
            JAsteristico.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "*");
        }
        });   
            
            Jnum0.addActionListener(new ActionListener()
        { 
            public void actionPerformed (ActionEvent e)
        { 
             JMostraValor.setText(JMostraValor.getText()+ "0");
        }
        }); 
                
    }
    

    
public static void main(String[] args) {
     SwingUtilities.invokeLater(new Runnable() {
    public void run() {
           frame = new Teclado();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
           frame.setLocation((tela.width - frame.getSize().width) / 2,(tela.height - frame.getSize().height) / 2);
           frame.setSize(350,350);
           frame.setVisible(true);
		}
	});
    
}
    
}
    
    
 


