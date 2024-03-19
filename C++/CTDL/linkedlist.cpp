#include<iostream>
using namespace std;
struct Node
{
    int key;
    Node *next;
};

void adHead(Node *&pHead, int data);
Node *newNode(int data);
void getNode(Node *pHead);
void adLast(Node *&pHead, int data);
int main(int argc, char const *argv[])
{
    /*
    thêm phần từ (đầu , giữa cuối)
    duyệt danh sách
    xóa phần tử (đầu, giữa, cuối)
    truyê xuất dah sách
    xóa dnah sách(đầu, giữa, cuối)*/
    Node *pHead = NULL;
    adHead(pHead, 1);
    adHead(pHead, 2);
    getNode(pHead);
    adLast(pHead, 3);
    adLast(pHead, 4);
    getNode(pHead);

    getchar();
    getchar();


    return 0;
}

Node *newNode(int data){
    Node *temp = new Node;
    temp->key = data;
    temp->next = NULL;
    return temp;
}

void adHead(Node *&pHead, int data){
    Node *temp = newNode(data);
    if(pHead == NULL){
        pHead = temp;
    }else{
        temp->next = pHead;
        pHead = temp;
        
    }
}

void getNode(Node *pHead){
    while (pHead != NULL)
    {
        /* code */
        cout << "\n" << pHead->key;
        pHead = pHead->next;
    }
    
}

void adLast(Node *&pHead, int data){
    
    Node *temp = newNode(data);
    while (pHead->next != NULL)
    {
        pHead = pHead->next;
    }
    pHead->next = temp;
}