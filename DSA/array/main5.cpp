#include <iostream>
using namespace std;

int getMinimumNumberInArray(int *arr, int size)
{

    int minimumNumber = INT_MAX;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] < minimumNumber)
            minimumNumber = arr[i];
    }

    return minimumNumber;
}

int main()
{

    int arr[] = {2, 3, 8, 4, 99, 100, 32, 43};
    int size = 8;

    int result = getMinimumNumberInArray(arr, size);

    cout << result << endl;

    return 0;
}