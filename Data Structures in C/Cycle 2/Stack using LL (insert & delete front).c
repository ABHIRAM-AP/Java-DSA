#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};

int isempty(struct Node*stack);
int isempty(struct Node*stack)
{
    if(stack==NULL)
    {
        return 1;
    }
    else{
        return 0;
    }
}
struct Node *GetNode();
struct Node *GetNode()
{
    struct Node *N = (struct Node*)malloc(sizeof(struct Node));
    return N;
}

struct Node *Push(struct Node* , int );
struct Node *Push(struct Node *head, int data)
{
   struct Node *newNode = GetNode();
    if(newNode == NULL)
    {
        printf("Insufficient Memory\n");
    }
    else
    {
        newNode->data=data;
        newNode->next=head;
        head=newNode;
    }
    return head;
}
struct Node *Pop(struct Node*,int *);
struct Node *Pop(struct Node *head,int *popped_Item){
    struct Node *ptr;
    
    if(isempty(head))
    {
        printf("Empty List\n");
        *popped_Item=-1;
    }
    else
    {
        ptr=head;
        head=ptr->next;
        *popped_Item= ptr->data;
        free(ptr);
    }
    return head;
}


void display(struct Node*);
void display(struct Node *head)
{
    struct Node *ptr;
        ptr=head;
        if(ptr!=NULL)
        {
            while(ptr!=NULL)
            {
                printf("%d\t",ptr->data);
                ptr=ptr->next;
            }
            printf("\n");
        }
            else
            {
                printf("Empty List\n");
            }
}



int main()
{
    struct Node *stack=NULL;
    int choice=0;
    
    while(choice!=4)
    {
    printf("Enter the operation:\n1->Push\n2-> Pop\n3->Display\n");
    
    scanf("%d",&choice);
    
    switch(choice)
        {
        case 1:
        int item=0;
        printf("Enter the item:");
        scanf("%d",&item);
        stack=Push(stack,item);
        break;
        
        case 2:
        int popped_Item=0;
        stack=Pop(stack, &popped_Item);
        if(popped_Item!=-1)
        {
        printf("Popped Item: %d\n",popped_Item);
        }
        break;
        
        case 3:
        display(stack);
        break;
        
        case 4:
        printf("Exited\n");
        break;
        
        default:
        printf("Invalid Operation\n");
        }
    }
    return 0;
}