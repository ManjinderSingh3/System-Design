package Design_Patterns.Creational.i_Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        EagerSingleton eagerSingletonDBConnection1 = EagerSingleton.getDbinstance();
        EagerSingleton eagerSingletonDBConnection2 = EagerSingleton.getDbinstance();
        System.out.println(eagerSingletonDBConnection1.hashCode());
        System.out.println(eagerSingletonDBConnection2.hashCode());
    }
}
