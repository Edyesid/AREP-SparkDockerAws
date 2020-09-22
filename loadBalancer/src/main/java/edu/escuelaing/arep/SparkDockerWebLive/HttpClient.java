package edu.escuelaing.arep.SparkDockerWebLive;

import okhttp3.*;

import java.io.IOException;

public class HttpClient {

    private OkHttpClient httpClient;
    private String baseUrl="http://172.17.0.1/";
    private String[] ports={":40001",":40002",":40003"};
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private int serverNumber=0;



    public HttpClient() {
        httpClient=new OkHttpClient();
    }


    public String getMessages(String path) throws IOException {
        Request request = request = new Request.Builder()
                .url(baseUrl+ports[serverNumber]+path)
                .get()
                .build();
        System.out.println("sendig request to"+baseUrl+ports[serverNumber]+path);
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

    public String postMessage( String message,String path) throws IOException {
        RequestBody body = RequestBody.create(message,JSON);
        Request request = new Request.Builder()
                .url(baseUrl+ports[serverNumber]+path)
                .post(body)
                .build();
        System.out.println("sendig request to"+baseUrl+ports[serverNumber]+path);
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }
    
    public void roundRobin(){
        this.serverNumber=(this.serverNumber+1)% ports.length;
    }
}