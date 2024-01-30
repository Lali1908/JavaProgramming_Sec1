import java.time.Year;

public class FictionBook implements Author, Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title , int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
		this.email = email;
		this.author_name = author_name;
	}
	
	public void setAuthorName(String name) {
		this.author_name = author_name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getLastName() {
		return this.getLastName().toUpperCase();
	}
	
	public String getFirstName() {
		return this.getFirstName().toUpperCase();
	}
	
	public boolean checkFormatName() {
		int space = this.author_name.trim().indexOf(" ");
		if(space==-1) return false;
		else return true;}
	/*public boolean checkFormatName() {
		if(author_name.endsWith(getFirstName() + " " + getLastName())) { return true; }
		else { return false; }
	}*/
 
	public boolean checkEmail() {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) { return true; }
		else { return false; }
	}
	
	public int totalPublicYear() {
		return Year.now().getValue()-totalPublicYear();
	}
	
	@Override
	public String getTitle() {
		return null;
	}
	
	public String toString() {
		return title+"write by"+this.author_name+"."+this.getFirstName()+ "(" + this.email + ")"
					 + "Published for" + this.totalPublicYear() + "years";
	}

}