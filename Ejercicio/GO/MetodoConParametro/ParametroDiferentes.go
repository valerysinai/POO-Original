package main
import "fmt"

func mostrarInfo(nombre string, edad int, altura float64) {
    fmt.Printf("%s tiene %d años y mide %.2f metros.\n", nombre, edad, altura)
}

func main() {
    mostrarInfo("Valery", 22, 1.68)
}
