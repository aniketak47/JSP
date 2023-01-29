let minimist = require("minimist")
let args = minimist(process.argv)

// node .\FirstFile.js --source=f1.txt --dest=f2.txt

let fs = require("fs")
let stext = fs.readFileSync(args.source, "utf-8")

let words = stext.split(" ")

for(let i=0;i<words.length;i++){
    words[i] = words[i].toUpperCase()
}

let dtext = words.join(" ")

fs.writeFileSync(args.dest, dtext, "utf-8")

