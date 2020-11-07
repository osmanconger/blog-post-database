package ca.utoronto.utm.mcs;

import com.mongodb.client.MongoClient;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class Post implements HttpHandler {
    private MongoClient db;
//    Dagger service = DaggerDaggerComponent.create().buildMongoHttp();

    public Post(MongoClient database) {
        db = database;
    }

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        try {
            if (httpExchange.getRequestMethod().equals("PUT")) {
                handlePut(httpExchange);
            } else if (httpExchange.getRequestMethod().equals("GET")) {
                handleGet(httpExchange);
            } else if (httpExchange.getRequestMethod().equals("DELETE")) {
                handleDelete(httpExchange);
            } else {
                httpExchange.sendResponseHeaders(405, -1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            httpExchange.sendResponseHeaders(500, -1);
        }
    }

    public void handlePut(HttpExchange httpExchange) {
        
    }

    public void handleGet(HttpExchange httpExchange) {

    }

    public void handleDelete(HttpExchange httpExchange) {

    }
}
