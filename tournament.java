import java.util.Random;
import javax.swing.JTextField;
import javax.swing.Spring;

import java.util.*;
import java.awt.event.*;
import java.lang.reflect.Array;

public class tournament implements ActionListener {
	tournament(JTextField input1,JTextField input2,JTextField input3,JTextField input4,
			JTextField input5,JTextField input6,JTextField input7,JTextField input8,
			JTextField input9,JTextField input10,JTextField input11,JTextField input12,
			JTextField input13,JTextField input14,JTextField input15,JTextField input16,
			JTextField resulta,JTextField resultb,JTextField resultc,JTextField resultd){
		in1=input1;
		in2=input2;
		in3=input3;
		in4=input4;
		in5=input5;
		in6=input6;
		in7=input7;
		in8=input8;
		in9=input9;
		in10=input10;
		in11=input11;
		in12=input12;
		in13=input13;
		in14=input14;
		in15=input15;
		in16=input16;
		outputA=resulta;
		outputB=resultb;
		outputC=resultc;
		outputD=resultd;
	}
	private JTextField outputA,outputB,outputC,outputD;
	JTextField in1,in2,in3,in4,in5,in6,in7,in8,in9,in10,in11,in12,in13,in14,in15,in16;

	public void actionPerformed(ActionEvent e) {
		JTextField[] input=new JTextField[16];
		//assigning the names into the array
		input[0]=in1;
		input[1]=in2;
		input[2]=in3;
		input[3]=in4;
		input[4]=in5;
		input[5]=in6;
		input[6]=in7;
		input[7]=in8;
		input[8]=in9;
		input[9]=in10;
		input[10]=in11;
		input[11]=in12;
		input[12]=in13;
		input[13]=in14;
		input[14]=in15;
		input[15]=in16;
		String tmp1 = " ",tmp2 = " ",tmp3 = " ",tmp4 = " ";
		//four array groups 
		JTextField[] Group = new JTextField[16];
		
		//main for loop
		for(int i=0;i<=15;i++){
			Assign(Group,input[i]);
		}
		
		
		//outputGroup(Group);
		for(int j=0;j<4;j++){
				tmp1=tmp1 + Group[j].getText()+" ";
				tmp2=tmp2 + Group[j+4].getText()+" ";
				tmp3=tmp3 + Group[j+8].getText()+" ";
				tmp4=tmp4 + Group[j+12].getText()+" ";
			}
		outputA.setText(tmp1);
		outputB.setText(tmp2);
		outputC.setText(tmp3);
		outputD.setText(tmp4);
		
		}

	private void Assign(JTextField[] Group, JTextField object) {
		//random number generator
		Random random = new Random();
		int s = random.nextInt(16) + 0;
		
		if(Group[s]==null)
			Group[s]=object;	
		else
			Assign(Group,object);
	}

}



