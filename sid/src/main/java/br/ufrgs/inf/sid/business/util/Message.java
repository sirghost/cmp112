package br.ufrgs.inf.sid.business.util;

public class Message {

private String message;
	
	private MessageType type;
	private Object data;
	
	public Message() {}

	public Message(String message, MessageType type, Object data) {
		this.message = message;
		this.type = type;
		this.data = data;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}