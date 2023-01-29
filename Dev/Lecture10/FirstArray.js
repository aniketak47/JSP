let clargs = process.argv; // used for reading input from command line ( node .\FirstArray.js 5 10 20 30 40 50 )
let n = parseInt(clargs[2]);

let arr = [];
for(let i=0;i<n;i++){
    let val = parseInt(clargs[i+3]);
    // arr.push(val);
    arr[i] = val;
}

for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}

console.log(arr);
console.log(arr.length);