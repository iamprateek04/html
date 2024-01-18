// let arr =[1,2,3,4]
// let new1= arr.map((a,b,c)=>{
//     console.log(a)
//     return a
// })

// console.log(new1)
// --------------------------------------------------------------------------------------------------------

// let ar =[1,2,3,4]
// let new2= ar.forEach((c,b,a) => {
//     console.log(b)
//     return a
// })
// 'for each' modifies in the same array while map gives a new array
// ---------------------------------------------------------------------------------------------------------------

// let arr=[1,2,3,4,5]

// let new1 = arr.filter((a,b,c)=>{
// return a>2
// })
// console.log(new1)

// let new2 = arr.find((a,b,c)=>{
//     return a>2
//     })
//     console.log(new2)
// filter iterate full array while find will not iterate if it finds it greater value
// ------------------------------------------------------------------------------------------------------------

// let abc=[1,2,3,4,5,6,7,8,9,10]
// let new3 = abc.reduce((a,b,c,d)=>{
//     return a+b

    // a=a+b
    // a=1 , b=2
    // a=1+2=3
    // a=3 , b=3
    // a=3+3=6
    // a=6 , b=4
    // a=6+4=10
    // a=10 , b =5

// })
// console.log(new3)



// let obj={
//     id:1,
//     user:"hello",
//     ispass:true
// }

// obj.user='hiii'


// let arr= [{id:1,user:hello},{id:2,user:'hii'}]
// arr.map{(k)=>{
//     console.log(k.id)
// }}


// let arr=[1,2,3,4,5,6,7]
// arr.push(7)
// arr.pop()
// arr.unshift()
// arr.shift()
// console.log(arr)




// function add(a){
//     console.log(a.id)
// }



// let obj={
//     id:1,
//     username:'hello'
// }

// add(obj)



// let obj={
//     firstname:'hello',
//     lastname:"hii",
//     fullname:function(){
//         console.log(this)
//     }
// }

// obj.fullname()


// let user='hellooo'
// function add(){
//     let num=5
//     console.log(num)
// }
// console.log(user)
// add()

// let user='hellooo'
// function add(){
//     return 5
//     // let num=5
//     console.log(num)
// }
// console.log(user)
// add()


// let user='hellooo'
// function add(){
//     return 5
//     let num=5
//     console.log(num)
// }
// console.log(user)
// add()
// let a = add()
// console.log(a)




// function outer()
// {
//     let num=5
//     inner()
//     function inner(){
//         console.log(num)
//     }
// }
// outer()



// function outer()
// {
    
//     inner()
//     var num=5

//     function inner(){
//         console.log(num)
//     }
// }
// outer()


// -------------------------------------------------------------------------------------------------------------------

// console.log(a)
// var/let/const a=5

// hoisting
// var a
// console.log(a)
// a=5 


// console.log(a)
// let a=5

// console.log("hii")
// {
//     console.log("hello")
// }


// {
//     let a=5
//     console.log(a)
// }
// console.log(a)

// -------------------------------------------------------------------------------------------
//higher order functions
// function outer(a)
// {
//     console.log("outer")
//     a()
// }
// function inner()
// {
//     console.log("inner")
// }
// outer(inner)


// function outer()
// {
//     console.log('outer')
//     function inner()
//     {
//         console.log('inner')
//     }
//     return inner
// }
// let i = outer()
// i()
// outer()() = higher order function returns a function by applying '()' 2 times

// ----------------------------------------------------------------------------------------------------------
// String
// let arr = [1,2,3,4,'hello','hiii',true, false]  //differntiate the int str and boolean seperately
// function get(arr)
// {
//     let res=[]
//     for(let item of arr)
//     {
//         if(typeof item==='string')
//         {
//             res.push(item)
//         }
//     }
//     return res
// }
// console.log(get(arr))

// Number
// function getNumber(arr)
// {
//     let res=[]
//     for(let item of arr)
//     {
//         if(typeof item==='number')
//         {
//             res.push(item)
//         }
//     }
//     return res
// }
// console.log(getNumber(arr))


// // Boolean
// function getBool(arr)
// {
//     let res=[]
//     for(let item of arr)
//     {
//         if(typeof item==='boolean')
//         {
//             res.push(item)
//         }
//     }
//     return res
// }
// console.log(getBool(arr))
// -----------------------------------------------------------------------------------------------------------------

// let arr = [1,2,3,4,'hello','hiii',true, false] 
// function getstring(item)
// {
//     return typeof item==='string'
// }

// function getNumber(item)
// {
//     return typeof item==='number'
// }

// function getBool(item)
// {
//     return typeof item==='boolean'
// }

// function get(arr,fn)
// {
//     let res=[]
//     for(let item of arr)
//     {
//         if(fn(item))
//         {
//             res.push(item)
//         }
//     }
//     return res
// }
// console.log(get(arr,getstring))
// console.log(get(arr,getNumber))
// console.log(get(arr,getBool))

// ----------------------------------------------------------------------------------------------------------
// callback function = a function which contain another function inside its arguments
// e.g Map function , Higher order function 

// function callback(num,fn)
// {
//     return fn(num)
// }

// function boolean(num)
// {
//     return typeof num==='boolean'
// }
// console.log(callback(true,boolean))
// ------------------------------------------------------------------------------------------------------------
// function outer()
// {
//     let user='hello'
//     function inner()
//     {
//         console.log(user)
//     }
//     inner()
//     // return inner
// }
// outer()
// let inner=outer()
// inner()

// ----------------------------------------------------------------------------------------------------------------
// closure property
// function outer()
// {
//     let user='hello'
//     function inner()
//     {
//         console.log(user)
//     }
//     // inner()
//     return inner
// }
// // outer()
// let inner=outer()
// inner()

// --------------------------------------------------------------------------------------------------------------

// const numbers = [1, 2, 3, 4, 5];
//   const doubled = numbers.map(num => num * 2); console.log(doubled);

// const names = ['Alice', 'Bob', 'Charlie'];
//   const filteredNames = names.filter(name => name.length > 4); console.log(filteredNames);

// const numbers = [1, 2, 3, 4, 5]; const squared = numbers.map(num => num ** 2); console.log(squared);

// function greet() { console.log('Hello'); } 
// var greet = 'Hi'; console.log(typeof greet);


// var x = 10; 
// function foo() { console.log(x); var x = 20; } foo();

// console.log(3 + '3' - 1);

// var numbers = [1, 2, 3, 4, 5]; 
// var doubled = numbers.forEach(function(num) { return num * 2; }); console.log(doubled);

// var numbers = [1, 2, 3, 4, 5]; var sum = 0; numbers.forEach(function(num) { sum += num; }); console.log(sum);

// const words = ['apple', 'banana', 'cherry']; 

// const lengths = words.map(word => word.length); console.log(lengths);


// console.log(0.1 + 0.2);

// var x = 10; var y = '5'; console.log(x + y);

// var x = 'abc';
//   console.log(x[0]);
//  x[0] = 'z'; 
// console.log(x);

// ------------------------------------------------------------------------------------------------------------------

// prototype

// let obj={
//     id:1,
//     user:'hello',
// print:function(){
//     console.log(this.user)
// }
// }
// obj.print()
// console.log(toString())

// -----------------------------------------------------------------------------------------------------------------

// array prototype
// var array=[1,2,3,4,5]
// arr.map(a)={
//     console,log(a)
// }


// ----------------------------------------------------------------------------------------------------------


// constructor function = we create object in constructor

function outer()
{
    this.username= 'hello',
    this.userlastname= 'hii'


}
let user = new outer()
console.log(user)






// function outer(user,lastname)
// {
//     this.username= user,
//     this.userlastname= lastname


// }
// let user = new outer('hello', 'hii')
// console.log(user)








