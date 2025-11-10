package main
import (
    "fmt"
    "time"
)

func mostrarFecha() {
    fmt.Println("La fecha de hoy es:", time.Now().Format("02/01/2006"))
}

func main() {
    mostrarFecha()
}
