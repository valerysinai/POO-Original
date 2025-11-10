let binPal = "10101";
let invertido = binPal.split("").reverse().join("");

if (binPal === invertido) {
  console.log(`El número binario ${binPal} es palíndromo.`);
} else {
  console.log(`El número binario ${binPal} no es palíndromo.`);
}
