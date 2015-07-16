package jmmsdca.github.spdmtr;

import java.util.*;

public class speedometerTest {

	public static void main(String[] args) {
		Speedometer spdmtr = new Speedometer();
		Scanner in = new Scanner(System.in);
		
		String userInput = in.nextLine();
		while(!userInput.equals("e"))
		{
			spdmtr.accelerate();
			System.out.println(spdmtr.getSpeed());
			userInput = in.nextLine();
		}
		in.close();
		System.out.println("Exited");

	}

}
