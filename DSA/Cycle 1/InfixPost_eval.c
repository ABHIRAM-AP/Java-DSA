#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include<ctype.h>
#define MAXSIZE 100
char stack[MAXSIZE];
char infix[MAXSIZE], postfix[MAXSIZE];
int top = -1;

void push(char value);
char pop();
int isEmpty();
int precedence(char symbol);
void InfixPostfix();
int post_eval();

void push(char value) {
    if (top == MAXSIZE - 1) {
        printf("Stack Overflow\n");
    } else {
        top++;
        stack[top] = value;
    }
}

char pop() {
    char item = 0;
    if (top == -1) {
        printf("Stack Underflow\n");
        return '\0';
    } else {
        item = stack[top];
        top--;
    }
    return item;
}

int isEmpty() {
    return top == -1;
}

int precedence(char symbol) {
    switch (symbol) {
        case '^': return 3;
        case '*':
        case '/': return 2;
        case '+':
        case '-': return 1;
        default: return 0;
    }
}

void InfixPostfix() {
    char symbol;
    int popped_Item = 0, i = 0, j = 0;
    for (i = 0; infix[i] != '\0'; i++) {
        symbol = infix[i];
        
        if (symbol == ' ' || symbol == '\n') {
            continue; // Ignore spaces and newlines
        }
        
        if (isdigit(symbol)) {
            postfix[j++] = symbol;
        } else {
            switch (symbol) {
                case '(':
                    push(symbol);
                    break;
                case ')':
                    while (!isEmpty() && (popped_Item = pop()) != '(') {
                        postfix[j++] = popped_Item;
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    while (!isEmpty() && precedence(stack[top]) >= precedence(symbol)) {
                        postfix[j++] = pop();
                    }
                    push(symbol);
                    break;
                default:
                    // Handle invalid characters
                    printf("Invalid character: %c\n", symbol);
                    break;
            }
        }
    }
    
    // Pop all remaining elements
    while (!isEmpty()) {
        postfix[j++] = pop();
    }
    postfix[j] = '\0';
}

int post_eval() {
    int i, a, b;
    for (i = 0; postfix[i] != '\0'; i++) {
        if (isdigit(postfix[i])) {
            push(postfix[i] - '0');
        } else {
            a = pop();
            b = pop();
            switch (postfix[i]) {
                case '+': push(b + a); break;
                case '-': push(b - a); break;
                case '*': push(b * a); break;
                case '/': push(b / a); break;
                case '^': push((int)pow(b, a)); break;
                default:
                    printf("Invalid operator: %c\n", postfix[i]);
                    break;
            }
        }
    }
    return pop();
}

int main() {
    int result = 0;
    printf("Enter the infix expression:\n");
    fgets(infix, MAXSIZE, stdin);
    
    InfixPostfix();
    
    result = post_eval();
    printf("Postfix expression: %s\n", postfix);
    printf("Result = %d\n", result);
    
    return 0;
}
