# include <bits/stdc++.h>
using namespace std;
int n;

void swap(int b[], int x, int y){
    int k = b[x];
    b[x] = b[y];
    b[y] = k;
}
int main(){
    cin >> n;
    int a[n];
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    for(int i = 0; i < n; i ++){
        int mx = a[i];
        int idx = i;
        for(int j = i + 1; j < n; j++){
            if(mx > a[j]){
                mx = a[j];
                idx = j;
            }
        }
        if(i != idx){
            swap(a, i, idx);
        }
    }
    for(int i = 0; i < n; i++){
        cout << a[i] << " ";
    }
}
