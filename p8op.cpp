#include<iostream>

using namespace std;

int main(int argc, char** argv)
{

int n;
cout<<"\nenter any no.=";
cin>>n;

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n;j++)
    {
        if(i+j==n+1)
        {
            cout<<"*\t";
        }
        else
        {
            cout<<"\t";
        }
    }
    cout<<endl;
}

}