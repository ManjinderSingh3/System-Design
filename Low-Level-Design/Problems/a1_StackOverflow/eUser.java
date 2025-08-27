package Problems.a1_StackOverflow;
import java.util.UUID;

public class eUser {
    private final String userId;
    private final String userName;
    private final String email;
    private int reputation;

    public eUser(String userName, String email){
        this.userId = UUID.randomUUID().toString();
        this.userName = userName;
        this.email = email;
        this.reputation = 0;
    }

    //Getters
    public String getUserId(){
        return userId;
    }
    public String getUserName(){
        return userName;
    }
    public int getReputation(){
        return reputation;
    }

}
