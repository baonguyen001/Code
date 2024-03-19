#include <iostream>
using namespace std;

// n = 5 -> ( p = &n : gán địa chỉ n cho p ) *p -> chứa giá trị của n (*p = 5) 
// p địa chỉ của p
// &p địa chỉ của con trỏ p

void nhapMang(int a[], int n);
void xuatMang(int a[], int n);
void themPhanTu(int *&p, int &n);
void xoaNuaMang(int *&p, int &n);
void xoaMangTheoSoLuong(int *&p, int &n);
int main(int argc, char const *argv[])
{
    // int *p;
    // int n;
    // cout << "\nNhap so n phan tu";
    // cin >> n;
    // p = new int[n]; // khai báo cấp phát động
    // nhapMang(p, n);
    // xuatMang(p, n);
    // themPhanTu(p, n);
    // xuatMang(p, n);
    // // xoaNuaMang(p, n);
    // xoaMangTheoSoLuong(p, n);
    // xuatMang(p, n);

    int *p;
    int n = 5;
    p = &n;
    cout << *p;


    getchar();
    getchar();
    return 0;
}

void nhapMang(int a[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << "\na[" << i << "]=";
        cin >> a[i];
    }
}

void xuatMang(int a[], int n)
{
    cout<< "\nXuat Mang";
    for (int i = 0; i < n; i++)
    {
        cout << "\na[" << i << "]=" << a[i];
    }
}

void themPhanTu(int *&p, int &n)
{
    int soPhanTuCanThem;
    cout << "\nNhap So Phan Tu Can Them";
    cin >> soPhanTuCanThem;
    int newSize = n + soPhanTuCanThem;
    int *temp = new int[newSize]; // cấp bộ nhớ cho con trỏ temp

    for (int i = 0; i < n; i++)
    {
        *(temp + i) = *(p + i); // gán giá trị từ mảng cũ sang mảng mới
    }

    // gán mới
    for (int i = n; i < newSize; i++)
    {
        cout << "\na[" << i << "]=";
        cin >> *(temp + i);
    }

    // sau khi có mảng cáp phát động vs kích thước mới
    // xóa mảng cũ và cập nhập lại kích thước
    delete (p);
    p = temp;
    n = newSize;
}

void xoaNuaMang(int *&p, int &n){
    cout<< "Xoa Nua Mang";
    int soPhanTuMoi = n / 2;
    int *temp = new int[soPhanTuMoi];
    
    for(int i = 0; i< n; i++){   // gán phần tử mảng cũ cho mảng mới
        *(temp+i) = *(p + i); 
    }

    delete(p); //xóa mảng cũ
    p = temp;
    n = soPhanTuMoi;

}

void xoaMangTheoSoLuong(int *&p, int &n){

    int soPhanTuCanXoa;
    cout<< "Nhap so luong can xoa";
    cin >> soPhanTuCanXoa;

    int soPhanTuMoi = n - soPhanTuCanXoa;
    int *temp = new int[soPhanTuMoi];
    
    for(int i = 0; i< n; i++){   // gán phần tử mảng cũ cho mảng mới
        *(temp+i) = *(p + i); 
    }

    delete(p); //xóa mảng cũ
    p = temp;
    n = soPhanTuMoi;
}

