package Design_Patterns.Creational.i_Singleton;

public class LazyInitialization {
    // During initialization dbConnection = null
    private static LazyInitialization dbInstance;

    private LazyInitialization(){
    }

    public static LazyInitialization getDbInstance(){
        /*
        Problem with Lazy Connection :
        T1 and T2 thread might come at same time and see dbConnection == null,

        So, both can enter the if condition and two objects will be created in memory
         */
        if(dbInstance==null){
            dbInstance = new LazyInitialization();
        }
        return dbInstance;
    }
}
