package com.love.java21.configurations;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {
    private static MongoClient mongoClient;

    @Getter
    @Value("${spring.data.mongodb.uri}")
    private String url;

    @Value("${spring.data.mongodb.database}")
    String databaseName;

    @Override
    public MongoClient mongoClient() {
        if (mongoClient == null) {
            ConnectionString connectionString = new ConnectionString(url);
            mongoClient = MongoClients.create(connectionString);
        }
        return mongoClient;
    }

    @Override
    protected String getDatabaseName() {
        return databaseName;
    }


}
