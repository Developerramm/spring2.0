#include <iostream>
using namespace std;

void countZeroAndOneInArray(int *arr, int size)
{

    int zero_count = 0;
    int one_count = 1;

    for (int i = 0; i < size; i++)
    {
        if (arr[i] == 0)
            zero_count++;

        if (arr[i] == 1)
            one_count++;
    }

    cout << "Zero count is " << zero_count << endl;
    cout << "One count is " << one_count << endl;
}

int main()
{

    int arr[] = {1, 0, 0, 0, 4, 1, 0, 1, 4, 0};
    int size = 10;

    countZeroAndOneInArray(arr, size);

    return 0;
}