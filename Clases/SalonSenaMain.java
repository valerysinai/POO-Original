public class SalonSenaMain {

    public static void main(String[] args) {

        Computador[] computadores = new Computador[] {
            new Computador("HP", "Pavilion", 8),
            new Computador("Lenovo", "ThinkPad", 16),
            new Computador("Asus", "ROG", 32),
            new Computador("Dell", "Inspiron", 12),
            new Computador("Acer", "Nitro", 16)
        };
        System.out.println(computadores[0]);

        Cargador[] cargadores = new Cargador[] {
            new Cargador("Tipo C", "Xiaomi"),
            new Cargador("USB-A", "Samsung"),
            new Cargador("MagSafe", "Apple"),
            new Cargador("Micro-USB", "Nokia"),
            new Cargador("USB-C PD", "Anker")
        };
        System.out.println(cargadores[0]);

        Mesa[] mesas = new Mesa[] {
            new Mesa("Madera", 120, 4),
            new Mesa("Metal", 150, 6),
            new Mesa("Plástico", 80, 2),
            new Mesa("Vidrio", 140, 4),
            new Mesa("MDF", 100, 3)
        };
        System.out.println(mesas[0]);

        Silla[] sillas = new Silla[] {
            new Silla("Negro"),
            new Silla("Azul"),
            new Silla("Rojo"),
            new Silla("Gris"),
            new Silla("Verde")
        };
        System.out.println(sillas[0]);

        Cuaderno[] cuadernos = new Cuaderno[] {
            new Cuaderno("rayado", 100),
            new Cuaderno("cuadriculado", 80),
            new Cuaderno("blanco", 50),
            new Cuaderno("moleskine", 200),
            new Cuaderno("espiral", 120)
        };
        System.out.println(cuadernos[0]);


        Luz[] luces = new Luz[] {
            new Luz("LED", "Blanco Frío"),
            new Luz("Incandescente", "Amarillo"),
            new Luz("Neón", "Multicolor"),
            new Luz("Halógena", "Blanco"),
            new Luz("Fluorescente", "Frío")
        };
        System.out.println(luces[0]);

        Tijeras[] tijerasArr = new Tijeras[] {
            new Tijeras("pequeño", "Acero"),
            new Tijeras("mediano", "Acero inoxidable"),
            new Tijeras("grande", "Titanio"),
            new Tijeras("pequeño", "Plástico"),
            new Tijeras("mediano", "Acero")
        };
        System.out.println(tijerasArr[0]);

        Llaves[] llavesArr = new Llaves[] {
            new Llaves("Acero", "Dorado", 3),
            new Llaves("Latón", "Plateado", 2),
            new Llaves("Acero", "Negro", 5),
            new Llaves("Hierro", "Oxidado", 1),
            new Llaves("Aleación", "Gris", 4)
        };
        System.out.println(llavesArr[0]);

        Televisor[] televisores = new Televisor[] {
            new Televisor("Samsung", "Negro", 55),
            new Televisor("LG", "Plata", 42),
            new Televisor("Sony", "Negro", 65),
            new Televisor("Panasonic", "Gris", 32),
            new Televisor("TCL", "Negro", 50)
        };
        System.out.println(televisores[0]);

        Celular[] celulares = new Celular[] {
            new Celular("Samsung", "Negro"),
            new Celular("Apple", "Blanco"),
            new Celular("Xiaomi", "Azul"),
            new Celular("Motorola", "Gris"),
            new Celular("Nokia", "Rojo")
        };
        System.out.println(celulares[0]);

        Borrador[] borradores = new Borrador[] {
            new Borrador("Goma", "Blanco", "Faber"),
            new Borrador("Plástico", "Negro", "Staedtler"),
            new Borrador("Caucho", "Blanco", "Maped"),
            new Borrador("Goma", "Rosa", "Pelikan"),
            new Borrador("Plástico", "Blanco", "EraserCo")
        };
        System.out.println(borradores[0]);

        Cartuchera[] cartucheras = new Cartuchera[] {
            new Cartuchera("Cuero", "Negra", "Pequeña"),
            new Cartuchera("Tela", "Azul", "Mediana"),
            new Cartuchera("Plástico", "Roja", "Grande"),
            new Cartuchera("Lona", "Verde", "Mediana"),
            new Cartuchera("Cuero", "Marrón", "Pequeña")
        };
        System.out.println(cartucheras[0]);

        Auriculares[] auriculares = new Auriculares[] {
            new Auriculares("Sony", "Negro"),
            new Auriculares("JBL", "Azul"),
            new Auriculares("Bose", "Blanco"),
            new Auriculares("Xiaomi", "Negro"),
            new Auriculares("Sennheiser", "Gris")
        };
        System.out.println(auriculares[0]);

         Carpeta[] carpetas = new Carpeta[] {
            new Carpeta("Plástico", "Negra"),
            new Carpeta("Cartón", "Marrón"),
            new Carpeta("Tela", "Azul"),
            new Carpeta("PVC", "Transparente"),
            new Carpeta("Cuero", "Negra")
        };
        System.out.println(carpetas[0]);

        Persona[] personas = new Persona[] {
            new Persona("Juan", "Perez", 25),
            new Persona("María", "Gomez", 30),
            new Persona("Carlos", "Lopez", 22),
            new Persona("Ana", "Martinez", 28),
            new Persona("Luis", "Sanchez", 35)
        };
        System.out.println(personas[0]);

        Alcohol[] alcoholes = new Alcohol[] {
            new Alcohol("Gel", "Alcoholico", "Transparente"),
            new Alcohol("Líquido", "Olor fuerte", "Incoloro"),
            new Alcohol("Gel", "Suave", "Transparente"),
            new Alcohol("Espuma", "Neutro", "Blanco"),
            new Alcohol("Spray", "Perfumado", "Transparente")
        };
        System.out.println(alcoholes[0]);

        Impresora[] impresoras = new Impresora[] {
            new Impresora("HP", "Negra", "Tinta"),
            new Impresora("Epson", "Blanca", "Tinta"),
            new Impresora("Brother", "Gris", "Laser"),
            new Impresora("Canon", "Negra", "Tinta"),
            new Impresora("Lexmark", "Negra", "Laser")
        };
        System.out.println(impresoras[0]);

        Escoba[] escobas = new Escoba[] {
            new Escoba(150.0, "Rojo", "Plástico"),
            new Escoba(140.0, "Azul", "Fibra"),
            new Escoba(160.0, "Verde", "Madera"),
            new Escoba(155.0, "Amarillo", "Fibra"),
            new Escoba(145.0, "Negro", "Plástico")
        };
        System.out.println(escobas[0]);

        Recogedor[] recogedores = new Recogedor[] {
            new Recogedor(40.0, "Rojo", "Plástico"),
            new Recogedor(35.0, "Azul", "Metal"),
            new Recogedor(45.0, "Verde", "Plástico"),
            new Recogedor(38.0, "Negro", "Plástico"),
            new Recogedor(42.0, "Gris", "Metal")
        };
        System.out.println(recogedores[0]);

        Hoja[] hojas = new Hoja[] {
            new Hoja("Blanca", "Papel", "HP"),
            new Hoja("Amarilla", "Cartulina", "Canson"),
            new Hoja("Azul", "Papel", "BrandX"),
            new Hoja("Verde", "Reciclado", "EcoPaper"),
            new Hoja("Blanca", "Papel", "Generic")
        };
        System.out.println(hojas[0]);

        Lapiz[] lapices = new Lapiz[] {
            new Lapiz("Faber", "Negro"),
            new Lapiz("Staedtler", "Azul"),
            new Lapiz("Maped", "Rojo"),
            new Lapiz("Bic", "Negro"),
            new Lapiz("Pilot", "Verde")
        };
        System.out.println(lapices[0]);

        Teclado[] teclados = new Teclado[] {
            new Teclado("K120", "Mecánico", "Logitech"),
            new Teclado("Magic", "Membrana", "Apple"),
            new Teclado("GK61", "Mecánico", "Keychron"),
            new Teclado("Slim", "Membrana", "Dell"),
            new Teclado("RGB", "Mecánico", "Corsair")
        };
        System.out.println(teclados[0]);

        Mouse[] mouses = new Mouse[] {
            new Mouse("Óptico", "Logitech", 800),
            new Mouse("Láser", "Razer", 16000),
            new Mouse("Óptico", "Microsoft", 1200),
            new Mouse("Óptico", "HP", 2400),
            new Mouse("Láser", "Asus", 10000)
        };
        System.out.println(mouses[0]);

        Locker[] lockers = new Locker[] {
            new Locker(101, "Metal"),
            new Locker(102, "Metal"),
            new Locker(103, "Plástico"),
            new Locker(104, "Metal"),
            new Locker(105, "Metal")
        };
        System.out.println(lockers[0]);

        Router[] routers = new Router[] {
            new Router("TP-Link", "300Mbps"),
            new Router("Cisco", "1Gbps"),
            new Router("Netgear", "500Mbps"),
            new Router("Huawei", "600Mbps"),
            new Router("Mikrotik", "1Gbps")
        };
        System.out.println(routers[0]);

        USB[] usbs = new USB[] {
            new USB("64GB", "Kingston"),
            new USB("32GB", "SanDisk"),
            new USB("128GB", "Samsung"),
            new USB("16GB", "PNY"),
            new USB("256GB", "Corsair")
        };
        System.out.println(usbs[0]);

        Extintor[] extintores = new Extintor[] {
            new Extintor("ABC", 2.0, "Bueno", "2026-01-01"),
            new Extintor("CO2", 5.0, "Bueno", "2027-06-15"),
            new Extintor("ABC", 6.0, "Malo", "2024-12-31"),
            new Extintor("Polvo", 4.5, "Bueno", "2025-11-11"),
            new Extintor("CO2", 3.0, "Bueno", "2026-05-05")
        };
        System.out.println(extintores[0]);

        Instructor[] instructores = new Instructor[] {
            new Instructor("Andres", "Sistemas", "I001"),
            new Instructor("Lucia", "Redes", "I002"),
            new Instructor("Pedro", "Electrónica", "I003"),
            new Instructor("Sofia", "Diseño", "I004"),
            new Instructor("Diego", "Mecánica", "I005")
        };
        System.out.println(instructores[0]);

        Aprendiz[] aprendices = new Aprendiz[] {
            new Aprendiz("Valeria", "Lopez", "Programación"),
            new Aprendiz("Camilo", "Diaz", "Redes"),
            new Aprendiz("Santiago", "Gomez", "Multimedia"),
            new Aprendiz("Natalia", "Rojas", "Electricidad"),
            new Aprendiz("Mateo", "Perez", "Mecatrónica")
        };
        System.out.println(aprendices[0]);

        GabineteComputador[] gabinetes = new GabineteComputador[] {
            new GabineteComputador("Metal", 5, true),
            new GabineteComputador("Plástico", 3, false),
            new GabineteComputador("Aluminio", 6, true),
            new GabineteComputador("Metal", 4, true),
            new GabineteComputador("Acrílico", 2, false)
        };
        System.out.println(gabinetes[0]);
     
    }

    // 1 Computador
    static class Computador {
        private String marca;
        private String modelo;
        private int ramGb;
        private boolean encendido;

        public Computador(String marca, String modelo, int ramGb) {
            this.marca = marca;
            this.modelo = modelo;
            this.ramGb = ramGb;
            this.encendido = false;
        }

        public void encender() {
            encendido = true;
            System.out.println(marca + " " + modelo + " encendido.");
        }

        public void apagar() {
            encendido = false;
            System.out.println(marca + " " + modelo + " apagado.");
        }

        @Override
        public String toString() {
            return "Computador{" + marca + " " + modelo + ", RAM=" + ramGb + "GB, encendido=" + encendido + "}";
        }
    }

    // 2 Cargador
    static class Cargador {
        private String tipo;
        private String marca;
        private boolean conectado;

        public Cargador(String tipo, String marca) {
            this.tipo = tipo;
            this.marca = marca;
            this.conectado = false;
        }

        public void conectar() {
            conectado = true;
            System.out.println("Cargador " + marca + " conectado (" + tipo + ").");
        }

        public void desconectar() {
            conectado = false;
            System.out.println("Cargador " + marca + " desconectado.");
        }

        @Override
        public String toString() {
            return "Cargador{" + marca + " tipo=" + tipo + ", conectado=" + conectado + "}";
        }
    }

    // 3 Mesa
    static class Mesa {
        private String material;
        private int anchoCm;
        private int puestos;

        public Mesa(String material, int anchoCm, int puestos) {
            this.material = material;
            this.anchoCm = anchoCm;
            this.puestos = puestos;
        }

        public void limpiar() {
            System.out.println("Mesa de " + material + " limpiada.");
        }

        @Override
        public String toString() {
            return "Mesa{" + material + ", ancho=" + anchoCm + "cm, puestos=" + puestos + "}";
        }
    }

    // 4 Silla
    static class Silla {
        private String color;
        private boolean ocupada;

        public Silla(String color) {
            this.color = color;
            this.ocupada = false;
        }

        public void sentarse() {
            ocupada = true;
            System.out.println("Silla " + color + " ahora ocupada.");
        }

        public void levantarse() {
            ocupada = false;
            System.out.println("Silla " + color + " ahora libre.");
        }

        @Override
        public String toString() {
            return "Silla{color=" + color + ", ocupada=" + ocupada + "}";
        }
    }

    // 5 Cuaderno
    static class Cuaderno {
        private String tipo;
        private int hojas;

        public Cuaderno(String tipo, int hojas) {
            this.tipo = tipo;
            this.hojas = hojas;
        }

        public void escribir(String texto) {
            System.out.println("Escribiendo en el cuaderno " + tipo + ": " + texto);
        }

        @Override
        public String toString() {
            return "Cuaderno{tipo=" + tipo + ", hojas=" + hojas + "}";
        }
    }

    // 6 Luz
    static class Luz {
        private String tipo;
        private String color;
        private boolean encendida;

        public Luz(String tipo, String color) {
            this.tipo = tipo;
            this.color = color;
            this.encendida = false;
        }

        public void encender() {
            encendida = true;
            System.out.println("Luz " + tipo + " encendida.");
        }

        public void apagar() {
            encendida = false;
            System.out.println("Luz " + tipo + " apagada.");
        }

        @Override
        public String toString() {
            return "Luz{tipo=" + tipo + ", color=" + color + ", encendida=" + encendida + "}";
        }
    }

    // 7 Tijeras
    static class Tijeras {
        private String tamano;
        private String material;

        public Tijeras(String tamano, String material) {
            this.tamano = tamano;
            this.material = material;
        }

        public void cortar() {
            System.out.println("Cortando con tijeras " + tamano + " de " + material + ".");
        }

        @Override
        public String toString() {
            return "Tijeras{tamano=" + tamano + ", material=" + material + "}";
        }
    }

    // 8 Llaves
    static class Llaves {
        private String material;
        private String color;
        private int cantidad;

        public Llaves(String material, String color, int cantidad) {
            this.material = material;
            this.color = color;
            this.cantidad = cantidad;
        }

        public void abrir() {
            System.out.println("Abriendo con llave " + color + " (" + material + ").");
        }

        @Override
        public String toString() {
            return "Llaves{material=" + material + ", color=" + color + ", cantidad=" + cantidad + "}";
        }
    }

    // 9 Televisor
    static class Televisor {
        private String marca;
        private String color;
        private int pulgadas;
        private boolean encendido;

        public Televisor(String marca, String color, int pulgadas) {
            this.marca = marca;
            this.color = color;
            this.pulgadas = pulgadas;
            this.encendido = false;
        }

        public void encender() {
            encendido = true;
            System.out.println("Televisor " + marca + " encendido.");
        }

        public void apagar() {
            encendido = false;
            System.out.println("Televisor " + marca + " apagado.");
        }

        @Override
        public String toString() {
            return "Televisor{marca=" + marca + ", pulgadas=" + pulgadas + ", encendido=" + encendido + "}";
        }
    }

    // 10 Celular
    static class Celular {
        private String marca;
        private String color;
        private boolean encendido;

        public Celular(String marca, String color) {
            this.marca = marca;
            this.color = color;
            this.encendido = false;
        }

        public void encender() {
            encendido = true;
            System.out.println("Celular " + marca + " encendido.");
        }

        public void llamar(String numero) {
            System.out.println("Llamando a " + numero + " desde " + marca + ".");
        }

        @Override
        public String toString() {
            return "Celular{marca=" + marca + ", color=" + color + ", encendido=" + encendido + "}";
        }
    }

    // 11 Borrador
    static class Borrador {
        private String tipo;
        private String color;
        private String marca;

        public Borrador(String tipo, String color, String marca) {
            this.tipo = tipo;
            this.color = color;
            this.marca = marca;
        }

        public void borrar() {
            System.out.println("Borrando con borrador " + marca + " (" + tipo + ").");
        }

        @Override
        public String toString() {
            return "Borrador{marca=" + marca + ", tipo=" + tipo + ", color=" + color + "}";
        }
    }

    // 12 Cartuchera
    static class Cartuchera {
        private String material;
        private String color;
        private String tamano;

        public Cartuchera(String material, String color, String tamano) {
            this.material = material;
            this.color = color;
            this.tamano = tamano;
        }

        public void guardar() {
            System.out.println("Guardando útiles en cartuchera " + color + ".");
        }

        @Override
        public String toString() {
            return "Cartuchera{material=" + material + ", color=" + color + ", tamano=" + tamano + "}";
        }
    }

    // 13 Auriculares
    static class Auriculares {
        private String marca;
        private String color;
        private boolean conectados;

        public Auriculares(String marca, String color) {
            this.marca = marca;
            this.color = color;
            this.conectados = false;
        }

        public void conectar() {
            conectados = true;
            System.out.println("Auriculares " + marca + " conectados.");
        }

        public void escuchar() {
            if (conectados) System.out.println("Reproduciendo audio en " + marca + ".");
            else System.out.println("Auriculares no conectados.");
        }

        @Override
        public String toString() {
            return "Auriculares{marca=" + marca + ", color=" + color + ", conectados=" + conectados + "}";
        }
    }

    // 14 Carpeta
    static class Carpeta {
        private String material;
        private String color;

        public Carpeta(String material, String color) {
            this.material = material;
            this.color = color;
        }

        public void guardarPapeles() {
            System.out.println("Papeles guardados en carpeta " + color + ".");
        }

        @Override
        public String toString() {
            return "Carpeta{material=" + material + ", color=" + color + "}";
        }
    }

    // 15 Persona
    static class Persona {
        private String nombre;
        private String apellido;
        private int edad;

        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public void saludar() {
            System.out.println("Hola, soy " + nombre + " " + apellido + ".");
        }

        @Override
        public String toString() {
            return "Persona{" + nombre + " " + apellido + ", edad=" + edad + "}";
        }
    }

    // 16 Alcohol
    static class Alcohol {
        private String textura;
        private String olor;
        private String color;

        public Alcohol(String textura, String olor, String color) {
            this.textura = textura;
            this.olor = olor;
            this.color = color;
        }

        public void desinfectar() {
            System.out.println("Desinfectando (textura: " + textura + ").");
        }

        @Override
        public String toString() {
            return "Alcohol{textura=" + textura + ", olor=" + olor + ", color=" + color + "}";
        }
    }

    // 17 Impresora
    static class Impresora {
        private String marca;
        private String color;
        private String tipoTinta;

        public Impresora(String marca, String color, String tipoTinta) {
            this.marca = marca;
            this.color = color;
            this.tipoTinta = tipoTinta;
        }

        public void imprimir(String documento) {
            System.out.println("Imprimiendo '" + documento + "' en impresora " + marca + ".");
        }

        @Override
        public String toString() {
            return "Impresora{marca=" + marca + ", tipoTinta=" + tipoTinta + "}";
        }
    }

    // 18 Escoba
    static class Escoba {
        private double alturaCm;
        private String color;
        private String material;

        public Escoba(double alturaCm, String color, String material) {
            this.alturaCm = alturaCm;
            this.color = color;
            this.material = material;
        }

        public void barrer() {
            System.out.println("Barriendo con escoba de " + alturaCm + " cm.");
        }

        @Override
        public String toString() {
            return "Escoba{alturaCm=" + alturaCm + ", material=" + material + "}";
        }
    }

    // 19 Recogedor
    static class Recogedor {
        private double alturaCm;
        private String color;
        private String material;

        public Recogedor(double alturaCm, String color, String material) {
            this.alturaCm = alturaCm;
            this.color = color;
            this.material = material;
        }

        public void recoger() {
            System.out.println("Recogiendo con recogedor " + color + ".");
        }

        @Override
        public String toString() {
            return "Recogedor{alturaCm=" + alturaCm + ", material=" + material + "}";
        }
    }

    // 20 Hoja
    static class Hoja {
        private String color;
        private String material;
        private String marca;

        public Hoja(String color, String material, String marca) {
            this.color = color;
            this.material = material;
            this.marca = marca;
        }

        public void escribir(String texto) {
            System.out.println("Escribiendo en hoja: " + texto);
        }

        @Override
        public String toString() {
            return "Hoja{marca=" + marca + ", material=" + material + "}";
        }
    }

    // 21 Lapiz
    static class Lapiz {
        private String marca;
        private String color;
        private boolean escribible;

        public Lapiz(String marca, String color) {
            this.marca = marca;
            this.color = color;
            this.escribible = true;
        }

        public void escribir() {
            if (escribible) System.out.println("Escribiendo con lápiz " + marca + ".");
            else System.out.println("Lápiz sin punta.");
        }

        @Override
        public String toString() {
            return "Lapiz{marca=" + marca + ", color=" + color + ", escribible=" + escribible + "}";
        }
    }

    // 22 Teclado
    static class Teclado {
        private String modelo;
        private String tipo;
        private String marca;

        public Teclado(String modelo, String tipo, String marca) {
            this.modelo = modelo;
            this.tipo = tipo;
            this.marca = marca;
        }

        public void escribir(String texto) {
            System.out.println("Teclado " + modelo + " escribe: " + texto);
        }

        @Override
        public String toString() {
            return "Teclado{modelo=" + modelo + ", tipo=" + tipo + ", marca=" + marca + "}";
        }
    }

    // 23 Mouse
    static class Mouse {
        private String tipo;
        private String marca;
        private int dpi;

        public Mouse(String tipo, String marca, int dpi) {
            this.tipo = tipo;
            this.marca = marca;
            this.dpi = dpi;
        }

        public void mover(int x, int y) {
            System.out.println("Moviendo mouse a (" + x + "," + y + ").");
        }

        @Override
        public String toString() {
            return "Mouse{marca=" + marca + ", tipo=" + tipo + ", dpi=" + dpi + "}";
        }
    }

    // 24 Locker
    static class Locker {
        private int numero;
        private String material;
        private boolean ocupado;

        public Locker(int numero, String material) {
            this.numero = numero;
            this.material = material;
            this.ocupado = false;
        }

        public void abrir() {
            ocupado = true;
            System.out.println("Locker " + numero + " abierto.");
        }

        public void cerrar() {
            ocupado = false;
            System.out.println("Locker " + numero + " cerrado.");
        }

        @Override
        public String toString() {
            return "Locker{numero=" + numero + ", material=" + material + ", ocupado=" + ocupado + "}";
        }
    }

    // 25 Router
    static class Router {
        private String marca;
        private String velocidad;
        private boolean encendido;

        public Router(String marca, String velocidad) {
            this.marca = marca;
            this.velocidad = velocidad;
            this.encendido = false;
        }

        public void encender() {
            encendido = true;
            System.out.println("Router " + marca + " encendido (" + velocidad + ").");
        }

        public void apagar() {
            encendido = false;
            System.out.println("Router " + marca + " apagado.");
        }

        @Override
        public String toString() {
            return "Router{marca=" + marca + ", velocidad=" + velocidad + ", encendido=" + encendido + "}";
        }
    }

    // 26 USB
    static class USB {
        private String capacidad;
        private String marca;
        private boolean conectado;

        public USB(String capacidad, String marca) {
            this.capacidad = capacidad;
            this.marca = marca;
            this.conectado = false;
        }

        public void conectar() {
            conectado = true;
            System.out.println("USB " + marca + " conectado (" + capacidad + ").");
        }

        public void expulsar() {
            conectado = false;
            System.out.println("USB " + marca + " expulsado.");
        }

        @Override
        public String toString() {
            return "USB{marca=" + marca + ", capacidad=" + capacidad + ", conectado=" + conectado + "}";
        }
    }

    // 27 Extintor
    static class Extintor {
        private String tipo;
        private double capacidadKg;
        private String estado;
        private String fechaVencimiento;

        public Extintor(String tipo, double capacidadKg, String estado, String.fechaVencimiento) {
            this.tipo = tipo;
            this.capacidadKg = capacidadKg;
            this.estado = estado;
            this.fechaVencimiento = fechaVencimiento;
        }

        public void usar() {
            System.out.println("Usando extintor tipo " + tipo + ".");
        }

        public void verificarFecha() {
            System.out.println("Fecha de vencimiento: " + fechaVencimiento);
        }

        @Override
        public String toString() {
            return "Extintor{tipo=" + tipo + ", capacidadKg=" + capacidadKg + ", estado=" + estado + "}";
        }
    }

    // 28 Instructor
    static class Instructor {
        private String nombre;
        private String areaFormacion;
        private String idInstructor;

        public Instructor(String nombre, String areaFormacion, String idInstructor) {
            this.nombre = nombre;
            this.areaFormacion = areaFormacion;
            this.idInstructor = idInstructor;
        }

        public void iniciarClase() {
            System.out.println("Instructor " + nombre + " inicia clase de " + areaFormacion + ".");
        }

        @Override
        public String toString() {
            return "Instructor{nombre=" + nombre + ", area=" + areaFormacion + ", id=" + idInstructor + "}";
        }
    }

    // 29 Aprendiz
    static class Aprendiz {
        private String nombre;
        private String apellido;
        private String programa;
        private boolean asistencia;

        public Aprendiz(String nombre, String apellido, String programa) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.programa = programa;
            this.asistencia = false;
        }

        public void ingresarSalon() {
            asistencia = true;
            System.out.println(nombre + " " + apellido + " ingresó al salón (" + programa + ").");
        }

        @Override
        public String toString() {
            return "Aprendiz{" + nombre + " " + apellido + ", programa=" + programa + ", asistencia=" + asistencia + "}";
        }
    }

    // 30 GabineteComputador
    static class GabineteComputador {
        private String material;
        private int numeroComponentes;
        private boolean cerrado;

        public GabineteComputador(String material, int numeroComponentes, boolean cerrado) {
            this.material = material;
            this.numeroComponentes = numeroComponentes;
            this.cerrado = cerrado;
        }

        public void abrir() {
            cerrado = false;
            System.out.println("Gabinete abierto.");
        }

        public void cerrar() {
            cerrado = true;
            System.out.println("Gabinete cerrado.");
        }

        @Override
        public String toString() {
            return "GabineteComputador{material=" + material + ", componentes=" + numeroComponentes + ", cerrado=" + cerrado + "}";
        }
    }

}


