#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void)
{
    char s[100];

    scanf("%s", &s);
    printf("%d", strlen(s));

    return 0;
}