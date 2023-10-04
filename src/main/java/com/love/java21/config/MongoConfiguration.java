package com.love.java21.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

@Configuration
public class MongoConfiguration extends AbstractMongoClientConfiguration {
    @Value("${spring.data.mongodb.uri}")
    private String url;
    String databaseName = "javaLover21";

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString(url);
        return MongoClients.create(connectionString);
    }

    @Override
    protected String getDatabaseName() {
        return databaseName;
    }
}
