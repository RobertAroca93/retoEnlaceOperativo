package co.com.demoblaze.utils;

import com.github.javafaker.Faker;

public class FakerDataGenerator {

    private static Faker faker = new Faker();
    public static final String ACTOR_NAME = "User";
    public static final String USERNAME_RANDOM = faker.name().fullName().toLowerCase();
    public static final String PASSWORD_RANDOM = faker.number().digits(6);
}