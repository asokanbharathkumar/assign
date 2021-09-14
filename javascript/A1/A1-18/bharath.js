function rotate(a,b)
{
    var my=new Array(2);
    var my1=new Array(2);
    var my2=new Array(2);
    var b1=b;
    for(i=0;i<b;i++)
    {
        my[i]=a[i];
    }
    for(i=0;i<a.length-b1;i++)
    {
        my1[i]=a[b];
        b++;
    }
    for(i=0;i<my1.length;i++)
    {
        my2[i]=my1[i];
    }
    for(i=0;i<my.length;i++)
    {
        my2[b1+1]=my[i];
        b1++;
    }
    document.write(my2);
}
var myarr=[1,2,3,4,5,6];
var k=2;
rotate(myarr,k);
