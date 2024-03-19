#include <iostream>
#include <string>
using namespace std;

void push(int stack[], int x);
void pop(int stack[]);
int maxStack = 100;
int viTriDinh = -1;
void runStack(int stack[], char inputChar);
void runStackString(int stack[], string stringInput);
int main(int argc, char const *argv[])
{ 

    int stack[maxStack] = {0};
    runStackString(stack, "EAS*Y**QUE***ST***I*ON");



    getchar();

    return 0;
}

void push(int stack[], int x)
{

    if (viTriDinh >= maxStack - 1)
    {
        cout << "\n Stack Da Day";
    }
    else
    {
        viTriDinh++;
        stack[viTriDinh] = x;
    }
}

void pop(int stack[])
{

    if (viTriDinh < 0)
    {
        cout << "Stack Rong";
    }
    else
    {
        cout << (char)stack[viTriDinh] << " ";
        viTriDinh--;
    }
}

void runStack(int stack[], char inputChar)
{
    if (inputChar == 42)
    {
        pop(stack);
    }
    else
    {
        push(stack, inputChar);
    }
}

void runStackString(int stack[], string stringInput){
    for(int i = 0; i < stringInput.length(); i++){
        if(stringInput[i] == 42){
            pop(stack);
        }else{
            push(stack, stringInput[i]);
        }
    }
}