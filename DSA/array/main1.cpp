#include <iostream>
using namespace std;

void printArray(int *arr, int size)
{

    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

void func(int *arr, int size)
{
    arr[0] = 10;
    arr[2] = 20;
    arr[3] = 30;
    arr[4] = 40;
    arr[5] = 50;

    printArray(arr, size);
}

int main()
{

    int arr[] = {1, 2, 3, 4, 5};
    int size = 5;

    printArray(arr, size);
    cout << endl;
    func(arr, size);

    return 0;
}