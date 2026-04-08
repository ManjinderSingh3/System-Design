package Design_Patterns.Creational.i_Singleton;

public class LazySingleton {
    // During initialization dbConnection = null
    private static LazySingleton dbConnection;

    private LazySingleton(){
    }

    public static LazySingleton getDbinstance(){
        /*
        Problem with Lazy Connection :
        T1 and T2 thread might come at same time and see dbConnection == null,

        So, both can enter the if condition and two objects will be created in memory
         */
        if(dbConnection==null){
            dbConnection = new LazySingleton();
        }
        return dbConnection;
    }
}
