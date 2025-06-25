#include <iostream>
using namespace std;

int getSumOfOddNumber(int number)
{

    int sum = 0;

    for (int i = 1; i <= number; i = i + 2)
    {
        sum += i;
    }

    return sum;
}

int main()
{

    int n;
    cout << "Enter a number to get sum " << endl;
    cin >> n;

    int sum = getSumOfOddNumber(n);

    cout << sum << endl;

    return 0;
}