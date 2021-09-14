var obj= { "firstName": "bharath", "lastName": "kumar" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="asokan";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "arvind";

console.log(p1.middleName);