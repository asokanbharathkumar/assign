var myarray = new Array(5);
myarray[0]="Hello";
myarray[1]="World";
myarray[2]="in";
myarray[3]="a";
myarray[4]="frame";
for (i=0;i<9;i++){
    document.write("*");
}
document.write("<br>");
for (i=0;i<5;i++){
    document.write("*"+myarray[i]+"*"+"<br>");
}
for(i=0;i<9;i++)
{
    document.write("*");
}
