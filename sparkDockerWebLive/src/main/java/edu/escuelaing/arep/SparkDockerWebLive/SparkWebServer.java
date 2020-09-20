package edu.escuelaing.arep.SparkDockerWebLive;
import static spark.Spark.*;

import edu.escuelaing.arep.services.DataBase;
/**
 * Server http spark
 */
public class SparkWebServer {
	
    public static void main(String... args) {
    	DataBase db = new DataBase();
    	staticFiles.location("/public");
        port(getPort());
        get("/hello", (req,res) -> "Hello Docker!");
        get("/descripciones", (req,res) -> {
        	return db.getDescription();
        });
		post("/add", (request, response) -> {
			
			String req = request.body(); //String en formato json

			db.addPalabra(req);
			
			return "{\"confirm\":" + "ok" + "}";
			
		});
    }
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}