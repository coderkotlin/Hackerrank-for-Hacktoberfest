#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q;
    cin>> n >> q;
    vector<int> arr[n];
    for(int i=0; i<n; i++){
        int s;
        cin>>s;

         int o;
       for(int j=0; j<s; j++){
           cin>>o;
           arr[i].push_back(o);
       }
    }

    int r, s;
    for(int k=0; k<q; k++){
        cin>>r>>s;
        cout<<arr[r][s]<<endl;
    }


    return 0;
}