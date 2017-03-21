package com.besoft.Restful.Messenger.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.besoft.Restful.Messenger.model.Message;
import com.besoft.Restful.Messenger.resources.beans.BeanFilter;
import com.besoft.Restful.Messenger.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {
	MessageService service=new MessageService();
	@GET	
public List<Message> getMessages(@BeanParam BeanFilter bfilter){	
		if(bfilter.getYear()>0){
			return service.getMessageByYear(bfilter.getYear());
		}
		else if(bfilter.getStart()>=0&&bfilter.getSize()>=1){
				return service.getAllMsgPaginated(bfilter.getStart(), bfilter.getSize());
		}		
		return service.getAllMessages();
}
	@GET
	@Path("/{messageid}")
	public Message getMessage(@PathParam("messageid") long msgid){
		return service.getMessage(msgid);
	}

	@POST	
	public Message addMessageMessage (Message msg){		
		
		return service.addMessage(msg);	
		
	}
	@PUT	
	@Path("/{messageid}")
	public Message addMessage(@PathParam("messageid") long id,Message msg){		
		msg.setId(id);
		System.out.println("hiii");
		return service.updateMessage(msg);	
		
	}
	
	@DELETE	
	@Path("/{messageid}")
	public Message delMessage(@PathParam("messageid") long msgid){
		return service.removeMessage(msgid);
	}
	@GET 
	@Path("/{messageid}/comments")
	public CommentResources test(){
		System.out.println("test test");
	return	new CommentResources(); 
		
	}
	
}
