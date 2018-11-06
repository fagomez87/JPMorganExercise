package billingSystem;

public enum Fares {
	REGULAR_CALL(0.05),
	LATENIGHT_CALL(0.02),
	WEEKEND_CALL(0.01),
	INTERNATIONAL_BILLING(2);
	
	private final double fare;
	
	Fares(double fare) {
		this.fare = fare;
	}
	
	public double getFare() {
		return this.fare;
	}
}
