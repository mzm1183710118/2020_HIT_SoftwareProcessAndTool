import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * created by meizhimin on 2020/12/29
 */
public class PersonTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void addFriendTest1() throws Exception{
        Person me1 = new Person("mzm");
        Person me2 = new Person("");
        Person friend1 = new Person("mzm");
        Person friend2 = new Person("meizhimin");
        Person friend3 = new Person("");
        // test case1
        expectedEx.expectMessage("can not make friends with yourself!");
        me1.addFriend(friend1);
        //test case2
        me1.addFriend(friend2);
        assertEquals(1,me1.getFriends().size());
        // test case3
        expectedEx.expectMessage("can not make friends with yourself!");
        me2.addFriend(friend3);
        // test case4
        me2.addFriend(friend1);
        assertEquals(1,me2.getFriends().size());
    }

    @Test
    public void addFriendTest2() throws Exception{
        Person me1 = new Person("hello");
        Person friend1 = new Person("mzm");
        Person friend2 = new Person("meizhimin");
        // test case1
        assertEquals(0,me1.getFriends().size());
        me1.addFriend(friend1);
        assertEquals(1, me1.getFriends().size());
        //test case2
        expectedEx.expectMessage("this friend already exists.");
        me1.addFriend(friend1);
        // test case3
        assertEquals(1, me1.getFriends().size());
        me1.addFriend(friend2);
        assertEquals(2, me1.getFriends().size());
        // test case4
        expectedEx.expectMessage("this friend already exists.");
        me1.addFriend(friend2);
    }

    @Test
    public void testToStringTest() {
        Person p1 = new Person("");
        String name1 = p1.toString();
        assertEquals("Hello! my name is .",name1);
        Person p2 = new Person("meizhimin");
        String name2 = p2.toString();
        assertEquals("Hello! my name is meizhimin.",name2);
        Person p3 = new Person(" ");
        String name3 = p3.toString();
        assertEquals("Hello! my name is  .",name3);
    }
}