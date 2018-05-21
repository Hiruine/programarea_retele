

public class mainClass {
    public static void main(String[] args) throws Exception{

        /*Creates a list HashMap de categoriii
        * when requested places each category in an order*/

        URL url = new URL("https://evil-legacy-service.herokuapp.com/" +
                "api/v101/orders/");

        URLConnectionReader link = new URLConnectionReader(url, "2003-05-11");
        link.processInputURL();

        //System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

    }
    Collection
}
