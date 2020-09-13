package test;

import com.gm.pcworld.*;

public class PcWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example PC creation;
	  	Display hpDisplay = new Display("HP");
        Keyboard hpKeyboard = new Keyboard("HP");
        Mouse hpMouse = new Mouse("HP");
        PC hpComputer = new PC("HP PC", hpDisplay, hpKeyboard, hpMouse);
        
        //Dell PC Creation
        Display dellDisplay = new Display("Dell");
        Keyboard dellKeyboard = new Keyboard("Dell");
        Mouse dellMouse = new Mouse("Dell");
        PC compuDell = new PC("Dell PC", dellDisplay, dellKeyboard, dellMouse);

        //Mixed PC Creation
        PC mixedPC = new PC("Mixed PC", dellDisplay, hpKeyboard, hpMouse);

        
        //Add the computers to the order
        Order order1 = new Order();
        order1.addPC(hpComputer);
        order1.addPC(compuDell);
        order1.addPC(mixedPC);
        //Print the order
        order1.showOrder();
        
        
	}

}
