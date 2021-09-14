const randomArray=Array(100).fill().map(() => Math.round(Math.random() * 100));
var max = randomArray.reduce(function(a, b) 
            {
                return Math.max(a, b);
            }, 0);
document.write("MAX="+max+"<br>");
var min = randomArray.reduce(function(a, b) 
            {
                return Math.min(a, b);
            }, 0);
document.write("MIN="+min+"<br>");
var sum=0;
for(i=0;i<100;i++)
{
    sum=sum+randomArray[i];
}
document.write("SUM="+sum+"<br>");
var avg=sum/100;
document.write("AVERAGE="+avg+"<br>");
var even=0;
var odd=0;
for(i=0;i<randomArray.length;i++)
{
    if(randomArray[i]%2==0)
    {
        even++;
    }
    else
    {
        odd++;
    }
}
document.write("Even Count="+even+"<br>");
document.write("Odd Count="+odd+"<br>");
document.write("Even Count is high");