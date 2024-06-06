/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.puzzelnum;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
//import static java.awt.PageAttributes.MediaType.C;


/**
 *
 * @author Mudhitha Kalpani
 */
public class PuzzelNum extends Frame implements ActionListener{
    
    JFrame fram;
    Panel pnl= new Panel();
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,btsol,btback,btexit;
    int count,second;
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Timer time;
    private DefaultTableModel tableModel;
    

    
    public PuzzelNum(){
        bt1= new Button ("1");
        bt1.setBounds(80, 100, 50, 50);
        bt1.setFont(new Font("Calibri", Font.BOLD,15));
        bt2= new Button("6");
        bt2.setBounds(130, 100, 50, 50);
        bt2.setFont(new Font("Calibri", Font.BOLD,15));
        bt3= new Button("7");
        bt3.setBounds(180, 100, 50, 50);
        bt3.setFont(new Font("Calibri", Font.BOLD,15));
        bt4= new Button("13");
        bt4.setBounds(230, 100, 50, 50);
        bt4.setFont(new Font("Calibri", Font.BOLD,15));
        bt5= new Button("2");
        bt5.setBounds(80, 150, 50, 50);
        bt5.setFont(new Font("Calibri", Font.BOLD,15));
        bt6= new Button("");
        bt6.setBounds(130, 150, 50, 50);
        bt6.setFont(new Font("Calibri", Font.BOLD,15));
        bt7= new Button("14");
        bt7.setBounds(180, 150, 50, 50);
        bt7.setFont(new Font("Calibri", Font.BOLD,15));
        bt8= new Button("12");
        bt8.setBounds(230, 150, 50, 50);
        bt8.setFont(new Font("Calibri", Font.BOLD,15));
        bt9= new Button("3");
        bt9.setBounds(80, 200, 50, 50);
        bt9.setFont(new Font("Calibri", Font.BOLD,15));
        bt10= new Button("4");
        bt10.setBounds(130, 200, 50, 50);
        bt10.setFont(new Font("Calibri", Font.BOLD,15));
        bt11=new Button("11");
        bt11.setBounds(180, 200, 50, 50);
        bt11.setFont(new Font("Calibri", Font.BOLD,15));
        bt12= new Button("15");
        bt12.setBounds(230, 200, 50, 50);
        bt12.setFont(new Font("Calibri", Font.BOLD,15));
        bt13= new Button("8");
        bt13.setBounds(80, 250, 50, 50);
        bt13.setFont(new Font("Calibri", Font.BOLD,15));
        bt14= new Button("9");
        bt14.setBounds(130, 250, 50, 50);
        bt14.setFont(new Font("Calibri", Font.BOLD,15));
        bt15= new Button("10");
        bt15.setBounds(180, 250, 50, 50);
        bt15.setFont(new Font("Calibri", Font.BOLD,15));
        bt16= new Button("5");
        bt16.setBounds(230, 250, 50, 50);
        bt16.setFont(new Font("Calibri", Font.BOLD,15));
        btsol= new Button("Solve");
        btsol.setFont(new Font("TimesRoman", Font.ITALIC,16));
        btsol.setBounds(250, 320, 90, 30);
        t1=new TextField();
        t1.setBounds(80, 50, 60, 20);
        l1= new Label("Time");
        l1.setBounds(20,50,40,20);
        l2=new Label ("Count");
        l2.setBounds(200,50,40,20);
        t2=new TextField();
        t2.setBounds(250, 50, 40, 20);
        l3=new Label("Welcome to the puzzle game");
        l3.setBounds(60,15,220,15);
        l3.setFont(new Font("Dialog",Font.ITALIC,16));
        btexit= new Button("Exit");
        btexit.setFont(new Font("TimesRoman", Font.ITALIC,16));
        btexit.setBounds(150, 320, 90, 30);
        btback= new Button("Back");
        btback.setFont(new Font("TimesRoman", Font.ITALIC,16));
        btback.setBounds(50, 320, 90, 30);
        
        
        
        
        bt1.addActionListener(this); 
        bt2.addActionListener(this); 
        bt3.addActionListener(this); 
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this); 
        bt7.addActionListener(this);
        bt8.addActionListener(this); 
        bt9.addActionListener(this); 
        bt10.addActionListener(this);
        bt11.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt15.addActionListener(this);
        bt16.addActionListener(this);
        btsol.addActionListener(this);
        t1.addActionListener(this);
        btback.addActionListener(this);
        btexit.addActionListener(this);
    
        
        
        JFrame fram= new JFrame("WELCOME TO THE PUZZLE GAME");
        fram.setSize(400,400);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.getContentPane().setBackground(Color.ORANGE);
        //fram.setBackground(new ImageIcon (C:\Users\Mudhitha Kalpani\Desktop\template\toys.jpg));
        
        JFrame fram2= new JFrame();
        fram2.setSize(200,200);
        
        fram.add(bt1);
        fram.add(bt2);
        fram.add(bt3);
        fram.add(bt4);
        fram.add(bt5);
        fram.add(bt6);
        fram.add(bt7);
        fram.add(bt8);
        fram.add(bt9);
        fram.add(bt10);
        fram.add(bt11);
        fram.add(bt12);
        fram.add(bt13);
        fram.add(bt14);
        fram.add(bt15);
        fram.add(bt16);
        fram.add(btsol);
        fram.add(btback);
        fram.add(t1);
        fram.add(t2);
        fram.add(l1);
        fram.add(l2);
        fram.add(l3);
        
        fram.setLayout(null);
        fram.setVisible(true);
        
        
        
}
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        settimer();
        time.start();
        l3.setText("Now \t Game is started....Try.");
                
        if(e.getSource()==bt1){
            String nl= bt1.getLabel();
            if("".equals(bt2.getLabel())){
                bt2.setLabel(nl);
                bt1.setLabel("");
            }
            if(bt5.getLabel().equals("")){
                bt5.setLabel(nl);
                bt1.setLabel("");
                
            } 
            solve();
            Toolkit.getDefaultToolkit().beep();	
        }
        if(e.getSource()==bt2){
            String nl= bt2.getLabel();
            if(bt1.getLabel().equals("")){
                bt1.setLabel(nl);
                bt2.setLabel("");
            }
            if(bt3.getLabel().equals("")){
                bt3.setLabel(nl);
                bt2.setLabel("");
                
            }
            if(bt6.getLabel().equals("")){
                 bt6.setLabel(nl);
                 bt2.setLabel("");
                
            } 
            solve();
            Toolkit.getDefaultToolkit().beep();
            //fram.setTitle("game is started");
        }
        
        if(e.getSource()==bt3){
            String nl= bt3.getLabel();
            if(bt2.getLabel().equals("")){
                bt2.setLabel(nl);
                bt3.setLabel("");
            }
            if(bt4.getLabel().equals("")){
                bt4.setLabel(nl);
                bt3.setLabel("");
            }
            if(bt7.getLabel().equals("")){
                bt7.setLabel(nl);
                bt3.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(e.getSource()==bt4){
            String nl= bt4.getLabel();
            if(bt3.getLabel().equals("")){
                bt3.setLabel(nl);
                bt4.setLabel("");
            }
            if(bt8.getLabel().equals("")){
                bt8.setLabel(nl);
                bt4.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(e.getSource()==bt5){
            String nl= bt5.getLabel();
            if(bt6.getLabel().equals("")){
                bt6.setLabel(nl);
                bt5.setLabel("");
            }
            if(bt1.getLabel().equals("")){
                bt1.setLabel(nl);
                bt5.setLabel("");
            }
            if(bt9.getLabel().equals("")){
                bt9.setLabel(nl);
                bt5.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt6){
           String nl= bt6.getLabel();
           if(bt5.getLabel().equals("")){
               bt5.setLabel(nl);
               bt6.setLabel("");
           }
           if(bt2.getLabel().equals("")){
               bt2.setLabel(nl);
               bt6.setLabel("");
           }
            if(bt7.getLabel().equals("")){
                bt7.setLabel(nl);
                bt6.setLabel("");
            }
            if(bt10.getLabel().equals("")){
                bt10.setLabel(nl);
                bt6.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(e.getSource()==bt7){
            String nl= bt7.getLabel();
            if(bt6.getLabel().equals("")){
                bt6.setLabel(nl);
                bt7.setLabel("");
            }
            if(bt3.getLabel().equals("")){
                bt3.setLabel(nl);
                bt7.setLabel("");
            }
            if(bt8.getLabel().equals("")){
                bt8.setLabel(nl);
                bt7.setLabel("");
            }
            if(bt11.getLabel().equals("")){
                bt11.setLabel(nl);
                bt7.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        if(e.getSource()==bt8){
            String nl= bt8.getLabel();
            if(bt7.getLabel().equals("")){
                bt7.setLabel(nl);
                bt8.setLabel("");
            }
            if(bt4.getLabel().equals("")){
                bt4.setLabel(nl);
                bt8.setLabel("");
            }
            if(bt12.getLabel().equals("")){
                bt12.setLabel(nl);
                bt8.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt9){
            String nl= bt9.getLabel();
            if(bt5.getLabel().equals("")){
                bt5.setLabel(nl);
                bt9.setLabel("");
            }
            if(bt10.getLabel().equals("")){
                bt10.setLabel(nl);
                bt9.setLabel("");
            }
            if(bt13.getLabel().equals("")){
                bt13.setLabel(nl);
                bt9.setLabel("");
            }
           solve();
           Toolkit.getDefaultToolkit().beep();
            
        }
        
        
        if(e.getSource()==bt10){
            String nl= bt10.getLabel();
            if(bt9.getLabel().equals("")){
                bt9.setLabel(nl);
                bt10.setLabel("");
            }
            if(bt6.getLabel().equals("")){
                bt6.setLabel(nl);
                bt10.setLabel("");
            }
            if(bt11.getLabel().equals("")){
                bt11.setLabel(nl);
                bt10.setLabel("");
            }
            if(bt14.getLabel().equals("")){
                bt14.setLabel(nl);
                bt10.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt11){
            String nl= bt11.getLabel();
            if(bt10.getLabel().equals("")){
                bt10.setLabel(nl);
                bt11.setLabel("");
            }
            if(bt7.getLabel().equals("")){
                bt7.setLabel(nl);
                bt11.setLabel("");
            }
            if(bt12.getLabel().equals("")){
                bt12.setLabel(nl);
                bt11.setLabel("");
            }
            if(bt15.getLabel().equals("")){
                bt15.setLabel(nl);
                bt11.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt12){
            String nl= bt12.getLabel();
            if(bt11.getLabel().equals("")){
                bt11.setLabel(nl);
                bt12.setLabel("");
            }
            
            if(bt8.getLabel().equals("")){
                bt8.setLabel(nl);
                bt12.setLabel("");
            }
            if(bt16.getLabel().equals("")){
                bt16.setLabel(nl);
                bt12.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt13){
            String nl= bt13.getLabel();
            
            if(bt9.getLabel().equals("")){
                bt9.setLabel(nl);
                bt13.setLabel("");
            }
            if(bt14.getLabel().equals("")){
                bt14.setLabel(nl);
                bt13.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt14){
            String nl= bt14.getLabel();
            
            if(bt15.getLabel().equals("")){
                bt15.setLabel(nl);
                bt14.setLabel("");
            }
            if(bt10.getLabel().equals("")){
                bt10.setLabel(nl);
                bt14.setLabel("");
            }
            if(bt13.getLabel().equals("")){
                bt13.setLabel(nl);
                bt14.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt15){
            String nl= bt15.getLabel();
            
            if(bt14.getLabel().equals("")){
               bt14.setLabel(nl);
               bt15.setLabel("");
            }
            if(bt16.getLabel().equals("")){
                bt16.setLabel(nl);
                bt15.setLabel("");
            }
            if(bt11.getLabel().equals("")){
                bt11.setLabel(nl);
                bt15.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        if(e.getSource()==bt16){
            String nl= bt16.getLabel();
            if(bt15.getLabel().equals("")){
                bt15.setLabel(nl);
                bt16.setLabel("");
            }
            if(bt12.getLabel().equals("")){
                bt12.setLabel(nl);
                bt16.setLabel("");
            }
            solve();
            Toolkit.getDefaultToolkit().beep();
        }
        
        
        
        if(e.getSource()== btsol){
            bt1.setLabel("1");
            bt2.setLabel("2");
            bt3.setLabel("3");
            bt4.setLabel("4");
            bt5.setLabel("8");
            bt6.setLabel("7");
            bt7.setLabel("6");
            bt8.setLabel("5");
            bt9.setLabel("9");
            bt10.setLabel("10");
            bt11.setLabel("11");
            bt12.setLabel("12");
            bt13.setLabel("");
            bt14.setLabel("15");
            bt15.setLabel("14");
            bt16.setLabel("13");
            
        }
        
        if(e.getSource()==btback){
            NewJFrame11 n= new NewJFrame11();
            n.setVisible(true);
            PuzzelNum.this.setVisible(false);
            time.stop();
        }
        if(e.getSource()==btexit){
            dispose();
        }
                 
    }
    
    
    public void  solve(){
        
        
        if(bt1.getLabel().equals("1")&& bt2.getLabel().equals("2")&& bt3.getLabel().equals("3")&& bt4.getLabel().equals("4") && bt5.getLabel().equals("8") && bt6.getLabel().equals("7") && bt7.getLabel().equals("6") && bt8.getLabel().equals("5") && bt9.getLabel().equals("9") && bt10.getLabel().equals("10") && bt11.getLabel().equals("11") && bt12.getLabel().equals("12") && bt13.getLabel().equals("") && bt14.getLabel().equals("15") && bt15.getLabel().equals("14")&&bt16.getLabel().equals("13") ){
           
            time.stop();
            NewJFrame1test nf= new NewJFrame1test();
            NewJFrame2 n2= new NewJFrame2();
            n2.getdeta();
            nf.jTextField2.setText(t1.getText());
            nf.setVisible(true);
            
            
            winner w= new winner();
            this.tableModel = w.getTableModel();
            String textCompare = t1.getText();
        
            int compareValue;
            try{
                compareValue =Integer.parseInt(textCompare);
            }
            catch(NumberFormatException ex){
                return;
            }
        
        
            for(int i=0;i<tableModel.getRowCount();i++){
                int intValue =(Integer)tableModel.getValueAt(i, 1);
                if(compareValue > intValue){
                    l3.setText("You are the CHAMPION... CONGRATS..");
                }
            }
        }
        count = count +1;
        t2.setText(Integer.toString(count));
         }
    
    
    
    public void settimer(){
        time= new Timer(1000, (ActionEvent e) -> {
            second++;
            t1.setText(Integer.toString(second));
        });
            
       
    }
    
    
    
    public void Checktime(winner w){
        this.tableModel = w.getTableModel();
        String textCompare = t1.getText();
        
        int compareValue;
        try{
            compareValue =Integer.parseInt(textCompare);
        }
        catch(NumberFormatException ex){
            return;
        }
        
        
        for(int i=0;i<tableModel.getRowCount();i++){
            int intValue =(Integer)tableModel.getValueAt(i, 1);
            if(compareValue > intValue){
                l3.setText("You are the CHAMPION... CONGRATS..");
            }
        }
    }
    
    
    
    /*public static void main(String[] args) {
        PuzzelNum p=new PuzzelNum();
       // NewJFrame n=new NewJFrame();
    }*/
}
