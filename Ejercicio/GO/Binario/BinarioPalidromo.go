package main

import "fmt"

func main() {
	binario := "10101"
	invertido := ""

	for i := len(binario) - 1; i >= 0; i-- {
		invertido += string(binario[i])
	}

	if binario == invertido {
		fmt.Printf("El número binario %s es palíndromo.\n", binario)
	} else {
		fmt.Printf("El número binario %s no es palíndromo.\n", binario)
	}
}
