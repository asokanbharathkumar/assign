function concat(a,b)
{
    var myarray2=new Array(a.length+b.length);
    for(i=0;i<a.length;i++)
    {
        myarray2[i]=a[i];
    }
    var j=0;
    for(i=a.length;i<b.length+a.length;i++)
    {
        myarray2[i]=b[j];
        j++;
    }
    document.write("["+myarray2+"]");
}
var myarray=new Array(3);
myarray[0]="a";
myarray[1]="b";
myarray[2]="c";

var myarray1=new Array(3);
myarray1[0]=1;
myarray1[1]=2;
myarray1[2]=3;

concat(myarray,myarray1);
