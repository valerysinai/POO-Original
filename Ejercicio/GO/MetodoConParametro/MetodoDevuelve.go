package main
import "fmt"

func multiplicar(x int, y int) int {
    return x * y
}

func main() {
    resultado := multiplicar(4, 6)
    fmt.Println("Resultado:", resultado)
}
