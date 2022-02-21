package tutorial.abengalicoder.Builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	User user1 = new User.UserBuilder("Swarup", "Saha")
    			.age(30)
    			.phone("1234567")
    			.address("Fake address 1234")
    			.build();

    			System.out.println(user1);
    }
}
