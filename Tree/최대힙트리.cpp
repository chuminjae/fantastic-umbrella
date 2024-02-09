# include <bits/stdc++.h>
using namespace std;
int n;
int a[1001];
void swap(int a[], int x, int y){
    int p = a[x];
    a[x] = a[y];
    a[y] = p;
}
int main(){
    a[0] = 1000001;
    cin >> n;
    int cnt = 1;
    for(int i = 0; i < n; i++){
        cin >> a[cnt];
        int d = cnt;
        while(a[d / 2] < a[d] && d >= 1){
            swap(a, d, d /2);
            d = d / 2;
        }
        cnt++;
    }
    cout << a[1];
}
