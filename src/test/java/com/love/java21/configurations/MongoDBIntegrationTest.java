package com.love.java21.configurations;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestPropertySource(properties = {
        "spring.data.mongodb.uri=mongodb://localhost:27017/testdb",
        "spring.data.mongodb.database=javaLover21"
})
public class MongoDBIntegrationTest {
    @Autowired
    private MongoClient mongoClient = MongoClients.create();

    @Test
    public void contextLoads() {
        assertNotNull(mongoClient);
    }

    @Test
    public void getDatabaseName() {
        assertEquals("javaLover21", mongoClient.getDatabase("javaLover21").getName());
    }

}
