# include <bits/stdc++.h>
using namespace std;
bool a[11];
int aa[2];
int cnt;
void check(int c){
    if(c == 2){
        int sum = 0;
        for(int i =0; i < 2; i++){
            sum += aa[i];
        }
        if(sum == 13){
            cnt ++;
        }
    }
    else{
        for(int i = 0; i < 10; i++){
            if(!a[i]){
                a[i] = true;
                aa[c] = i;
                check(c +1);
                a[i] = false;
            }
        }
    }
}
int main(){
    check(0);
    cout << cnt;
}
