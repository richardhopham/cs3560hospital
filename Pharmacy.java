package javafxmltestapp;

public class Pharmacy {

	private String pharmacyID;
	private String pharmacyName, pharmacyAddress, pharmPhoneNum;
	private String pharmAddressLine, pharmFaxNo, pharmNotes, headPharmacist;
	
	public Pharmacy() {}
	
	public String getPharmacyID() {
        return pharmacyID;
    }

    public void setpharmacyID(String pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getPharmName() {
        return pharmacyName;
    }

    public void setPharmName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmPhoneNum() {
        return pharmPhoneNum;
    }

    public void setPhone1(String phone) {
        this.pharmPhoneNum = phone;
    }

    public String getAddress() {
        return pharmacyAddress;
    }

    public void setAddress(String address) {
        this.pharmacyAddress = address;
    }

    public String getAddressLine() {
        return pharmAddressLine;
    }

    public void setAddressLine(String addressLine) {
        this.pharmAddressLine = addressLine;
    }
    
    public String getHeadPharmacist() {
    	return headPharmacist;
    }
    
    public void setHeadPharmacist(String headPharm) {
    	this.headPharmacist = headPharm;
    }
    
    public String getFaxNo() {
        return pharmFaxNo;
    }

    public void setFaxNo(String faxNo) {
        this.pharmFaxNo = faxNo;
    }

    public String getNotes() {
        return pharmNotes;
    }

    public void setNotes(String notes) {
        this.pharmNotes = notes;
    }

	@Override
	public String toString() {
		return "Pharmacy [pharmacyID=" + pharmacyID + ", name=" + pharmacyName + ", address=" + pharmacyAddress + ", addressLine=" + pharmAddressLine + ", phone="
				+ pharmPhoneNum +  ", headPharmacist=" + headPharmacist  + ", faxNo=" + pharmFaxNo  + ", notes=" + pharmNotes + "]";
	}
}
