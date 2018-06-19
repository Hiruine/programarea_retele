import java.net.URL;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
=======
>>>>>>> dc7e28d9418e56e72b5ad5424f328fd05cca9e1d

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

}
