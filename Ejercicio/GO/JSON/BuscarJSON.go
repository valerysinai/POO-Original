package main

import "fmt"

func main() {
	usuarios := []map[string]interface{}{
		{"id": 1, "usuario": "valery", "activo": true},
		{"id": 2, "usuario": "andres", "activo": false},
		{"id": 3, "usuario": "maria", "activo": true},
	}

	for _, u := range usuarios {
		if u["activo"] == true {
			fmt.Println("Primer usuario activo:", u["usuario"])
			break
		}
	}
}
