package main
import "fmt"

func areaRectangulo(base float64, altura float64) float64 {
    return base * altura
}

func main() {
    area := areaRectangulo(5.5, 3.2)
    fmt.Println("Área del rectángulo:", area)
}
