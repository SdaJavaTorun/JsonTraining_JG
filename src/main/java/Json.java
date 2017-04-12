import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENT on 2017-04-12.
 */
public class Json {

    private int ID;
    private String author;
    Date post_date;
    private String post_content;
    private String post_modified;
    private String post_status;

    @Override
    public String toString() {
        return "Json{" +
                "ID=" + ID +
                ", author='" + author + '\'' +
                ", post_date=" + post_date +
                ", post_modified='" + post_modified + '\'' +
                ", post_status='" + post_status + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-DD");
        this.post_date = df.parse(post_date);
    }

    public String getPost_content() {
        return post_content;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public String getPost_modified() {
        return post_modified;
    }

    public void setPost_modified(String post_modified) {
        this.post_modified = post_modified;
    }

    public String getPost_status() {
        return post_status;
    }

    public void setPost_status(String post_status) {
        this.post_status = post_status;
    }

}
