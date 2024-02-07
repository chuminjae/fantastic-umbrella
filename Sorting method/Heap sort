# include <bits/stdc++.h>
using namespace std;
int n;
int s;
int a[4801001];
int b[4801001];
void swap(int a[], int x, int y){
    int p = a[x];
    a[x] = a[y];
    a[y] = p;
}
int main(){
    // 범위 최댓값 입력
    a[0] = INT_MAX;
    cin >> n;
    int cnt = 0;
    // 힙트리 만들기
    for(int i = 0; i < n; i++){
        cnt++;
        cin >> a[cnt];
        int d = cnt;
        while(a[d / 2] < a[d] && d >= 1){
            swap(a, d, d /2);
            d = d / 2;
        } 
    }
    // 힙트리 정렬
    for(int j = 0; j < n; j++){
        int i = 1;
        swap(a, i, cnt);
        cnt --;
        while(1){
            int h=0,p=0;
            if(i * 2 <= cnt && a[i] < a[i * 2])
            {
                h=a[i*2];
            }
            if(i * 2 + 1 <= cnt && a[i] < a[i * 2 +1])
            {
                p=a[i*2 +1];
            }
            if((h > p) && ( h !=0)){
                swap(a, i,i *2);
                i = i *2;
            }
            else if((h <= p) && (p !=0))
            {
                swap(a, i , i *2 +1);
                i = i *2 +1;
            }
            else{
                break;
            }
        }
    }
    for(int i=1; i<=n; i++)
    {
        cout<<a[i]<<" ";
    }
}
