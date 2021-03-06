package com.cg.bean;

public class Asset {

	
	private int assetId;

	private String assetName;
	private String status;
	private String remark;
	
	

	public Asset(String assetName, String status, String remark) {
		super();
		this.assetName = assetName;
		this.status = status;
		this.remark = remark;
	}

	public int getAssetId() {
		return assetId;
	}

	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
