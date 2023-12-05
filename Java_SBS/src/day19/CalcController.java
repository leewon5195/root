package day19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;

public class CalcController implements ActionListener {

	CalcView cv;
	private EventObject e;
	
	CalcController(){
		cv = new CalcView();
		cv.btn_plus.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(e.getSource() == cv.btn_plus) {
			int num1 = Integer.parseInt(cv.tr_num1.getText());
			int num2 = Integer.parseInt(cv.tr_num2.getText());
			
			CalcModel calc = new CalcModel();
			int result = calc.plus(num1,num2);
			cv.la_result.setText("결과는"+result+"입니다.");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new CalcController();
		
	}


	

}
