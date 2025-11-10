package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	producto := map[string]interface{}{
		"id":     1,
		"nombre": "Portátil",
		"precio": 2500.5,
	}

	jsonTexto, _ := json.Marshal(producto)
	fmt.Println("Objeto como texto JSON:", string(jsonTexto))
}
