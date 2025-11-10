const texto = '{"nombre":"Carlos","edad":30,"profesion":"Ingeniero"}';
const objeto = JSON.parse(texto);

console.log("Nombre:", objeto.nombre);
console.log("Edad:", objeto.edad);
