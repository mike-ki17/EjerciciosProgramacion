let informacion_mike = {
    nombre: 'Michael',
    apellido: 'Castro',
    identificacion:'12323232',
    efectivo: 6000,
    telefono: '23132323',
    carrera: 'Tecologia en desarrollo de software'
};

let madre_mike = {
    nombre: 'Monica',
    apellido: 'Daza',
    identificacion:'210476810',
    efectivo: 7000,
    telefono: '3124046068',
}

let padre_mike = {
    nombre: 'Cesar',
    apellido: 'Castro',
    identificacion:'23233440',
    efectivo: 10000,
    telefono: '3124046110',
}

let consulta = document.getElementById('consulta');
let contador = [0, 0, 0, 0]
let users = [0,0,0]
consulta.addEventListener('keydown', (e) => {
    // consulta.value = `Cambio de Usuario * Disponibles-  [M]: Mike; [M2]: Madre de Mike; [M3]: Padre de Mike:\n `
    if(e.code == 'Enter'){
        // Consultar()
        if(consulta.value.includes('2') && users[0] == 0 ){
           
            // contador = [0, 0, 0, 0]
            Consultar(madre_mike, 2)
           
            // contador[0] = 1
            
        }
        else if (consulta.value.includes('1') && users[1] == 0 ){
            // contador = [0, 0, 0, 0]
            Consultar(padre_mike, 1)
           
            // contador[1] = 1
        }
        else if (consulta.value.includes('0') && users[2] == 0){
            // contador = [0, 0, 0, 0]
            Consultar(informacion_mike, 0)
            
            // contador[2] = 1
        }

        // Consultar()
    }

    // console.log(e.code)
    if (e.code == 'Tab'){
        consulta.value = `Cambio de Usuario * Disponibles-  [0]: Mike; [2]: Madre de Mike; [1]: Padre de Mike:`
        setTimeout(() => {consulta.value = ''}, 1000)
    }
   

   
})

// function User(){
//     if(consulta.value.includes('2') && users[0] == 0 ){
//         contador = [0, 0, 0, 0]
//         // Consultar(madre_mike)
//         contador[0] = 1
//         return madre_mike
//     }
    
//     else if (consulta.value.includes('1') && users[1] == 0 ){
//         contador = [0, 0, 0, 0]
//         // Consultar(padre_mike)
//         contador[1] = 1
//         return padre_mike
//     }
//     else if (consulta.value.includes('0') && users[2] == 0 ){
//         contador = [0, 0, 0, 0]
//         // Consultar(informacion_mike)
//         contador[2] = 1
//         return informacion_mike
//     }
// }


function Consultar (info = informacion_mike, user){
    if(consulta.value.includes('Nombre:') && contador[0] == 0 ){
        consulta.value += ` Nombre registrado: ${info.nombre}`;
        contador[0] = 1
        // users[user] = 1
    }
    else if (consulta.value.includes('Apellido:') && contador[1] == 0 ){
        consulta.value += ` Apellido registrado: ${info.apellido}`;
        contador[1] = 1
        // users[user] = 1
    }
    else if (consulta.value.includes('Identificacion:') && contador[2] == 0 ){
        consulta.value += ` Identificación registrada: ${info.identificacion}`;
        contador[2] = 1
        // users[user] = 1
    }
    else if (consulta.value.includes('Telefono:') && contador[3] == 0){
        consulta.value += ` Telefono registrado: ${info.telefono}`;
        contador[3] = 1
        // users[user] = 1
    }
}



// document.write(`Nombre: ${informacion_mike.nombre} <br> Apellido:${informacion_mike.apellido}  <br> ID: ${informacion_mike.identificacion}  <br> Telefono: ${informacion_mike.telefono}  <br> Carrera${informacion_mike.carrera}`)
// let item_nombre = document.getElementById('nombre');
// let item_identificacion = document.getElementById('identificacion')
// let item_efectivo = document.getElementById('efectivo');
// let item_carrera = document.getElementById('carrera')
// let item_telefono = document.getElementById('telefono')


// item_nombre.innerHTML = `Hola soy ${informacion_mike.nombre}`;
// item_identificacion.innerHTML = `ID: ${informacion_mike.identificacion}`
// item_efectivo.innerHTML = `Tengo COP $${informacion_mike.efectivo} en el bolsillo :'v`;
// item_telefono.innerHTML = `Llamar al: ${informacion_mike.telefono}`
// item_carrera.innerHTML = `Estoy estudiando: ${informacion_mike.carrera} 🤙`;    

