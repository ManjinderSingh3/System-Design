package Design_Patterns.Creational.i_Singleton;

public class Eager {
    // This creates the object as soon as JVM loads the class
    private static final Eager dbInstance = new Eager();
    private String dbConnectionString;

    /*
    - Restricting creation of object by creating private Constructor
    - Outside of this class no one will be able to call the constructor
    */
    private Eager(){
        dbConnectionString = "jdbc:mysql://localhost:3306/users_db";
    }

    public static Eager getDbInstance(){
        return dbInstance;
    }
}
