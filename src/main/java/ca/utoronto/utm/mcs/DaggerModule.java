package ca.utoronto.utm.mcs;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import dagger.Module;
import dagger.Provides;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Module
public class DaggerModule {

	private static HttpServer server;
	private static MongoClient db;
	static int PORT;

    @Provides public MongoClient provideMongoClient() {
        db = MongoClients.create("mongodb://localhost:27017");
        return db;
    }

    @Provides public HttpServer provideHttpServer() {
        PORT = 8120;
        try {
            server = HttpServer.create(new InetSocketAddress("0.0.0.0", PORT), 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return server;
    }
}
