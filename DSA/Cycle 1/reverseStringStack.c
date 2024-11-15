#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define SIZE 100

typedef struct Stack
{
    char a[SIZE];
    int top;
}stack;

void push(stack *s,const char character)
{
    if(s->top==SIZE -1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        s->top++;
        s->a[s->top]=character;
    }
}
int isEmpty(stack *s)
{
    if(s->top==-1)
    {
        return 1;
    }
    else return 0;
}
char pop(stack *s)
{
    if(s->top==-1)
    {
        printf("Stack Underflow\n");
    }
    else
    {
        char character=s->a[s->top];
        s->top--;
         return character;
    }
   
}

void revString(char string[])
{
    stack s;
    s.top=-1;
    for(int i=0;i<strlen(string);i++)
    {
        push(&s,string[i]);
    }
    while(!isEmpty(&s))
    {
        char character=pop(&s);
        printf("%c",character);
    }
}

int main()
{
    char string[SIZE];
    printf("Enter a string:");
    scanf("%s",string);
    revString(string);
    return 0;
    
}