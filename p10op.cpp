#include<iostream>

using namespace std;

int main(int argc, char** argv)
{
int n;
cout<<"\benter any no. =";
cin>>n;

int os=n/2; 
int is=-1;

for(int i=1;i<=n;i++)
{
    for(int j=1;j<=os;j++) //for outer space 
    {
        cout<<"\t";
    }
    
    cout<<"*\t";   //printing the star in b/w

    for(int j=1;j<=is;j++)  //for inner space
    {
        cout<<"\t";
    }

    if(i>1 &&i<n)
    {
        cout<<"*\t";
    }
//for first half
    if(i<=n/2)
    {
        os--;
        is+=2;
    }
    else
    {
        os++;
        is-=2;
    }
    cout<<endl;
}

}