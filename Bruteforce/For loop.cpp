# include <bits/stdc++.h>
using namespace std;
int main(){
    int cnt = 0;
    for(int i = 0; i < 10; i ++){
        for(int j = 0; j < 10; j++){
            if(i + j == 13){
                cnt++;
            }
        }
    }
    cout << cnt;
}
