package billingSystem;

import static billingSystem.Fares.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FareCalculation {
	static DecimalFormat df = new DecimalFormat("#.00");
	
	public static void showCalculatedData(List<ClientData> testCases, ArrayList<Double> clientFares) {
		
		for (int ix = 0; ix < clientFares.size(); ix++) {
			System.out.println("####################################");
			System.out.println("Client Id: " + testCases.get(ix).getClientId());
			System.out.println("Client Name: " + testCases.get(ix).getClientName());
			System.out.println("Total fare calculated: $" + df.format(clientFares.get(ix)));
			System.out.println("####################################");
			
		}		
	}

	public static Double calculateClientFare(ClientData client) {
		double fareCalculation = 0.0f;
		
		if (client.isNewClient()) {
			fareCalculation += validateData(client.getRegularCalls()) * LATENIGHT_CALL.getFare();
			fareCalculation += validateData(client.getLatenightCalls()) * LATENIGHT_CALL.getFare();
			fareCalculation += validateData(client.getWeekendCalls()) * WEEKEND_CALL.getFare();
			if (client.getClientHasInternationalCalls()) {
				fareCalculation += validateData(client.getRegularInternationalCalls()) * 
						LATENIGHT_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
				fareCalculation += validateData(client.getLatenightInternationalCalls()) 
						* LATENIGHT_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
				fareCalculation += validateData(client.getWeekendInternationalCalls()) 
						* WEEKEND_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
			}
		} else  {
			fareCalculation += validateData(client.getRegularCalls()) * REGULAR_CALL.getFare();
			fareCalculation += validateData(client.getLatenightCalls()) * LATENIGHT_CALL.getFare();
			fareCalculation += validateData(client.getWeekendCalls()) * WEEKEND_CALL.getFare();
			if (client.getClientHasInternationalCalls()) {
				fareCalculation += validateData(client.getRegularInternationalCalls()) * 
						REGULAR_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
				fareCalculation += validateData(client.getLatenightInternationalCalls()) 
						* LATENIGHT_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
				fareCalculation += validateData(client.getWeekendInternationalCalls()) 
						* WEEKEND_CALL.getFare() * INTERNATIONAL_BILLING.getFare();
			}
		}
		
		return fareCalculation;
	}

	public static int validateData(int history) {
		int callHistory = 0;
		
		if (history >= 0) {
			callHistory = history;
		}
		
		return callHistory;
	}

}
