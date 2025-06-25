#include <iostream>
#include <math.h>
using namespace std;

int areaOfCircle(int radius)
{

    int area = radius * radius * 22 / 7;

    return area;
}

int main()
{
    int radius;

    cout << "Enter radius of circle " << endl;
    cin >> radius;

    int area = areaOfCircle(radius);
    cout << area << endl;

    return 0;
}