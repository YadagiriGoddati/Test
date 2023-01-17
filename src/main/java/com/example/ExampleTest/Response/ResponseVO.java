/**
 * 
 */
package com.example.ExampleTest.Response;

/**
 * @author Giri_
 *
 */
public class ResponseVO {
	
	private String dataValue;
	private String result;
	private Integer status;
	private String responseCount;
	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getResponseCount() {
		return responseCount;
	}
	public void setResponseCount(String responseCount) {
		this.responseCount = responseCount;
	}
	@Override
	public String toString() {
		return "RresponseVO [dataValue=" + dataValue + ", status=" + status + ", responseCount=" + responseCount + "]";
	}
	
	
	
	

}
