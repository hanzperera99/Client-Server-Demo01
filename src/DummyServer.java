import java.time.LocalDateTime;
import java.util.Date;

public class DummyServer
{

    public DummyServer()
    {}

    /*public String testConnection()
    {
        System.out.println("DummyServer....Connection being tested...");
        return "Connection Succeeded" ;
    }

    public String testConnection(int id)
    {
        System.out.println("12 . Id of the dummy server is : " + id);
        return "Connection Succeeded" ;
    }

    public String testConnection (int id , String name)
    {
        System.out.println("DummyServer....Connection being tested...");
        System.out.println("Server : " + name + " from client : " + id + " succeeded");
        return "Connection Succeeded" ;
    }*/

    public String testConnection (int id , String name)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DummyServer....Connection being tested...");
        System.out.println("date and Time : " + now + " Server : " + name + " from client : " + id + " succeeded");
        //System.out.println(now);
        return "Connection Succeeded" ;
    }
}
