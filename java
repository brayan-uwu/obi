function Persona(nombre, apellidos, dia, genero, edad) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dia = dia;
    this.genero = genero;
    this.edad = edad;
    let curp = "RABBDJDKSLIJRJJFLD84HR";
    let rfc = "838478hdjks";


    this.saludar = function() {
        console.log("hola, soy   " + nombre + apellidos + " naci el   " + dia + "  mi genero es :  " + genero + " y tengo " + edad + " AÑOS ");
    }
}
let objetoPersona = new Persona("brandon", "marias", "12 / 03 / 03", "M", 19);
let objPersona = new Persona("RODRIGO ", " PEREZ ", " 11/03/03 ", "M", 19);
objetoPersona.saludar();
objPersona.saludar();
