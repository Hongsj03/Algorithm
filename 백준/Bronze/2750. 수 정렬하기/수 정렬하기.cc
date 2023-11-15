#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int N, temp, ary[1000] = { 0 };

    scanf("%d", &N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &ary[i]);
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N - i - 1; j++) {
            if (ary[j] > ary[j + 1]) {
                temp = ary[j];
                ary[j] = ary[j + 1];
                ary[j + 1] = temp;
            }
        }
    }
    for (int i = 0; i < N; i++) {
        printf("%d\n", ary[i]);
    }


    return 0;
}