#include <iostream>
using namespace std;

bool linearSearch(int *arr, int size, int element)
{

    for (int i = 0; i < size; i++)
    {
        if (arr[i] == element)
        {
            return true;
        }
    }

    return false;
}

int main()
{

    int arr[] = {2, 9, 6, 7, 4, 12, 15};
    int size = 7;
    int element = 152;

    bool answer = linearSearch(arr, size, element);

    if (answer)
        cout << "Element found " << endl;
    else
        cout << "Element not found " << endl;

    return 0;
}