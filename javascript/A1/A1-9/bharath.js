function concat(a,b)
{
    var myarray2=new Array(a.length+b.length);
    var j=0;
    for(i=0;i<a.length+b.length;i=i+2)
    {
        myarray2[i]=a[j];
        myarray2[i+1]=b[j];
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
