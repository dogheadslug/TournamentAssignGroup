import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

class tournamentUI {
public static void main(String[] args) {
   JFrame frame = new JFrame("随机分组");
   Container pane = frame.getContentPane();
   pane.setLayout(new FlowLayout(FlowLayout.CENTER));
   JButton go = new JButton("                                   走起                                   "),CENTER;

   //create components
   JTextField input1 = new JTextField(20);
   JTextField input2 = new JTextField(20);
   JTextField input3 = new JTextField(20);
   JTextField input4 = new JTextField(20);
   JTextField input5 = new JTextField(20);
   JTextField input6 = new JTextField(20);
   JTextField input7 = new JTextField(20);
   JTextField input8 = new JTextField(20);
   JTextField input9 = new JTextField(20);
   JTextField input10 = new JTextField(20);
   JTextField input11 = new JTextField(20);
   JTextField input12 = new JTextField(20);
   JTextField input13 = new JTextField(20);
   JTextField input14 = new JTextField(20);
   JTextField input15 = new JTextField(20);
   JTextField input16 = new JTextField(20);
   JTextField resultA = new JTextField(20);
   JTextField resultB = new JTextField(20);
   JTextField resultC = new JTextField(20);
   JTextField resultD = new JTextField(20);
   
   
   //layout add components
   //pane.setLayout(new GridLayout(21, 2));
   
   //add all the components
   pane.add(new JLabel("name 1 "));
   pane.add(input1);
   pane.add(new JLabel("name 2 "));
   pane.add(input2);
   pane.add(new JLabel("name 3 "));
   pane.add(input3);
   pane.add(new JLabel("name 4 "));
   pane.add(input4);
   pane.add(new JLabel("name 5 "));
   pane.add(input5);
   pane.add(new JLabel("name 6 "));
   pane.add(input6);
   pane.add(new JLabel("name 7 "));
   pane.add(input7);
   pane.add(new JLabel("name 8 "));
   pane.add(input8);
   pane.add(new JLabel("name 9 "));
   pane.add(input9);
   pane.add(new JLabel("name 10"));
   pane.add(input10);
   pane.add(new JLabel("name 11"));
   pane.add(input11);
   pane.add(new JLabel("name 12"));
   pane.add(input12);
   pane.add(new JLabel("name 13"));
   pane.add(input13);
   pane.add(new JLabel("name 14"));
   pane.add(input14);
   pane.add(new JLabel("name 15"));
   pane.add(input15);
   pane.add(new JLabel("name 16"));
   pane.add(input16);
   //pane.add(new JLabel(""));
   //pane.add(new JLabel("START WORKING.........."));
   pane.add(go);
 
   
   pane.add(new JLabel("Group A    "));
   pane.add(resultA);
   pane.add(new JLabel("Group B    "));
   pane.add(resultB);
   pane.add(new JLabel("Group C    "));
   pane.add(resultC);
   pane.add(new JLabel("Group D    "));
   pane.add(resultD);
   
   //listener
   tournament listener = new tournament(input1,input2,input3,input4,input5,input6,input7,input8,input9,input10,
		   input11,input12,input13,input14,input15,input16,resultA,resultB,resultC,resultD);
   go.addActionListener(listener);
   frame.pack();
   frame.setSize(340,640);
   frame.setVisible(true);
   }
}

