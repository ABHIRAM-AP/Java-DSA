#include<stdio.h>
#include<ctype.h>

#define MAXSIZE 100
typedef struct 
{
    int stack[MAXSIZE];
    int top;
}Stack;

void initialize(Stack*);

void push(Stack *,int);

int pop(Stack *);

int evaluatePostfix(const char* exp)
{
    Stack A;
    initialize(&A);
    
    for(int i=0;exp[i]!='\0';i++)
    {
        if(isdigit(exp[i]))
        {
            push(&A, exp[i]-'0');
        }
         else if(exp[i]==' ')
    {
        continue;
    }
        else 
        {
            int n1=pop(&A);
            int n2=pop(&A);
            
            switch(exp[i])
            {
                case '+': push(&A,n2 + n1);
                break;
                
                case '-':push(&A,n2-n1);
                break;
                
                case '*':push(&A,n2*n1);
                break;
                
                case '/':push(&A, n2/n1);
                break;
                            
            }
        }
    }
    return pop(&A);
}
void push(Stack *s,int item)
{
    if((s->top)==MAXSIZE-1)
    {
        printf("Stack Overflow\n");
    }
    else{
        s->top++;
        s->stack[s->top] = item;
       // printf("%d\n",push->stack[push->top]);
    }
}

int pop(Stack *s)
{
     int item;
    if((s->top)==-1)
    {
        printf("Stack Underflow\n");
        return -1;
    }
   
    else
    {
         item = s->stack[s->top];
        s->top--;
       return item;
    }
}

void initialize(Stack* s)
{
    s->top=-1;
}

int main()
{
    char exp[MAXSIZE];
    printf("Enter postfix expression: ");
    scanf("%s",exp);
    
    int result = evaluatePostfix(exp);
    
    printf("Result = %d",result);
    return 0;
}