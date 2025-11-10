package main

import (
	"fmt"
	"strconv"
)

func main() {
	numero := 25
	binario := strconv.FormatInt(int64(numero), 2)
	fmt.Printf("El número %d en binario es: %s\n", numero, binario)
}
