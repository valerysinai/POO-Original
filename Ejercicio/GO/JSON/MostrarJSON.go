package main

import (
	"encoding/json"
	"fmt"
)

func main() {
	persona := map[string]interface{}{
		"nombre": "Valery",
		"edad":   22,
		"ciudad": "Bogotá",
	}

	jsonData, _ := json.Marshal(persona)
	fmt.Println(string(jsonData))
}
