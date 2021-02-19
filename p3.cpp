#include<iostream>

using namespace std;

int main(int argc , char ** argv)
{
int n;
cout<<"\nEnter any no. =";
cin>>n;
int sp=n-1;  //spaces 
int st=1;    //stars
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=sp;j++)   //spaces 
    {
        cout<<"\t";
    }
    for(int j=1;j<=st;j++)      //stars
    {
        cout<<"*\t";
    }
    sp--;    //spaces are decreasing 
    st++;   //stars are increasing .
    cout<<endl;
}

}