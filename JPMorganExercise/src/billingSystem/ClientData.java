package billingSystem;

public class ClientData {
	private String clientId;
	private String clientName;
	private boolean newClient;
	private boolean hasInternationalCalls;
	private int regularCalls;
	private int latenightCalls;
	private int weekendCalls;
	private int regularInternationalCalls;
	private int latenightInternationalCalls;
	private int weekendInternationalCalls;
	
	
	public ClientData(String clientId, String clientName , boolean newClient, boolean hasInternationalCalls, int regularCalls, int latenightCalls,
			int weekendCalls, int regularInternationalCalls, int latenightInternationalCalls,
			int weekendInternationalCalls) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.newClient = newClient;
		this.hasInternationalCalls = hasInternationalCalls;
		this.regularCalls = regularCalls;
		this.latenightCalls = latenightCalls;
		this.weekendCalls = weekendCalls;
		this.regularInternationalCalls = regularInternationalCalls;
		this.latenightInternationalCalls = latenightInternationalCalls;
		this.weekendInternationalCalls = weekendInternationalCalls;
	}


	public boolean isNewClient() {
		return newClient;
	}


	public void setNewClient(boolean newClient) {
		this.newClient = newClient;
	}


	public boolean getClientHasInternationalCalls() {
		return hasInternationalCalls;
	}


	public void setHasInternationalCalls(boolean hasInternationalCalls) {
		this.hasInternationalCalls = hasInternationalCalls;
	}


	public int getRegularCalls() {
		return regularCalls;
	}


	public void setRegularCalls(int regularCalls) {
		this.regularCalls = regularCalls;
	}


	public int getLatenightCalls() {
		return latenightCalls;
	}


	public void setLatenightCalls(int latenightCalls) {
		this.latenightCalls = latenightCalls;
	}


	public int getWeekendCalls() {
		return weekendCalls;
	}


	public void setWeekendCalls(int weekendCalls) {
		this.weekendCalls = weekendCalls;
	}


	public int getRegularInternationalCalls() {
		return regularInternationalCalls;
	}


	public void setRegularInternationalCalls(int regularInternationalCalls) {
		this.regularInternationalCalls = regularInternationalCalls;
	}


	public int getLatenightInternationalCalls() {
		return latenightInternationalCalls;
	}


	public void setLatenightInternationalCalls(int latenightInternationalCalls) {
		this.latenightInternationalCalls = latenightInternationalCalls;
	}


	public int getWeekendInternationalCalls() {
		return weekendInternationalCalls;
	}


	public void setWeekendInternationalCalls(int weekendInternationalCalls) {
		this.weekendInternationalCalls = weekendInternationalCalls;
	}


	public String getClientId() {
		return clientId;
	}


	public void setClientId(String clientId) {
		this.clientId = clientId;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	@Override
	public String toString() {
		return "ClientData [clientId= " + clientId + ",\nclientName: " + clientName + ",\nisNewClient: " + newClient + ",\nclienthasInternationalCalls: "
				+ hasInternationalCalls + ",\nregularCalls (minutes): " + regularCalls + ",\nlatenightCalls (minutes): " + latenightCalls
				+ ",\nweekendCalls (minutes): " + weekendCalls + ",\nregularTimeInternationalCalls (minutes): " + regularInternationalCalls
				+ ",\nlatenightInternationalCalls (minutes): " + latenightInternationalCalls + ",\nweekendInternationalCalls (minutes): "
				+ weekendInternationalCalls + "]\n";
	}


}
