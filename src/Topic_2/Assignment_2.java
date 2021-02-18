package Topic_2;

public class Assignment_2 {

	public static void main(String[] args) {
		Email em = new Email();
		em.setRecipient("Ajay");
		em.setSender("Vikram");
		em.setTitle("Leave");
		em.setText("I want a leave");
		System.out.println(em);
	}

}

class Document
{
	String text;
	public void setText(String text) {
		this.text = text;
	}
}

class Email extends Document
{
	String sender, recipient, title;

	public String getSender() {
		return sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public String getTitle() {
		return title;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString()
	{
		return sender + "\n" + recipient + "\n"  + title+ "\n" + text;
	}
	
}
