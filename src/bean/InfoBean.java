package bean;

public class InfoBean {

	private String name;
	private String company;
	private String mailAddress;
	private String info;
	private String[] mailKind;
	private String radio;

	public InfoBean() {
	}

	public InfoBean(
			String name,
			String company,
			String mailAddress,
			String info,
			String[] mailKind,
			String radio
			) {
		this.name = name;
		this.company = company;
		this.mailAddress = mailAddress;
		this.info = info;
		this.mailKind = mailKind;
		this.radio = radio;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String[] getMailKind() {
		return mailKind;
	}
	public void setMailKind(String[] mailKind) {
		this.mailKind = mailKind;
	}
	public String getRadio() {
		return radio;
	}
	public void setRadio(String radio) {
		this.radio = radio;
	}

}
