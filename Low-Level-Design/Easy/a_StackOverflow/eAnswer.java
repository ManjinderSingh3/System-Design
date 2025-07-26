package Easy.a_StackOverflow;
import java.util.UUID;

public class eAnswer {
    private final String id;
    private final eUser author;
    private final eQuestion question;

    public eAnswer(eUser author, eQuestion question){
        this.id = UUID.randomUUID().toString();
        this.author = author;
        this.question = question;

    }
}
