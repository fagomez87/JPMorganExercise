package billingSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static billingSystem.FareCalculation.*;

public class Billing {
	
	static ClientData case1 = new ClientData("112AB", "John Doe", true, true, 280, 329, 101, 600, 435, 90);
	static ClientData case2 = new ClientData("0932ZZ", "Mike Wazowsky", false, false, 534, 0, -12, 70, 1230, 0);
	static ClientData case3 = new ClientData("J91K", "Lorem Ipsum", false, false, 1202, 0, 409, 0, 0, 0);
	static ClientData case4 = new ClientData("ESD44", "James Miller", false, false, 912, 0, 512, 0, 0, 0);
	static ClientData case5 = new ClientData("PLSK1019", "William Brown", true, false, 1024, 0, 409, 0, 80000, 0);
	static ClientData case6 = new ClientData("ABC1020", "Susan Garcia", false, false, 1202, 0, 2048, 0, 0, 0);
	static ClientData case7 = new ClientData("LOR939", "Charles Anderson", true, true, 1202, 0, 409, 4096, 216, 54);
	static ClientData case8 = new ClientData("8U3U83", "Nancy Lee", false, true, 1202, 0, 409, 1000, 500, 742);
	
	public static void main(String[] args) {
		List<ClientData> clients = Arrays.asList(case1, case2, case3, case4, case5, case6, case7, case8);
		ArrayList<Double> clientFares = new ArrayList<Double>();
		
		
		for (ClientData client : clients) {
			clientFares.add(calculateClientFare(client));
		} 
		
		
		//just to check if test cases are loaded OK
		//System.out.println(testCases);
		showCalculatedData(clients, clientFares);
		
	}

}
