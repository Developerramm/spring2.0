#include <iostream>
using namespace std;

void printArray(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void reverseArray(int *arr, int size)
{

    int start = 0, end = size - 1;

    while (start < end)
    {
        swap(arr[start], arr[end]);
        start++;
        end--;
    }
}

int main()
{

    int arr[] = {10, 20, 30, 40, 50, 60};
    int brr[] = {10, 20, 30, 40, 50};
    int size1 = 6;
    int size2 = 5;

    printArray(arr, size1);
    printArray(brr, size2);

    reverseArray(arr, size1);
    reverseArray(brr, size2);

    printArray(arr, size1);
    printArray(brr, size2);

    return 0;
}