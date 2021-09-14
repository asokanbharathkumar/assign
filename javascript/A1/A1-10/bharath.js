function fibo(a,b)
{
    document.write(a+"<br>"+b+"<br>");
    for(i=0;i<99;i++)
    {
        var sum=a+b;
        a=b;
        b=sum;
        document.write(sum+"<br>");
    }
}
var c=1;
var d=1;
fibo(c,d);
