#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <string.h>

int main(void)
{
    char s[1000];
    int t;

    scanf("%s", s);
    scanf("%d", &t);

    printf("%c", s[t - 1]);

    return 0;
}