import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws java.text.ParseException {

        JSONParser parser = new JSONParser();
        List<Json> lista = new ArrayList<Json>();

        try {
            URL url = new URL("http://lukaszogan.com/data.json");
            URLConnection connect = url.openConnection();

            BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));

            String line;
            while ((line = in.readLine()) != null){
                JSONArray array = (JSONArray) parser.parse(line);  //prasuje do talibcy objektow

                for (Object obj : array){
                    JSONObject json = (JSONObject) obj;
                    Json nowyJason = new Json();
                    nowyJason.setID(Integer.parseInt(json.get("ID").toString()));
                    nowyJason.setAuthor(json.get("post_author").toString());

                    String [] data = json.get("post_date").toString().split(" ");
                    nowyJason.setPost_date(data[0]);

                    nowyJason.setPost_content(json.get("post_content").toString());
                    nowyJason.setPost_modified(json.get("post_modified").toString());
                    nowyJason.setPost_status(json.get("post_status").toString());
                    lista.add(nowyJason);
                    System.out.println(nowyJason);

                }
            }
        }
        catch (ParseException | IOException err){

        }


    }
}
