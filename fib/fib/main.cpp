/* 
 * File:   main.cpp
 * Author: Alex
 *
 * Created on September 2, 2013, 10:33 PM
 */

#include <iostream>

using namespace std;

int fibr(int n);
/*
 * 
 */
int main(int argc, char** argv) {
    cout << fibr(2000);
    return 0;
}

int fibr(int n) {
    if(n == 0) 
        return 1;
    if(n == 1)
        return 1;
    return (fibr(n-1)+fibr(n-2));
}

