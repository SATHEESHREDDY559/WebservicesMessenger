package com.besoft.Restful.Messenger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.besoft.Restful.Messenger.database.MessageDatabase;
import com.besoft.Restful.Messenger.model.Message;

public class MessageService {
	private Map<Long, Message> messages=MessageDatabase.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1L, "Hii",	 new Date(), "Satheesh"));
		messages.put(2L, new Message(2L, "Hello",new Date(), "Satheesh"));
	}
	public List<Message> getAllMessages(){		
		return new ArrayList<Message>(messages.values());			
	}
	
	public List<Message> getMessageByYear(int year){
		Calendar cal=Calendar.getInstance();
		List<Message> msglist=new ArrayList<Message>();
		for(Message msg:messages.values()){
			cal.setTime(msg.getDate());
			if(cal.get(Calendar.YEAR)==year){
				msglist.add(msg);
			}
		}
		return msglist;
	}
	public List<Message> getAllMsgPaginated(int start, int size){
	return new ArrayList<Message>(messages.values()).subList(start, start+size);
	
	}
	public Message getMessage(Long id){
		return messages.get(id);
	}
	public Message addMessage(Message msg){
		msg.setId(messages.size()+1);
		messages.put(msg.getId(), msg);
		return msg;
	}
	public Message updateMessage(Message msg){
		messages.put(msg.getId(), msg);
		return msg;
	}
	public Message removeMessage(Long id){
		return messages.remove(id);
	}
	
}
