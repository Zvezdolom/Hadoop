#include <iostream>
#include <stdlib.h>
#include <time.h>

using namespace std;

int main() {
	srand (time(NULL));

	int value;

	char Array[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
	                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'
	               };


	for (int k = 0; k < (rand() % 150 + 40); k++) {
		for (int i = 0; i < (rand() % 20 + 1); i++) {
			cout << Array[(rand() % 25 + 0)];
		}
		cout << "\n";
	}


}
