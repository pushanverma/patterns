#include<iostream>

using namespace std;

int main(int argc, char ** argv)
{

    int n;
    cout<<"\nEnter any no. =";
    cin>>n;

    for(int i=1;i<=n;i++)   // for rows 
    {
        for(int j=1;j<=i;j++)   // for cols 
        {
            cout<<" * ";
        }
        cout<<endl;
    }
    
}