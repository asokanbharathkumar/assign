var n=9;
var sum=0;
for (i=0;i<=n;i++)
{
    if(i%3==0 || i%5==0)
    {
        sum =sum+i;
    }
}
document.write(sum);