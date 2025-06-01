from faker import Faker

faker = Faker()
names = [
    {"name": faker.first_name(), "last_name": faker.last_name()},
    {"name": faker.first_name(), "last_name": faker.last_name()},
    {"name": faker.first_name(), "last_name": faker.last_name()},
    {"name": faker.first_name(), "last_name": faker.last_name()},
    {"name": faker.first_name(), "last_name": faker.last_name()},
]

converted_names = [{"full_name": f"{name['name']} {name['last_name']}"} for name in names]

print("nomes sem conversao:", names)
print("nomes convertidos:", converted_names)