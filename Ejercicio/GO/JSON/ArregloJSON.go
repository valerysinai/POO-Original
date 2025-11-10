package main

import (
	"fmt"
)

func main() {
	estudiantes := []map[string]interface{}{
		{"nombre": "Ana", "nota": 4.5},
		{"nombre": "Luis", "nota": 3.8},
		{"nombre": "Valery", "nota": 5.0},
	}

	for _, e := range estudiantes {
		fmt.Printf("%s tiene una nota de %.1f\n", e["nombre"], e["nota"])
	}
}
