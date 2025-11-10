package main

import (
	"fmt"
	"strconv"
)

func main() {
	binario := "11001"
	decimal, _ := strconv.ParseInt(binario, 2, 64)
	fmt.Printf("El binario %s en decimal es: %d\n", binario, decimal)
}
