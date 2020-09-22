package edu.escuelaing.arep.SparkDockerWebLive;
import static spark.Spark.*;
/**
 * Server http spark
 */
public class SparkWebServer {
	
	private static HttpClient client = new HttpClient();
	
    public static void main(String... args) {
    	
        port(getPort());
        staticFiles.location("/public");
        get("/hello", (req,res) -> "Hello Docker!");
        get("/descripciones", (req,res) -> {
        	System.out.println("BODY");
        	System.out.println(req.body());
        	String response = client.getMessages("/descripciones");
        	client.roundRobin();
        	return response;
        });
		post("/add", (req, res) -> {
			System.out.println("BODY");
        	System.out.println(req.body());
			String response = client.postMessage(req.body(), "/add");
			client.roundRobin();			
			return response;
		});
    }
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}