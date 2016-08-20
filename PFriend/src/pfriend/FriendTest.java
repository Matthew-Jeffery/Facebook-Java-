package pfriend;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FriendTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAge() {
		//Test with date that hasn't been yet
		Friend me = new Friend("Matthew", "Jeffery", 1996, 9, 10, 'm', "Dunedin", "matthewjeffery07@gmail.com", "in a relationship");
		assertEquals(19, me.calculateAge(), 0.001);
		Friend friend2 = new Friend("Jill", "Smith", 1992, 8, 03, 'f', "Christchurch", "jillsmith08@gmail.com", "single");
		assertEquals(24, friend2.calculateAge());
		Friend friend3 = new Friend("Bob", "Johnstone", 1989, 02, 26, 'm', "Auckaland", "bobjohn09@gmail.com", "In a relationship");
		assertEquals(27, friend3.calculateAge());
		Friend friend1 = new Friend("Matthew", "Jeffery", 1996, 8, 29, 'm', "Dunedin", "matthewjeffery07@gmail.com", "in a relationship");
		assertEquals(19, friend1.calculateAge(), 0.001);
	}
	
	@Test
	public void testIsSame(){
		Friend me = new Friend("Matthew", "Jeffery", 1996, 9, 10, 'm', "Dunedin", "matthewjeffery07@gmail.com", "In a relationship");
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "single");
		assertEquals(false, friend.isSame(me));
		assertEquals(true, friend.isSame(friend));
	}
	
	@Test
	public void testToString() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		assertEquals("Ms. Jill Smith. Birthdate is 1992-07-22. Christchurch. jillsmith08@gmail.com. Single", friend.toString());
		Friend friend2 = new Friend("Bob", "Johnstone", 1889, 02, 26, 'm', "Auckaland", "bobjohn09@gmail.com", "In a relationship");
		assertEquals("Mr. Bob Johnstone. Birthdate is 1889-02-26. Auckaland. bobjohn09@gmail.com. In a relationship", friend2.toString());
	}
	
	@Test
	public void testGetFN() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		friend.setFirstName("Jill");
		assertEquals("Jill", friend.getFirstName());
	}
	@Test
	public void testGetLN() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		friend.setLastName("Smith");
		assertEquals("Smith", friend.getLastName());
	}
	@Test
	public void testGetBD() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		friend.setBirthDate(1992, 07, 22);
		assertEquals("1992-07-22", friend.getBirthDate().toString());
	}
	
	@Test
	public void testGetGender() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		friend.setGender('f');
		assertEquals('f', friend.getGender());
	}
	
	@Test
	public void testGetHomeTown() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Christchurch", "jillsmith08@gmail.com", "Single");
		friend.setHomeTown("Christchurch");
		assertEquals("Christchurch", friend.getHomeTown());
	}
	
	@Test
	public void testGetEmail() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		friend.setEmail("jillsmith08@gmail.com");
		assertEquals("jillsmith08@gmail.com", friend.getEmail());
	}
	
	@Test
	public void testGetRelationshipStatus() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		friend.setRelationshipStatus("Single");
		assertEquals("Single", friend.getRelationshipStatus());
	}
	
	@Test
	public void testAddFriend() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		Facebook fb = new Facebook("Jill Smiths Facebook Profile");
		fb.addFriend(friend);
		assertEquals(1, fb.numberFriends(), 0.001);
	}
	
	@Test
	public void testFriendData() {
		Friend friend = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		Facebook fb = new Facebook("Jill Smiths Facebook Profile");
		fb.addFriend(friend);
		assertEquals("[Ms. Jill Smith. Birthdate is 1992-07-22. Chirstchurch. jillsmith08@gmail.com. Single]", fb.displayData());
	}
	
	@Test
	public void testAgeLess() {
		Friend friend = new Friend("Jill", "Smith", 1997, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		Friend friend1 = new Friend("Bob", "Johnstone");
		Friend friend2 = new Friend("Matthew", "Jeffery", 1996, 07, 22);

		Facebook fb = new Facebook("Jill Smiths Facebook Profile");
		fb.addFriend(friend);
		fb.addFriend(friend1);
		fb.addFriend(friend2);
		assertEquals("Ms. Jill Smith. Birthdate is 1997-07-22. Chirstchurch. jillsmith08@gmail.com. Single,  Matthew Jeffery. Birthdate is 1996-07-22, ", fb.ageLess());
	}
	
	@Test
	public void testLocalMates() {
		Friend friend = new Friend("Jill", "Smith", 1997, 07, 22, 'f', "Dunedin", "jillsmith08@gmail.com", "Single");
		Facebook fb = new Facebook("Jill Smiths Facebook Profile");
		fb.addFriend(friend);
		assertEquals(1, fb.localMates(), 0.001);
	}
}
