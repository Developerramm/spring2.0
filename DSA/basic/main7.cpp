#include <iostream>
using namespace std;

void printAllPrimeNumber(int number)
{
    if (number == 1 || number == 2)
    {
        cout << number << endl;
        return;
    }

    bool flag = true;

    for (int i = 3; i <= number; i++)
    {
        for (int j = 2; j < i; j++)
        {
            if (i % j == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag)
            cout << i << " ";

        flag = true;
    }
    cout << endl;
}

int main()
{
    cout << "Enter a number : " << endl;
    int number;
    cin >> number;

    printAllPrimeNumber(number);

    return 0;
}