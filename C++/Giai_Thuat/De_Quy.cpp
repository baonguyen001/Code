
#include <iostream>
#include <cmath>
using namespace std;

long UCLN(int a, int b);
float Sn(int n);
double SxN(double x, int n);
int SumArray(int a[], int n);

int main()
{
    // cout <<  UCLN(123123, 123);
    // cout << Sn(5);
    // cout << SxN(4, 5);
    int a[] = {1, 2 , 3, 4};
    int size = sizeof(a) / sizeof(a[0]);
    cout << SumArray(a, size - 1);
    
    return 0;
}

long UCLN(int a, int b){
    
    if(a == b){
        return a;
    }else if(a > b){
        return UCLN(a-b, b);
    }else{
        return UCLN(b-a, a);
    }
    
}

float Sn(int n){
    
    if(n == 1){
        return (float)1/2;
    }else{
        return  (float)n/(n + 1) + Sn(n - 1);
    }
    
}

double SxN(double x, int n){
    
    if(n == 1){
        return x;
    }else{
        return pow(x, n) + SxN(x, n - 1);
    }
    
}

int SumArray(int a[], int n){
    
    if(n == 0){
        return a[0];
    }
    else{
        return a[n] + SumArray(a, n - 1);
    }
    
}










