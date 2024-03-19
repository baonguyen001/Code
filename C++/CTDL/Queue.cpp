#include<iostream>
#include<string>
using namespace std;

/*
    hàm enqueue
    dequeue
*/

int maxQueue = 5;
int viTriDau = 0;
int viTriCuoi = 0;
int soPhanTuQueue = 0;

void enqueue(int queue[], int x);
void dequeue(int queue[]);
void runQueue(int queue[], string inputString);

int main(int argc, char const *argv[])
{
    int queue[maxQueue] = {};
    runQueue(queue, "EAS*Y**QUE***ST***I*ON");

    getchar();
    
    return 0;
}

void enqueue(int queue[], int x){
    if(soPhanTuQueue > maxQueue - 1){
        cout << "Queue Day";
    }else{
        viTriCuoi++;
        queue[viTriCuoi] = x;
        soPhanTuQueue++;
    }
}

void dequeue(int queue[]){
    if(soPhanTuQueue <= 0){
        cout << "Queue Rong";
    }else{
        cout << (char)queue[viTriCuoi] << " ";
        viTriCuoi--;
        if(viTriCuoi > maxQueue - 1){
            viTriCuoi = 0;
        }
        soPhanTuQueue--;
    }
}

void runQueue(int queue[], string inputString){
    for(int i = 0; i < inputString.length(); i++){
        if(inputString[i] == 42){
            dequeue(queue);
        }else{
            enqueue(queue, inputString[i]);
        }
    }
}