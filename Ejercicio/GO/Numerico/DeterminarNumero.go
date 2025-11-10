package main
import "fmt"

func main() {
    numero := 9
    if numero%2 == 0 {
        fmt.Println(numero, "es par")
    } else {
        fmt.Println(numero, "es impar")
    }
}
