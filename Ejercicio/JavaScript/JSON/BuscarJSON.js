const usuarios = [
  { id: 1, usuario: "valery", activo: true },
  { id: 2, usuario: "andres", activo: false },
  { id: 3, usuario: "maria", activo: true }
];

const usuarioActivo = usuarios.find(u => u.activo);
console.log("Primer usuario activo:", usuarioActivo.usuario);
