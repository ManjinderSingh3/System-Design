package Design_Patterns.Creational.i_Singleton;
/*
- Singleton Pattern is used when we have to create only 1 instance of the class.
- 4 ways to achieve this pattern/or creation of 1 object:
  1) Eager
  2) Lazy Initialization
  3) Synchronized Method
  4) Double Locking
 */
public class SingletonDemo {

    public static void main(String[] args) {
        EagerSingleton eagerSingletonDBConnection1 = EagerSingleton.getDbinstance();
        EagerSingleton eagerSingletonDBConnection2 = EagerSingleton.getDbinstance();
        System.out.println(eagerSingletonDBConnection1.hashCode());
        System.out.println(eagerSingletonDBConnection2.hashCode());

        // 2- Lazy Initialization
        LazySingleton lazySingletonDBConnection1 = LazySingleton.getDbinstance();
        LazySingleton lazySingletonDBConnection2 = LazySingleton.getDbinstance();
        System.out.println(lazySingletonDBConnection1.hashCode());
        System.out.println(lazySingletonDBConnection2.hashCode());
    }
}
