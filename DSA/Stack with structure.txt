#include<stdio.h>
#define MAXSIZE 5

typedef struct{
    int stack[MAXSIZE];
    int top;
} Stack;

// function prototypes
void Create(Stack *);
void Push(Stack *, int);
void Pop(Stack *);
void Display(Stack *);
int isFull(Stack*);
int isEmpty(Stack*);

int isFull(Stack *stack)
{
    if(stack->top == MAXSIZE -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int isEmpty(Stack *stack)
{
    if(stack->top == -1)
    {
        return 1;
    }
    else 
    {
        return 0;
    }
}

void Create(Stack *createStack) {
    createStack->top = -1;
}

void Push(Stack *push, int item) {
    if (isFull(push)) {
        printf("Stack Overflow\n");
    } else {
        push->top = push->top + 1;
        push->stack[push->top] = item;
    }
}

void Pop(Stack *pop) {
    int item;
    if (isEmpty(pop)) {
        printf("Stack Underflow\n");
    } else {
        item = pop->stack[pop->top];
        pop->top--;
        printf("Popped item: %d\n", item);
    }
}

void Display(Stack *display) {
    if (isEmpty(display)) {
        printf("Stack is empty\n");
    } else {
        for (int i = display->top; i >= 0; i--) {
            printf("%d\n", display->stack[i]);
        }
    }
}

int main() {
    Stack A;
    char op = ' ';
    int stackcreated = 0;  // Initialize stackcreated to 0 (false)
    
    while (op != '5') {
        printf("Enter operation\n 1->Create Stack \t 2->Push \t 3->Pop \t 4->Display \t 5->Exit:\n");
        scanf(" %c", &op);
        switch (op) {
            case '1':
                Create(&A);
                stackcreated = 1;  // Set stackcreated to 1 (true) after creating the stack
                printf("Stack created\n");
                break;
            
            case '2':
                if (!stackcreated) {
                    printf("Create a stack first\n");
                } else {
                    int item;
                    printf("Enter item:\n");
                    scanf("%d", &item);
                    Push(&A, item);
                }
                break;
            
            case '3':
                if (!stackcreated) {
                    printf("Create a stack first\n");
                } else {
                    Pop(&A);
                }
                break;
            
            case '4':
                if (!stackcreated) {
                    printf("Create a stack first\n");
                } else {
                    Display(&A);
                }
                break;
            
            case '5':
                printf("Exiting...\n");
                break;
            
            default:
                printf("Invalid operation\n");
        }
    }
    return 0;
}
