package tutorial.abengalicoder.facade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HomeTheatreFacade facade = new HomeTheatreFacade();
        System.out.println("User to watch movie");
        facade.watchMovie();
        System.out.println("User to stop watch movie");
        facade.stopMovie();
    }
}
