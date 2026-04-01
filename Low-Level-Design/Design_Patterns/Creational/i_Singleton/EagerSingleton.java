package Design_Patterns.Creational.i_Singleton;

public class EagerSingleton {
    // This creates the object as soon as JVM loads the class
    private static final EagerSingleton dbinstance = new EagerSingleton();
    private String dbConnectionString;

    /*
    - Restricting creation of object by creating private Constructor
    - Outside of this class no one will be able to call the constructor
    */
    private EagerSingleton(){
        dbConnectionString = "jdbc:mysql://localhost:3306/users_db";
    }

    public static EagerSingleton getDbinstance(){
        return dbinstance;
    }
}
