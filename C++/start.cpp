#include <iostream>
using namespace std;

int add(int a, int b){
    return a + b;
}

int main(int argc, char const *argv[])
{
    cout<<"Nhap Do Dai Mang" <<endl;
    int a = 3, b = 5, c;
    c = add(a, b);
    cout << c;
    return 0;
}







