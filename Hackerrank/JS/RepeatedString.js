/**
 * https://www.hackerrank.com/challenges/repeated-string/problem
 */
'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', () => {
    inputString = inputString.replace(/\s*$/, '')
        .split('\n')
        .map(str => str.replace(/\s*$/, ''));

    main();
});

function readLine() {
    return inputString[currentLine++];
}

const qtdAInString = (string) => {

    let posicaoA = 0;
    let qtdAStr = 0;
    for (let i = 0; i < string.length; i++) {
        posicaoA = string.indexOf('a', i);
        if (posicaoA > -1) {
            qtdAStr++;
            i = posicaoA;
        }
        posicaoA = -1;
    }

    return qtdAStr;
}

// Complete the repeatedString function below.
function repeatedString(string, tamanhoDaNovaString) {

    const tamanhoStringAtual = string.length;
    let qtdAStr = 0;

    if (tamanhoStringAtual > tamanhoDaNovaString) {

        qtdAStr = qtdAInString(string.substring(0, tamanhoDaNovaString));
        
    } else {

        let qtdRepeteString = tamanhoDaNovaString / tamanhoStringAtual;
        qtdAStr = qtdAInString(string);

        if (Number.isInteger(qtdRepeteString)) {

            qtdAStr = qtdAStr * qtdRepeteString;

        } else {

            qtdRepeteString = Math.trunc(qtdRepeteString);
            let aux = Math.abs(tamanhoDaNovaString % tamanhoStringAtual);
            let qtdRepeteSubString = qtdAInString(string.substring(0, aux));
            qtdAStr = qtdAStr * qtdRepeteString;
            qtdAStr = qtdAStr + qtdRepeteSubString;
            
        }       
    }
    return qtdAStr;    
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const string = readLine();

    const tamanhoDaString = parseInt(readLine(), 10);

    let result = repeatedString(string, tamanhoDaString);

    ws.write(result + "\n");

    ws.end();
}