package Design_Patterns.Creational.i_Singleton;

// This way/method of creating 1 object, overcomes the problem of Lazy Initialization
public class SynchronizedSingleton {
    private static SynchronizedSingleton dbInstance;

    private SynchronizedSingleton(){
    }

    // Synchronized block helps T1 thread to acquire lock
    synchronized public static SynchronizedSingleton getInstance(){
        if(dbInstance== null){
            dbInstance = new SynchronizedSingleton();
        }
        return  dbInstance;
    }

    /*
    Problem with Synchronized block:
     - It is very expensive CPU operation to put lock. Every time a request comes in,
       it has to apply a lock.
     */
}
