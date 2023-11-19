#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
	int X, N, sum = 0;
	int a[1000] = { 0 };
	int b[1000] = { 0 };

	scanf("%d", &X);
	scanf("%d", &N);

	for (int i = 0; i < N; i++) {
		scanf("%d %d", &a[i], &b[i]);
	}
	for (int i = 0; i < N; i++) {
		sum += (a[i] * b[i]);
	}
	if (X == sum) {
		printf("Yes");
	}
	else {
		printf("No");
    }
	return 0;
}