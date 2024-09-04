#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
    
};
struct Node *REAR=NULL;
struct Node *FRONT=NULL;

struct Node* GetNode();
struct Node* GetNode()
{
    struct Node *N = (struct Node*)malloc(sizeof(struct Node));
    return N;
}

struct Node *enqueue(struct Node* , int );
struct Node *enqueue(struct Node* head, int data)
{
    
   struct Node *newNode = GetNode();
   newNode->data=data;
   newNode->next=NULL;
   if(head == NULL)
   {
       head = newNode;
       FRONT=newNode;
       REAR = newNode;
   }
   else
   {
       REAR->next=newNode;
       REAR=newNode;
   }
   return head;
}

struct Node *dequeue(struct Node *, int*);
struct Node *dequeue(struct Node *head, int *deleted_Item)
{
    struct Node *ptr;
        if(head==NULL)
    {
        printf("Empty List\n");
        *deleted_Item= -1;
    }
    
    ptr=head;
    *deleted_Item= ptr->data;
    
    if(head->next ==NULL)
    {
        REAR=NULL;
        FRONT=NULL;
        free(ptr);
    }
    else
    {
        
        head=ptr->next;
        FRONT=head;
        free(ptr);
        return head;
    }
    //return head;

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
        }
            else
            {
                printf("Empty List\n");
            }
}



int main()
{
    struct Node *head=NULL;
    int choice=0;
    
    while(choice!=4)
    {
    printf("\nEnter the operation:\n1->Enqueue\n2->Dequeue\n3->Display\n");
    
    scanf("%d",&choice);
    
    switch(choice)
        {
        case 1:
        int item=0;
        printf("Enter the item:");
        scanf("%d",&item);
        head=enqueue(head,item);
        break;
        
        case 2:
        int deleted_Item=0;
        head = dequeue(head,&deleted_Item);
        if(deleted_Item!=-1)
        {
        printf("Dequeued Item: %d",deleted_Item);
        }
        break;
        
        case 3:
        display(head);
        break;
        }
    }
    return 0;
}