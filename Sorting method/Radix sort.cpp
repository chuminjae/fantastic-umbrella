#include <bits/stdc++.h>
using namespace std;

int a[4500000];

// Function to count the number of digits in a number
int count(int a){
    int b = 1;
    while(a / 10 != 0){
        a = a / 10;
        b++;
    }
    return b;
}

// Function to extract a specific digit from a number
int count1(int a, int c){
    int x = pow(10, c - 1);
    a = a / x;
    return a % 10;
}

int main(){
    int n;
    queue<int> q[10]; // Array of queues for each digit (0-9)
    int b = 0;
    cin >> n; // Input the number of elements in the array

    // Input the array elements and find the maximum value
    for(int i = 0; i < n; i++){
        cin >> a[i];
        b = max(b, a[i]);
    }

    // Determine the number of digits in the maximum value
    int cnt = count(b);

    // Perform radix sort
    for(int j = 1; j <= cnt; j++){
        for(int i = 0; i < n; i++){
            q[count1(a[i], j)].push(a[i]); // Distribute elements into queues based on current digit
        }

        int p = 0;
        // Collect elements from queues
        for(int k = 0; k < 10; k++){
            while(!q[k].empty()){
                a[p] = q[k].front();
                q[k].pop();
                p++;
            }
        }
    }

    // Print the sorted array
    for(int i = 0; i < n; i++){
        cout << a[i] << " ";
    }
}
