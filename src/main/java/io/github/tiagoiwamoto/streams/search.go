package main

import (
	"fmt"
	"github.com/bxcodec/faker/v3"
)

type PojoName struct {
	Name     string `faker:"first_name"`
	LastName string `faker:"last_name"`
}

type PojoConvertedName struct {
	FullName string
}

func main() {
	var names []PojoName
	for i := 0; i < 5; i++ {
		var name PojoName
		_ = faker.FakeData(&name)
		names = append(names, name)
	}

	var convertedNames []PojoConvertedName
	for _, pojo := range names {
		convertedNames = append(convertedNames, PojoConvertedName{
			FullName: pojo.Name + " " + pojo.LastName,
		})
	}

	fmt.Println("nomes sem conversao:", names)
	fmt.Println("nomes convertidos:", convertedNames)
}
