#include <iostream>
using namespace std;

int getMaximumNumberInArray(int *arr, int size)
{
    int maximumNumber = INT_MIN;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] > maximumNumber)
            maximumNumber = arr[i];
    }

    return maximumNumber;
}

int main()
{

    int arr[] = {2, 3, 8, 4, 99, 100, 32, 43};
    int size = 8;

    int result = getMaximumNumberInArray(arr, size);

    cout << result << endl;

    return 0;
}