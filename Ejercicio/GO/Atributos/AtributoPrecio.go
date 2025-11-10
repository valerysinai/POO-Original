package main

import "fmt"

type Producto struct {
	precio float64
}

func main() {
	p := Producto{precio: 45.99}
	fmt.Println("Precio: $", p.precio)
}
