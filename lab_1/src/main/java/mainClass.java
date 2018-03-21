import java.net.URL;

public class mainClass {
    public static void main(String[] args) throws Exception{

        /*Creates a list HashMap de categoriii
        * when requested places each category in an order*/

        URL url = new URL("https://evil-legacy-service.herokuapp.com" +
                "/api/v101/categories/");

        URLConnectionReader.processInputURL(url);

    }
}
