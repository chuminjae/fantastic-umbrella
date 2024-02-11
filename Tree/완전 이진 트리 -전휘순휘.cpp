# include <bits/stdc++.h>
using namespace std;
string b;
void f(int a,int p) ///현재 위치 
{
  if(a>p) return;
  
  cout<<b[a];
  f(a*2,p);
  f(a*2+1,p);
}
int main(){
    
    cin>>b;
    b="0"+b;
    cout << b;
    return 0;
    f(1,b.size()-1);
}
