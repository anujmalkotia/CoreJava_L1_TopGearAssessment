package Topic_2;

public class Assignment_4 {

	public static void main(String[] args) {
		CreditCardPayment cc1 = new CreditCardPayment("Anil", "08/25", "7777 777 7777 7777");
		cc1.setPayment(34000);
		cc1.PaymentDetails();
		CreditCardPayment cc2 = new CreditCardPayment("Vikas", "07/25", "9999 9999 9999 9999");
		cc2.setPayment(34000);
		cc2.PaymentDetails();
		
		

	}

}

class Payment
{
	double payment;

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	public void PaymentDetails()
	{
		System.out.println("Amount of payment::" + payment);
	}
	
}
class CreditCardPayment extends Payment
{
	String name, expiration, card_no;
	public CreditCardPayment(String name, String expiration, String card_no) {
		super();
		this.name = name;
		this.expiration = expiration;
		this.card_no = card_no;
	}
	
	public void PaymentDetails()
	{
		System.out.println("Amount of payment::" + payment);
		System.out.println("NAME:" + name + "EXPIRATION:" + expiration + "CARD NO:" + card_no);
	}
	
}
