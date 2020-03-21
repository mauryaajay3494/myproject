package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiptab")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="sid")
	private Integer shipId;
	@Column(name = "smode")
	private String shipmode;
	@Column(name = "scode")
	private String shipcode;
	@Column(name = "eship")
	private String enbShip;
	@Column (name = "sgrd")
	private  String shipGrad;
	@Column (name="sdesc")
	private String shipDesc;
	public ShipmentType() {
		super();
	}
	
	public ShipmentType(Integer shipId) {
		super();
		this.shipId = shipId;
	}

	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipmode() {
		return shipmode;
	}
	public void setShipmode(String shipmode) {
		this.shipmode = shipmode;
	}
	public String getShipcode() {
		return shipcode;
	}
	public void setShipcode(String shipcode) {
		this.shipcode = shipcode;
	}
	public String getEnbShip() {
		return enbShip;
	}
	public void setEnbShip(String enbShip) {
		this.enbShip = enbShip;
	}
	public String getShipGrad() {
		return shipGrad;
	}
	public void setShipGrad(String shipGrad) {
		this.shipGrad = shipGrad;
	}
	public String getShipDesc() {
		return shipDesc;
	}
	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}
	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", shipmode=" + shipmode + ", shipcode=" + shipcode + ", enbShip="
				+ enbShip + ", shipGrad=" + shipGrad + ", shipDesc=" + shipDesc + "]";
	}
	
	

}
