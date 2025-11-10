package main

import (
	"encoding/json"
	"fmt"
)

type Persona struct {
	Nombre    string `json:"nombre"`
	Edad      int    `json:"edad"`
	Profesion string `json:"profesion"`
}

func main() {
	texto := `{"nombre":"Carlos","edad":30,"profesion":"Ingeniero"}`
	var p Persona
	json.Unmarshal([]byte(texto), &p)
	fmt.Printf("Nombre: %s, Edad: %d\n", p.Nombre, p.Edad)
}
