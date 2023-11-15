#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main(void)
{
    char s[100];

    scanf("%s", &s);
    for (int i = 0; i < strlen(s); i++) {
        if (s[i] >= 'A' && s[i] <= 'Z') {
            s[i] += 32;
        }
        else {
            s[i] -= 32;
        }
    }
    printf("%s", s);

    return 0;
}