#include <bits/stdc++.h>
using namespace std;
int cnt;
int main(){
    int n;
    int temp;
    cin >> n;
    int a[n];
    for(int i = 0; i < n; i++){
        cin >> a[i];
    }
    sort(a, a+ n);
	int k = n;
	for(int i = 0; i < n; i++){
        cnt += a[i] * k;
        k --;
    }
     cout << cnt;
}
