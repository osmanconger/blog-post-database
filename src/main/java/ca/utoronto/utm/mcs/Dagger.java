package ca.utoronto.utm.mcs;

import javax.inject.Inject;

import com.mongodb.client.MongoClient;
import com.sun.net.httpserver.HttpServer;

public class Dagger {

	private HttpServer server;
	private MongoClient db;
	private int PORT;

	@Inject
	public Dagger(HttpServer server, MongoClient db, int PORT) {
		this.server = server;
		this.db = db;
		this.PORT = PORT;
	}

	public int getPort() {
		return this.PORT;
	}

	public void  setPORT(int PORT) {
		this.PORT = PORT;
	}

	public HttpServer getServer() {
		return this.server;
	}

	public void setServer(HttpServer server) {
		this.server = server;
	}

	public MongoClient getDb() {
		return this.db;
	}

	public void setDb(MongoClient db) {
		this.db = db;
	}

}
