package ru.itvitality.csc.db.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MigrationStarter {
    public static void main( String[] args ) {
        SpringApplication.run( MigrationStarter.class, args );
    }
}
