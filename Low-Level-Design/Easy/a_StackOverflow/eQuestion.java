package Easy.a_StackOverflow;
import java.util.UUID;
import java.util.Date;

public class eQuestion {
    private final String id;
    private final eUser author;
    private final String questionTitle;
    private final String questionDescription;
    private final Date questionPostingDate;


    public eQuestion(eUser author, String questionTitle, String questionDescription){
        this.id = UUID.randomUUID().toString();
        this.author = author;
        this.questionTitle = questionTitle;
        this.questionDescription = questionDescription;
        this.questionPostingDate = new Date();
    }
}
