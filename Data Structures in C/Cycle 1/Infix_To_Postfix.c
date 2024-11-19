#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>

#define SIZE 100

int stack[SIZE];
char infix[SIZE], postfix[SIZE];
int top = -1;

void push(int value)
{
    if (top == SIZE - 1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        top++;
        stack[top] = value;
    }
}

int pop()
{
    if (top == -1)
    {
        printf("Stack Underflow\n");
        return -1; // Return an invalid value
    }
    else
    {
        int item = stack[top];
        top--;
        return item;
    }
}

int isEmpty()
{
    return (top == -1);
}

int precedence(char symbol)
{
    switch (symbol)
    {
    case '^':
        return 3;
    case '*':
    case '/':
        return 2;
    case '+':
    case '-':
        return 1;
    default:
        return 0;
    }
}

void inToPost()
{
    char symbol;
    int i = 0, j = 0;
    while (infix[i] != '\0')
    {
        symbol = infix[i];

        if (symbol == ' ' || symbol == '\n')
        {
            i++;
            continue;
        }
        if (isdigit(symbol) || isalpha(symbol))
        {
            postfix[j++] = symbol; // Directly append operand to postfix
        }
        else
        {
            switch (symbol)
            {
            case '(':
                push(symbol);
                break;
            case ')':
                while (!isEmpty() && stack[top] != '(')
                {
                    postfix[j++] = pop();
                }
                pop(); // pop '('
                break;
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                while (!isEmpty() && precedence(stack[top]) >= precedence(symbol))
                {
                    postfix[j++] = pop();
                }
                push(symbol);
                break;
            default:
                printf("Invalid Character\n");
                return;
            }
        }
        i++;
    }

    while (!isEmpty())
    {
        postfix[j++] = pop();
    }
    postfix[j] = '\0';
}

int eval()
{
    int a, b, i;
    int variables[26] = {0}; // Store values for variables 'a' to 'z'
    char var;
    for (i = 0; postfix[i] != '\0'; i++)
    {
        if (isalpha(postfix[i])) // Operand is a variable
        {
            var = postfix[i];
            if (variables[var - 'a'] == 0) // If variable not yet assigned
            {
                printf("Enter value for %c: ", var);
                scanf("%d", &variables[var - 'a']);
            }
            push(variables[var - 'a']);
        }
        else if (isdigit(postfix[i])) // Operand is a number
        {
            push(postfix[i] - '0'); // Convert char digit to integer
        }
        else
        {
            a = pop();
            b = pop();
            switch (postfix[i])
            {
            case '+':
                push(b + a);
                break;
            case '-':
                push(b - a);
                break;
            case '*':
                push(b * a);
                break;
            case '/':
                push(b / a);
                break;
            case '^':
                push((int)pow(b, a));
                break;
            default:
                printf("Invalid operator\n");
                break;
            }
        }
    }
    return pop(); // Return the final result
}

int main()
{
    int res = 0;
    printf("Enter infix expression: ");
    fgets(infix, SIZE, stdin);
    
    int i = 0;
    inToPost();
    
    printf("Postfix Expression: ");
    while (postfix[i] != '\0')
    {
        printf("%c\t", postfix[i]);  // Corrected this line to use %c instead of %s
        i++;
    }
    printf("\n");
    
    res = eval();
    printf("Result = %d\n", res);

    return 0;
}
