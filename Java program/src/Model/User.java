package Model;

public abstract class User {
	
	private boolean registered;
	private int userId;
	private String address;
	private String email;
	private int creditCard;
	private String name;
	private Coupon coupon;
	private Seat seat;
	private Ticket wantsTicket;
	private FinancialInstitute financialInstitute;
	
//	public abstract void makePayment();
//	public abstract void getRefund(int receiptId);
	public abstract void getUserInformation();

	
	public boolean isRegistered() {
		return registered;
	}
	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Ticket getWantsTicket() {
		return wantsTicket;
	}
	public void setWantsTicket(Ticket wantsTicket) {
		this.wantsTicket = wantsTicket;
	}
	public FinancialInstitute getFinancialInstitute() {
		return financialInstitute;
	}
	public void setFinancialInstitute(FinancialInstitute financialInstitute) {
		this.financialInstitute = financialInstitute;
	}
	

}
