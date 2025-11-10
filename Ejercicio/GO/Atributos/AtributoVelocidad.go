package main

import "fmt"

type Auto struct {
	velocidadMaxima int
}

func main() {
	a := Auto{velocidadMaxima: 180}
	fmt.Println("Velocidad Máxima:", a.velocidadMaxima, "km/h")
}
