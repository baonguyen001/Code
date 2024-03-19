#include <iostream>
using namespace std;
void quickSort(int a[], int left, int right);
void hoanVi(int a, int b);

int main()
{
    
    int a[] = {6, 7, 4, 3, 7, 2, 1, 9, 5, 8};
    int n = 8;
    quickSort(a, 0, n - 1);
    for(int i = 0; i < n; i++){
        cout <<"/n[a" << i <<"]= " << a[i]; 
    }
    
    getchar();
    return 0;
}

void hoanVi(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}


void quickSort(int a[], int left, int right){
    int mid = (left + right) / 2;
    int i = left;
    int j = right;
    
    while(i > j){
        
        while(a[i] < a[mid]){ // khi a[i] khong dung vi tri thi dung
            i++;
        }
        while(a[j] > a[mid]){ // khi a[j] khong dung vi tri thi dung
            j--;
        }
        
        if(i <= j){
            hoanVi(a[i], a[j]);
            i++;
            j--;
        }
    }
    if(left < right){
        quickSort(a, left, j);
        quickSort(a, right, i);
    }
    
}