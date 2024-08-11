#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAXSIZE 100

char stack[MAXSIZE],infix[MAXSIZE],postfix[MAXSIZE];
int top = -1;
void push(char);
void push(char symbol)
{
    if(top==MAXSIZE-1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        top++;
        stack[top]=symbol;
    }
}

char pop();
char pop()
{
    int item=0;
    if(top==-1)
    {
        printf("Stack Underflow\n");
       return '\0';
    }
    else{
       item  = stack[top];
        top--; // return stack[top--]
       
    }
     return item;
}

int isEmpty() {
    return top == -1;
}

int precedence(char symbol);
int precedence(char symbol)
{
    switch(symbol)
    {
        //Higher value , Higher the Precedence
        case '^':
        return 3;
        break;
        
        case '/':
        case '*':
        return 2;
        break;
        
        case '+':
        case '-':
        return 1;
        break;
        
        default:return 0;
    }
}


void InfixPostfix()
{
    char symbol;
    int popped_Item=0,i=0,j=0;
    for(i=0;infix[i]!='\0';i++)  //i< strlen(infix)
    {
        symbol = infix[i];
        
        if (symbol == ' ' || symbol == '\n') {
            continue; // Ignore spaces and newlines
        }
        switch(symbol)
        {
            case '(':
            push(symbol);
            break;
            
            case ')':
          //   popped_Item = pop();
                while(stack[top]!='(')
                {
                    postfix[j++] = pop();
                    //j++;
                }
                if(stack[top]=='(')
                {
                    pop();
                }
                break;
      case '+':
      case '-':
      case '/':
      case '*':
      case '^':          
while (!isEmpty() && precedence(stack[top]) >= precedence(symbol)) 
{
    postfix[j++] = pop();
}
push(symbol);

     break;
 
     default:
           postfix[j++] = symbol;
            break;
        }
    }
    
    //Pop all remaining elements 
    while(!isEmpty())
    {
        postfix[j++] = pop();
    }
    postfix[j]='\0';
}

int main()
{
    printf("Enter the infix expression:\n");
    fgets(infix,MAXSIZE,stdin);
    
    InfixPostfix();
    
     printf("Postfix expression: %s\n", postfix);
    
    return 0;
}