package main

import "fmt"

type Persona struct {
	edad int
}

func main() {
	p := Persona{edad: 22}
	fmt.Println("Edad:", p.edad, "años")
}
