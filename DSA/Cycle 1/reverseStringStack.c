## Code is wrong.


#include<stdio.h>
#define MAXSIZE 5

typedef struct{
    char stack[MAXSIZE];
    int top;
    char rev[MAXSIZE];
} Stack;



void reverseString(Stack*,const char *r);
void reverseString(Stack* s, const char *r)
{ 
    int length =0;
    int i=0;
    while(r[i]!='\0')
    {
        length++;
        i++;
    }
  
      if (length > MAXSIZE) {
        length = MAXSIZE;
    }
   for(i=0;i<length;i++)
    {
        s->rev[i]=r[length-i-1];
        
    }
    s->rev[length]='\0';
    
    for(int i=0;i<length;i++)
    {
    printf("%c",s->rev[i]);
    }
}

int main() {
    Stack A;
    A.top =-1;
    char r[MAXSIZE + 1];
   
    printf("Enter a string:");
    scanf("%5s",r);
    
    
  
    reverseString(&A,r);
    return 0;
}
