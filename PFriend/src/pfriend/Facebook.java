package pfriend;

import java.util.*;

public class Facebook {

	private ArrayList<Friend> friends = new ArrayList<Friend>();
	private String profile;
	
	public Facebook(String profile)
	{
		this.profile = profile;
	}
	
	public void addFriend(Friend friend)
	{
		friends.add(friend);
	}
	
	public int numberFriends()
	{
		return friends.size();
	}
	
	public String displayData() 
	{
		return friends.toString();
	}
	
	public String ageLess()
	{
		StringBuilder buff = new StringBuilder();
		for(Friend fwend : friends)
		{
			if (fwend.getBirthDate() != null)
			{
				if (fwend.calculateAge() < 21)
				{
					buff.append(fwend + ", ");
				}
			}
			
		}
		return buff.toString();
	}
	
	public int localMates()
	{
		int locals = 0;
		for(Friend fwend : friends)
		{
			if(fwend.getHomeTown().equals("Dunedin"))
			{
				locals++;
			}
		}
		return locals;
	}
}
