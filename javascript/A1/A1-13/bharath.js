function add(a)
{
    var sum=0;
    for(i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    document.write("using for loop"+sum+"<br>");
}
function add1(a)
{
    var s=a.length;
    var i=0;
    var sum=0;
    while(i<6)
    {
        sum=sum+a[i];
        i++;
    }
    document.write("using while loop"+sum+"<br>");
}
function add2(a)
{
    var s=a.length;
    var i=0;
    var sum=0;
    do
    {
        sum=sum+a[i];
        i++;
    }
    while(i<6)
    document.write("using do while loop"+sum+"<br>");
}
var myarray=[1,2,3,4,5,6];
add(myarray);
add1(myarray);
add2(myarray);
