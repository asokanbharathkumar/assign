var obj= "var p1={ firstName: 'bharath', lastName: 'kumar' };";

eval(obj);

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="asokan";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "arvind";

console.log(p1.middleName);