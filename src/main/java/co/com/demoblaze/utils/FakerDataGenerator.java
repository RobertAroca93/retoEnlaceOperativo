package co.com.demoblaze.utils;

import com.github.javafaker.Faker;

public class FakerDataGenerator {

    private static Faker faker = new Faker();
    public static final String ACTOR_NAME = "User";

    public static final String USERNAME_RANDOM = faker.name().fullName().toLowerCase();
    public static final String PASSWORD_RANDOM = faker.number().digits(6);

    public static final String USERNAME_LOGIN = USERNAME_RANDOM;
    public static final String PASSWORD_LOGIN = PASSWORD_RANDOM;

    public static final double TOTAL_ESPERADO = 2010.0;


}
