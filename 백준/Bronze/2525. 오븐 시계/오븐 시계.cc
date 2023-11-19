#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void)
{
    int h=0, m=0;
    int cook=0;
    scanf("%d %d %d", &h,&m,&cook);
    
    h += cook / 60;
    m += cook % 60;
    
    if(m>=60) {
        ++h;
        m-=60;
    }
    if (h >= 24){
        h-=24;
    }
    printf("%d %d",h,m);
        
    return 0;
}