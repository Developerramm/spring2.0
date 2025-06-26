#include <iostream>
using namespace std;

void printArray(int *arr, int size)
{

    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
}

int main()
{

    int arr[] = {1, 2, 3, 5, 8, 29, 30};
    int size = 7;

    printArray(arr, size);

    return 0;
}