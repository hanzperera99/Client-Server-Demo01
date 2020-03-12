public class SimpleTest
{
    public static void main(String[] args)
    {
        /*DummyServer dummyServer = new DummyServer() ;

        dummyServer.testConnection() ;
        System.out.println();

        dummyServer.testConnection(5) ;
        System.out.println();

        dummyServer.testConnection(5, "XXd54") ;
        System.out.println();

        dummyServer.testConnection(5, "DDFG56", "2020/01/29 16:53") ;*/

        execute(5, "CCFG69");

    }

    private static void execute(int id , String name)
    {
        DummyServer dummyServer = new DummyServer() ;
        dummyServer.testConnection(id , name ) ;
        //throw new UnsupportedOperationException("Not supported yet") ;
    }
}
