package Design_Patterns.Creational.i_Singleton;

public class DoubleLocking {
    private static DoubleLocking dbInstance;
    private DoubleLocking(){}

    public static DoubleLocking getDbInstance(){
        if(dbInstance==null){
            synchronized (DoubleLocking.class){
                if(dbInstance==null){
                    dbInstance = new DoubleLocking();
                }
            }
        }
        return dbInstance;
    }
}
