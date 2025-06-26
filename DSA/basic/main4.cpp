#include <iostream>
using namespace std;

int main()
{

    cout << "Enter a integer number : " << endl;
    int number;
    cin >> number;

    bool answer = number % 2;

    if (answer)
    {
        cout << "Odd number " << endl;
    }
    else
    {
        cout << "Even number " << endl;
    }

    return 0;
}