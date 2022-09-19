package com.zoop.esign.models;

import java.util.Date;

public class ZoopResponse {

	  public String request_id;
	    public boolean success;
	    public String webhook_security_key;
	    public Date request_timestamp;
	    public Date expires_at;
		public String getRequest_id() {
			return request_id;
		}
		public void setRequest_id(String request_id) {
			this.request_id = request_id;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getWebhook_security_key() {
			return webhook_security_key;
		}
		public void setWebhook_security_key(String webhook_security_key) {
			this.webhook_security_key = webhook_security_key;
		}
		public Date getRequest_timestamp() {
			return request_timestamp;
		}
		public void setRequest_timestamp(Date request_timestamp) {
			this.request_timestamp = request_timestamp;
		}
		public Date getExpires_at() {
			return expires_at;
		}
		public void setExpires_at(Date expires_at) {
			this.expires_at = expires_at;
		}
	    
	    
}
