package pfriend;

public class FriendApp {
	public static void main(String[] args) {
		Friend friend1 = new Friend("Matthew", "Jeffery", 1996, 07, 22, 'm', "Dunedin", "matthewjeffery07@gmail.com", "In a relationship");
		Friend friend2 = new Friend("Jill", "Smith", 1992, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		Friend friend3 = new Friend("Bob", "Johnstone", 1889, 02, 26, 'm', "Auckaland", "bobjohn09@gmail.com", "In a relationship");
		//System.out.println(friend1.toString());
	//	System.out.println(friend2.toString());
		//System.out.println(friend3.toString());
		
		Friend friend = new Friend("Jill", "Smith", 1997, 07, 22, 'f', "Chirstchurch", "jillsmith08@gmail.com", "Single");
		Friend friend4 = new Friend("Bob", "Johnstone");
		Friend friend5 = new Friend("Matthew", "Jeffery", 1996, 07, 22);

		Facebook fb = new Facebook("Jill Smiths Facebook Profile");
		fb.addFriend(friend);
		fb.addFriend(friend4);
		fb.addFriend(friend5);
		System.out.println(fb.ageLess());
	}
}
