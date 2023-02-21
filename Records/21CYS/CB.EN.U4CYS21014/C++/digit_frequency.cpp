#include <iostream>
using namespace std;
int main()
{
    int n,num,r,first,j,flag=0;
    cout<<"Enter the no. of digits: ";
    cin>>n;
    cout<<"Enter the number: ";
    cin>>num;
    int a[n];
    int i;
    i=n-1;
    while(num>0)
    {
       r=num%10;
       a[i]=r;
       num = num/10;
       i--;
       cout<<a[i];
    }

    /*for(i=0;i<n;i++)
    {
        first=a[i];
        for(j=0;j<n;j++)
        {
            if(a[j]==first)
            flag++;
        }
        cout<< first <<" is repeated "<< flag<<" times."<<endl;
    }*/
    return 0;
}