let clargs = process.argv; // node .\FirstFunction.js 10
let n = parseInt(clargs[2]);

for(let i=2;i<=n;i++){
    let isPrime = checkPrime(i);
    if(isPrime){
        console.log(i);
    }
}

function checkPrime(x){
    for(let div=2;div*div<=x;div++){
        if(x%div==0){
            return false;
        }
    }
    return true
}