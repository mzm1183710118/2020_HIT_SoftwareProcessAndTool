import java.util.HashSet;
import java.util.Set;

/**
 * created by meizhimin on 2020/12/29
 */
public class Person {
    private String name;
    //所有“朋友”构成的HashSet集合
    private Set<Person> friends=new HashSet<Person>();

    /**
     * Constructor with parameters
     * @param name the name field of the object to be constructed
     *
     * the default value of the flag field is false
     */
    public Person(String name) {
        this.name=name;
    }

    /**
     * the Getter method of name.
     */
    public String getName(){
        return name;
    }

    /**
     * the Getter method of friends.
     */
    public Set<Person> getFriends(){
        return friends;
    }

    /**
     * Add a friend to the current Person class object.
     *
     * @param  friend An object of the Person class,
     * which needed to be added to the friends Set of the current object.
     * @throws Exception the possible exception in the process
     */
    public void addFriend(Person friend) throws Exception{
        //不可以与自身成为“朋友”
        if (friend.getName().equals(this.getName())) {
            throw new Exception("can not make friends with yourself!");
        }
        //“朋友”不可以重复加入
        for(Person x:this.getFriends()) {
            if (x.getName().equals(friend.getName())) {
                throw new Exception("this friend already exists.");
            }
        }
        friends.add(friend);
    }

    @Override
    public  String toString(){
        String result;
        result = "Hello! my name is "+ this.getName()+".";
        return result;
    }
}
