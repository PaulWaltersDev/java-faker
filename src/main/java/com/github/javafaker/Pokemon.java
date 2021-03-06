package com.github.javafaker;

public class Pokemon {

    private final Faker faker;

    Pokemon(Faker faker) {
        this.faker = faker;
    }

    public String name() {
        return faker.resolve("pokemon.names");
    }

    public String location() {
        return faker.resolve("pokemon.locations");
    }
}
