package ex;

public class OutSourcedemployee extends employee {
	private Double aditionalCharge;
	
	
	
	public OutSourcedemployee(String name, Integer hour, Double valuePerHour, Double aditionalCharge) {
		super(name, hour, valuePerHour);
		this.aditionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return aditionalCharge;
	}
	public void setAditionalCharge(Double aditionalCharge) {
		this.aditionalCharge = aditionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + aditionalCharge * 1.1 ;
	
}	
}
