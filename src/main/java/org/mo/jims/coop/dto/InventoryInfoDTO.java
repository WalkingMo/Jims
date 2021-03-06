package org.mo.jims.coop.dto;

import org.mo.jims.coop.entity.GoodInfo;
import org.mo.jims.coop.entity.InventoryInfo;
import org.mo.open.common.exception.MyRuntimeException;

public class InventoryInfoDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String id;

	private String unitCost;

	private String amount;

	private String goodName;

	private String time;

	private String formtoken;

	public InventoryInfo toEditObject()
			throws MyRuntimeException {
		try {
			return new InventoryInfo(id, Float.parseFloat(unitCost), Integer.parseInt(amount));
		} catch (Exception e) {
			throw new MyRuntimeException(
					"toEditObject-InventoryInfoDTO convert fail");
		}
	}

	public InventoryInfo toAddObject(GoodInfo goodInfo)
			throws MyRuntimeException {
		try {
			return new InventoryInfo(Float.parseFloat(unitCost),
					Integer.parseInt(amount), goodInfo);
		} catch (Exception e) {
			throw new MyRuntimeException(
					"toAddObject-InventoryInfoDTO convert fail");
		}
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public String getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(String unitCost) {
		this.unitCost = unitCost;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFormtoken() {
		return formtoken;
	}

	public void setFormtoken(String formtoken) {
		this.formtoken = formtoken;
	}

	@Override
	public String toString() {
		return "InventoryInfoDTO [id=" + id + ", unitCost=" + unitCost
				+ ", amount=" + amount + ", goodName=" + goodName + ", time="
				+ time + ", formtoken=" + formtoken + "]";
	}

}
