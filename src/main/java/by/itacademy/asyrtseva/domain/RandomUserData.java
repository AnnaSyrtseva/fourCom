package by.itacademy.asyrtseva.domain;

import com.github.javafaker.Faker;

public class RandomUserData {
    public static String getRandomEmail(){
        Faker faker = new Faker();
        return faker.internet().emailAddress();
    }


}
