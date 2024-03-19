#include <iostream>
using namespace std;

void hoanVi(int &a, int &b);
void xuatMang(int a[], int n);
void selectionSort(int a[], int n);
void bubbleSort(int a[], int n);
void insertionSort(int a[], int n);
void insertionSort2(int a[], int n);


int main(int argc, char const *argv[])
{
    int n = 4;
    int a[] = {1, 3, 5, 7 , 4, 2, 8 ,6, 10, 9};
    int b[] = {20, 8, 5, 7 , 6, 2, 8 ,6, 2, 15};
    int c[] = {2, 1, 5, 4};

    // selectionSort(b, n);
    // bubbleSort(b, n);
    // insertionSort(a, n);
    insertionSort2(c, n);

    xuatMang(a, n);

    getchar();

    return 0;
}

void xuatMang(int a[], int n){
    
    for(int i = 0; i < n; i++){
        cout << "a[" << i << "]=" << a[i] << endl;
    }

}

void hoanVi(int &a, int &b){

    int temp = b;
    b = a;
    a = temp;

}

void selectionSort(int a[0], int n){

    for(int i = 0; i < n; i++){

        int min = a[i];

        for(int j = i + 1; j < n; j++){

            if(a[j] < min){
                hoanVi(a[j], min);
            }

        }

        a[i] = min;

    }

}
//20, 8, 5, 7 , 6, 2, 8 ,6, 2, 15
void bubbleSort(int a[], int n){

    for(int i = n; i >= 0; i--){

        for(int j = 0; j < i - 1; j++){
            if(a[j] > a[j+1]){
                hoanVi(a[j], a[j+1]);
            }
        }

    }

}

void insertionSort(int a[], int n){
    
    int i, key, j;
    for(i = 1; i < n; i++){

        key = a[i];
        j = i - 1;

        while(j >= 0 && a[j] > key){
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }

}

void insertionSort2(int a[], int n){

    int i, j, key;
    for(i = 1; i < n; i++){
//2, 1, 5, 4
        key = a[i];
        j = i - 1;

        while (j >= 0 && a[j] > key)
        {
            a[j + 1] = a[j];
            j--;
        }

        a[j + 1] = key;
        

    }

}


















