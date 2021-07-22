package com.ptpmpt.dsd15.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Chat")
public class Chat {
	
	@Id
	public ObjectId _id;
	private String Chat_Name;
	private String Chat_Des;
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getChat_Name() {
		return Chat_Name;
	}
	public void setChat_Name(String chat_Name) {
		Chat_Name = chat_Name;
	}
	public String getChat_Des() {
		return Chat_Des;
	}
	public void setChat_Des(String chat_Des) {
		Chat_Des = chat_Des;
	}


}
