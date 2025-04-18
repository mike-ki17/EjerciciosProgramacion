let n = 21212;


function Palindromo (n) {
    let paso_str = n.toString()

    let arr_origin = paso_str.split('')
    let arr_invert = []

    for(let i in arr_origin){
        arr_invert.push(paso_str[-(i - arr_origin.length)-1])
    }
    
    if( parseInt(arr_origin) == parseInt(arr_invert)){
        console.log(`El número ${n} es palindromo`)
    }
    else{
        console.log(`El número ${n} no es palindromo`)
    }

}


Palindromo(n)