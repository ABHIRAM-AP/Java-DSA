#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 20

struct Node{
    int data;
    struct Node *leftChild; 
    struct Node *rightChild; 
};

typedef struct {
    struct Node *a[MAXSIZE];
    int top;
}Stack;

typedef struct
{
    struct Node* a[MAXSIZE];
    int front;
    int rear;
}QUEUE;
struct Node *GetNode()
{
    struct Node *N=(struct Node*)malloc(sizeof(struct Node));
    return N;
}

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
int isEmpQ(QUEUE *q)
{
     if(q->front==-1  && q->rear==-1)
    {
       return 1;
    }
    else 
    {
        return 0;
    }
}

void push(Stack *stack, struct Node* item) {
    if (isFull(stack)) {
        printf("Stack Overflow\n");
    } else {
        stack->a[++stack->top] = item;
    }
}
struct Node *pop(Stack *stack) {
    if (isEmpty(stack)) {
        printf("Stack Underflow\n");
        return NULL;
    }
    return stack->a[stack->top--];
}

void enqueue(QUEUE *q,struct Node* item)
{
    if((q->rear) == MAXSIZE-1)
    {
        printf("Queue is full\n");
        exit(0);
    }
    else if(q->front==-1  && q->rear==-1)
    {
        q->front=q->rear=0;  
        q->a[q->rear]=item;  
    }
    else             
    {
          q->rear++;
          q->a[q->rear]=item;
    }
}
struct Node* dequeue(QUEUE *q)
{   
    struct Node* item;
    if(q->front==-1  && q->rear==-1)
    {
        printf("Queue is empty\n");
        return NULL;
    }

        item=q->a[q->front];
        if(q->front==q->rear)
         {  
        q->front=q->rear=-1;  
        }
         else
        {
            q->front++;
        }
        return item;
}
struct Node* Insert(struct Node*root,int data, QUEUE*q)
{
    struct Node *newNode=GetNode();
    newNode->data=data;
    newNode->leftChild=newNode->rightChild=NULL;
    
    if(root==NULL)
    {
        return newNode;
    }
    q->front = q->rear = -1;
    enqueue(q,root);
    while(1)
    {
        struct Node *node=dequeue(q);
        
        if(node->leftChild!=NULL && node->rightChild!=NULL)
        {
            enqueue(q,node->leftChild);
            enqueue(q,node->rightChild);
        }
        else if(node->leftChild==NULL)
        {
            node->leftChild=newNode;
            break;
        }
        else if(node->rightChild==NULL)
        {
            node->rightChild=newNode;
            break;
        }
    }
    return root;
}

void InOrder(struct Node *T) {
    if(T)
    {
        InOrder(T->leftChild);
        printf("%d ",T->data);
        InOrder(T->rightChild);
    }

}

void PostOrder(struct Node*T)
{
   if(T)
   {
      
       PostOrder(T->leftChild);
          PostOrder(T->rightChild);
          printf("%d ",T->data);
   }
    
}
void PreOrder(struct Node *T)
{
     if(T)
   {
      printf("%d ",T->data);
       PreOrder(T->leftChild);
          PreOrder(T->rightChild);
   }
}



int main()

{
       QUEUE q;
       q.rear=q.front=-1;
    
    struct Node *root=NULL;
    int option=0,data=0;
    while(option!=5)
    {
     printf("Enter the operation:\n1-Insert\n2-InOrder Traversal\n3-PostOrder\n4-PreOrder\n5-Exit:\n ");
        scanf("%d", &option);
    
    switch(option)
    {
        case 1:
        printf("Enter data:");
        scanf("%d",&data);
        root=Insert(root,data,&q);
         break;
         
         case 2:
         if (root == NULL) {
                    printf("Tree is empty.\n");
                } 
                else {
                    InOrder(root);
                }
                break;
                case 3:
                 if (root == NULL) {
                    printf("Tree is empty.\n");
                } 
                else {
                    PostOrder(root);
                }
                break;
                case 4:
                PreOrder(root);
                break;
    }
    }
    
}