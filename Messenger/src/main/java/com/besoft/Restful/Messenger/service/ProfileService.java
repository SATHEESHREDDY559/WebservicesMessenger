package com.besoft.Restful.Messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.besoft.Restful.Messenger.database.MessageDatabase;
import com.besoft.Restful.Messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles=MessageDatabase.getProfiles();
public ProfileService() {
profiles.put("Bejjanki", new Profile(1L, "Satheesh", "Bejjanki", new Date()));
profiles.put("Thada", new Profile(2L, "Raju", "Thada", new Date()));
profiles.put("Kamsoni", new Profile(3L, "Sathwik", "Kamsoni", new Date()));
}
public List<Profile> getProfiles(){
	return new ArrayList<Profile>(profiles.values());
}
public Profile getProfile(String lname){
	return profiles.get(lname);
}
public Profile addProfile(Profile profile){
profile.setId(profiles.size()+1);
System.out.println("From Profile Services");
	return profiles.put(profile.getLname(),profile);
}
public Profile updateProfile(Profile profile){
	if(profile.getLname().isEmpty()){
		return null;
	}
	else
	return profiles.put(profile.getLname(),profile);
}

public Profile removeProfile(String lname){
	return profiles.remove(lname);
}

}
