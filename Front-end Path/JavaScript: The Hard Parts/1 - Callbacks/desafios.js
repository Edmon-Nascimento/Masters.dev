//Desafio 1
// function addTwo(input){
//     console.log(input+2)
// }
// addTwo(6)

//Desafio 2
// function addS(input){
//     console.log(`${input}s`)
// }
// addS("Eu não acredito que estou resolvendo algo tão fácil")

//Desafio 3
// function map(array, callback){
//     const res = []
//     for(let i=0; i<array.length;i++){
//         res.push(callback(array[i]))
//     }
//     return res
// }
// function sum3(input){
//     return input+3
// }
// console.log(map([3,8,15,2,9], sum3))

//Desafio 4
// function forEach(array, callback){
//     for(let i=0; i<array.length;i++){
//         res.push(callback(array[i]))
//     }
// }
// function multiplyByTwo(input){
//     return input*2
// }
// forEach([1,2,3,4,5], multiplyByTwo)

//Desafio 5
// function mapWith(array, callback){
//     const res = []
//     callback(array, res)
//     return res
// }
// function forEach(array, res){
//     for(let i=0; i<array.length;i++){
//         res.push((array[i]*2))
//     }
// }
// console.log(mapWith([1,2,3,4,5], forEach))