package main

import "fmt"

type Persona struct {
	nombre string
}

func main() {
	p := Persona{nombre: "Valery"}
	fmt.Println("Nombre:", p.nombre)
}
