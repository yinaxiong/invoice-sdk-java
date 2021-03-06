package com.paypal.svcs.types.pt;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * The request object for RemindInvoice. 
 */
public class RemindInvoiceRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * ID of the invoice to remind. 	  
	 *@Required	 
	 */ 
	private String invoiceID;

	/**
	 * Subject of the Reminder notification 	 
	 */ 
	private String subject;

	/**
	 * Note to send payer within the reminder notification 	 
	 */ 
	private String noteForPayer;

	

	/**
	 * Constructor with arguments
	 */
	public RemindInvoiceRequest (RequestEnvelope requestEnvelope, String invoiceID){
		this.requestEnvelope = requestEnvelope;
		this.invoiceID = invoiceID;
	}	

	/**
	 * Default Constructor
	 */
	public RemindInvoiceRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for invoiceID
	 */
	 public String getInvoiceID() {
	 	return invoiceID;
	 }
	 
	/**
	 * Setter for invoiceID
	 */
	 public void setInvoiceID(String invoiceID) {
	 	this.invoiceID = invoiceID;
	 }
	 
	/**
	 * Getter for subject
	 */
	 public String getSubject() {
	 	return subject;
	 }
	 
	/**
	 * Setter for subject
	 */
	 public void setSubject(String subject) {
	 	this.subject = subject;
	 }
	 
	/**
	 * Getter for noteForPayer
	 */
	 public String getNoteForPayer() {
	 	return noteForPayer;
	 }
	 
	/**
	 * Setter for noteForPayer
	 */
	 public void setNoteForPayer(String noteForPayer) {
	 	this.noteForPayer = noteForPayer;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.invoiceID != null) {
			sb.append(prefix).append("invoiceID=").append(NVPUtil.encodeUrl(this.invoiceID));
			sb.append("&");
		}
		if (this.subject != null) {
			sb.append(prefix).append("subject=").append(NVPUtil.encodeUrl(this.subject));
			sb.append("&");
		}
		if (this.noteForPayer != null) {
			sb.append(prefix).append("noteForPayer=").append(NVPUtil.encodeUrl(this.noteForPayer));
			sb.append("&");
		}
		return sb.toString();
	}

}