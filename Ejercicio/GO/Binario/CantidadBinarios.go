package main

import "fmt"

func main() {
	binario := "10101101"
	contador := 0

	for _, c := range binario {
		if c == '1' {
			contador++
		}
	}

	fmt.Printf("El número de unos en %s es: %d\n", binario, contador)
}
