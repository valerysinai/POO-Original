package main

import (
	"fmt"
	"strconv"
)

func main() {
	b1 := "1010"
	b2 := "110"

	n1, _ := strconv.ParseInt(b1, 2, 64)
	n2, _ := strconv.ParseInt(b2, 2, 64)

	suma := n1 + n2
	resultado := strconv.FormatInt(suma, 2)

	fmt.Printf("Suma de %s + %s = %s\n", b1, b2, resultado)
}
