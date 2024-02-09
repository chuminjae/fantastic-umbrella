# include <bits/stdc++.h>
using namespace std;
int n;
int a[100000];
int main(){
    cin >> n;
    int x;
    for(int i = 0; i < n; i++){
        cin >> x;
        a[x]++;
    }
    for(int i = 0; i < 100000; i++){
        while(a[i] != 0){
            cout << i << "\n";
            a[i] --;
        }
    }
}
