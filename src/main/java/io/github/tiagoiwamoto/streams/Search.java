package io.github.tiagoiwamoto.streams;

import com.github.javafaker.Faker;

import java.util.List;

public class Search {

    public static void main(String[] args) {

        Faker faker = new Faker();
        var names = List.of(
                PojoName.builder().name(faker.name().name()).lastName(faker.name().lastName()).build(),
                PojoName.builder().name(faker.name().name()).lastName(faker.name().lastName()).build(),
                PojoName.builder().name(faker.name().name()).lastName(faker.name().lastName()).build(),
                PojoName.builder().name(faker.name().name()).lastName(faker.name().lastName()).build(),
                PojoName.builder().name(faker.name().name()).lastName(faker.name().lastName()).build()
        );

        var convertedNames = names.stream()
                .map(pojo -> PojoConvertedName.builder().fullName(pojo.name().concat(" ").concat(pojo.lastName())))
                .toList();

        System.out.println("nomes sem conversao: " + names);
        System.out.println("nomes convertidos: " + convertedNames);
    }


}
