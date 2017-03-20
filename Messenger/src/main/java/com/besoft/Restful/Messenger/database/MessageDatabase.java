package com.besoft.Restful.Messenger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.besoft.Restful.Messenger.model.Message;
import com.besoft.Restful.Messenger.model.Profile;

public class MessageDatabase {
	private static Map<Long,Message> messages=new HashMap<Long, Message>();
	private static Map<String, Profile> profiles=new HashMap<String, Profile>();
	
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
		
	
}
