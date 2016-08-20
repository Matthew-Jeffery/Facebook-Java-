//Matthew Jeffery
//Friend App
// 03/08/2016

package pfriend;

import java.time.LocalDate;

public class Friend {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private LocalDate dateEntered;
	private char gender;
	private String homeTown;
	private String email;
	private String relationshipStatus;

	public Friend(String firstName, String lastName)
	{
		dateEntered = LocalDate.now();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Friend(String firstName, String lastName, int year, int month, int day)
	{
		this(firstName, lastName);
		birthDate = LocalDate.of(year, month, day);
	}
	
	public Friend(String firstName, String lastName, int year, int month, int day, 
			char gender, String homeTown, String email, String relationshipStatus)
	{
		this(firstName, lastName, year, month, day);
		this.gender = gender;
		this.homeTown = homeTown;
		this.email = email;
		this.relationshipStatus = relationshipStatus;
	}
	//Age calculator
	public int calculateAge()
	{
		int age = dateEntered.getYear() - birthDate.getYear();
		
		if(dateEntered.getMonthValue() < birthDate.getMonthValue())
		{
			age --;
		}
		else if(dateEntered.getMonthValue() == birthDate.getMonthValue())
		{
			if(dateEntered.getDayOfMonth() < birthDate.getDayOfMonth())
			{
				age --;
			}
		}
		return age;
	}
	
	//Append and return as string
	public String toString()
	{
		String genderAb = "";
		StringBuilder buff = new StringBuilder();

		if(gender != '\u0000')
		{
			switch(gender)
			{
			case 'f':
				genderAb = "Ms";
				break;
			case 'm':
				genderAb = "Mr";
				break;
			}
			buff.append(genderAb + ".");
		}
		buff.append(" " + firstName);
		buff.append(" " + lastName);
		
		if(birthDate != null)
		{
			buff.append(". Birthdate is " + birthDate);
		}
		
		if(homeTown != null)
		{
			buff.append(". " + homeTown);
		}
		
		if(email != null)
		{
			buff.append(". " + email);
		}
		
		if(relationshipStatus != null)
		{
			buff.append(". " + relationshipStatus);
		}
		
		
		return buff.toString();
	}
	
	public boolean isSame(Friend friend)
	{
	//v-- Proper way to compare data values without violating 'private' rights (private)
		if(friend.getFirstName().equals(firstName) && friend.getLastName().equals(lastName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Set methods
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setBirthDate(int year, int month, int day)
	{
		this.birthDate = LocalDate.of(year, month, day);
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public void setHomeTown(String homeTown)
	{
		this.homeTown = homeTown;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setRelationshipStatus(String relationshipStatus)
	{
		this.relationshipStatus = relationshipStatus;
	}
	
	//Get methods
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public LocalDate getBirthDate()
	{
		return birthDate;
	}
	public char getGender()
	{
		return gender;
	}
	public String getHomeTown()
	{
		return homeTown;
	}
	public String getEmail()
	{
		return email;
	}
	public String getRelationshipStatus()
	{
		return relationshipStatus;
	}
}
