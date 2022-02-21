package tutorial.abengalicoder.Adapter.model;

public class SeniorEmployee implements Employee {

	private Integer id;
	private String fname;
	private String lname;
	private String email;

	public SeniorEmployee(Integer id, String fname, String lname, String email)
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString()
	{
		return "SeniorEmployee{" +
				"id=" + id +
				", fname='" + fname + '\'' +
				", lname='" + lname + '\'' +
				", email='" + email + '\'' +
				'}';
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.fname;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lname;
	}
}
