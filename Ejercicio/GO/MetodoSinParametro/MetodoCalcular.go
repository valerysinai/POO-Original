package main
import "fmt"

func mostrarColores() {
    colores := []string{"Rojo", "Verde", "Azul"}
    for _, color := range colores {
        fmt.Println(color)
    }
}

func main() {
    mostrarColores()
}
