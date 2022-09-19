package com.zoop.esign.models;

public class ZoopRequest {

    public Document document;
    public String signer_name;
    public String signer_email;
    public String signer_city;
    public String purpose;
    public String response_url;
    public String redirect_url;
    public EmailTemplate email_template;
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getSigner_name() {
		return signer_name;
	}
	public void setSigner_name(String signer_name) {
		this.signer_name = signer_name;
	}
	public String getSigner_email() {
		return signer_email;
	}
	public void setSigner_email(String signer_email) {
		this.signer_email = signer_email;
	}
	public String getSigner_city() {
		return signer_city;
	}
	public void setSigner_city(String signer_city) {
		this.signer_city = signer_city;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getResponse_url() {
		return response_url;
	}
	public void setResponse_url(String response_url) {
		this.response_url = response_url;
	}
	public String getRedirect_url() {
		return redirect_url;
	}
	public void setRedirect_url(String redirect_url) {
		this.redirect_url = redirect_url;
	}
	public EmailTemplate getEmail_template() {
		return email_template;
	}
	public void setEmail_template(EmailTemplate email_template) {
		this.email_template = email_template;
	}

    
}
