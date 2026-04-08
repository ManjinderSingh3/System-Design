package Design_Patterns.Creational.i_Singleton;
/*
- Singleton Pattern is used when we have to create only 1 instance of the class.
- 4 ways to achieve this pattern/or creation of 1 object:
  1) Eager
  2) Lazy Initialization
  3) Synchronized Method
  4) Double Locking - Generally used in Industry
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        /* Note: Print statements are written twice just to double check that only a single instance/object is created
                 in memory
        */

        // 1- Eager
        Eager eagerDBConnection1 = Eager.getDbInstance();
        Eager eagerDBConnection2 = Eager.getDbInstance();
        System.out.println(eagerDBConnection1.hashCode());
        System.out.println(eagerDBConnection2.hashCode());

        // 2- Lazy Initialization
        LazyInitialization lazyInitializationDBConnection1 = LazyInitialization.getDbInstance();
        LazyInitialization lazyInitializationDBConnection2 = LazyInitialization.getDbInstance();
        System.out.println(lazyInitializationDBConnection1.hashCode());
        System.out.println(lazyInitializationDBConnection2.hashCode());

        //3- Synchronized
        Synchronized synchronizedDBCConnection1 = Synchronized.getDbInstance();
        Synchronized synchronizedDBCConnection2 = Synchronized.getDbInstance();
        System.out.println(synchronizedDBCConnection1.hashCode());
        System.out.println(synchronizedDBCConnection2.hashCode());

        //4- Double Locking
        DoubleLocking doubleLockingDBConnection1 = DoubleLocking.getDbInstance();
        DoubleLocking doubleLockingDBConnection2 = DoubleLocking.getDbInstance();
        System.out.println(doubleLockingDBConnection1.hashCode());
        System.out.println(doubleLockingDBConnection2.hashCode());
    }
}
