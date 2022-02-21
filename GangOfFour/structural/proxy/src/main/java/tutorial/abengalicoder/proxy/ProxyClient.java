package tutorial.abengalicoder.proxy;

public class ProxyClient 
{
    public static void main( String[] args )
    {
    	Internet internet = new ProxyInternet();
        try
        {
            internet.connectTo("abengalicoder.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
