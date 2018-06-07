package database;

import java.util.Date;

public class Devices {
	
//	a UID (number),
//	vendor (string),
//	date created,
//	status - online/offline.
	
	private Integer uid;
	
	private String vendor;
	
	private Date dateCreated;
	
	private boolean status;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
