package in.nit.model;

import java.util.List;


import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "omtab")

public class OrderMethod {
	@Id
	@GeneratedValue(generator = "omidgen")
	@GenericGenerator(name="omidgn",strategy = "increment")
	@Column(name="omid")
	private Integer orderId;
	@Column(name="omMode")
	private String orderMode;
	@Column(name="omCode")
	private String orderCode;
	@Column(name="omType")
	private String orderType;
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="omacpttab",joinColumns = @JoinColumn(name="omid"))
	@OrderColumn(name="pos")
	@Column(name="acpt")
	private List<String>orderacpt;
	@Column(name = "omdesc")
	private String description;
	public OrderMethod() {
		super();
	}
	public OrderMethod(Integer orderId) {
		super();
		this.orderId = orderId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderMode() {
		return orderMode;
	}
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public List<String> getOrderacpt() {
		return orderacpt;
	}
	public void setOrderacpt(List<String> orderacpt) {
		this.orderacpt = orderacpt;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "OrderMethod [orderId=" + orderId + ", orderMode=" + orderMode + ", orderCode=" + orderCode
				+ ", orderType=" + orderType + ", orderacpt=" + orderacpt + ", description=" + description + "]";
	}

}
