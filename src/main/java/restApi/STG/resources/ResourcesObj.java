package restApi.STG.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResourcesObj {
	private int id;	
	private String chargedTo;	
		private String chgdDirectName;
		private String chgdTelNumber;
		private String chgdType;
		private String chgdDate;	

	private String serial;
	private String brand;
	private String type;
	private String provider;
	private String commercialValue;
	private String dateOfPurchase;	
	private String state;
	

	public String getChargedTo() {
		return chargedTo;
	}
	public void setChargedTo(String chargedTo) {
		this.chargedTo = chargedTo;
	}
	public String getChgdDirectName() {
		return chgdDirectName;
	}
	public void setChgdDirectName(String chgdDirectName) {
		this.chgdDirectName = chgdDirectName;
	}
	public String getChgdTelNumber() {
		return chgdTelNumber;
	}
	public void setChgdTelNumber(String chgdTelNumber) {
		this.chgdTelNumber = chgdTelNumber;
	}
	public String getChgdType() {
		return chgdType;
	}
	public void setChgdType(String chgdType) {
		this.chgdType = chgdType;
	}
	public String getChgdDate() {
		return chgdDate;
	}
	public void setChgdDate(String chgdDate) {
		this.chgdDate = chgdDate;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getCommercialValue() {
		return commercialValue;
	}
	public void setCommercialValue(String commercialValue) {
		this.commercialValue = commercialValue;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
