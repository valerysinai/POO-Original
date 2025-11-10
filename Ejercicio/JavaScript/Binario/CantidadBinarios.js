let bin = "10101101";
let contador = 0;

for (let i = 0; i < bin.length; i++) {
  if (bin[i] === "1") contador++;
}

console.log(`El número de unos en ${bin} es: ${contador}`);
