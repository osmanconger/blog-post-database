package ca.utoronto.utm.mcs;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import dagger.Module;
import dagger.Provides;
import org.bson.Document;

@Module
public class PostModule {

    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> collection;
	static String databaseName = "csc301a2";
	static String collectionName = "posts";

	@Provides public MongoDatabase provideMongoDatabase(MongoClient client) {
        mongoDatabase = client.getDatabase(databaseName);
        return mongoDatabase;
    }

    @Provides public MongoCollection provideMongoCollection(MongoDatabase mongoDatabase) {
        collection = mongoDatabase.getCollection(collectionName);
        return collection;
    }

}
