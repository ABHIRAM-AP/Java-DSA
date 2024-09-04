#include<stdio.h>
#include<stdlib.h>


struct Node
{
    int data;
    struct Node*next;
};


struct Node* GetNode();
struct Node* GetNode()
{
    struct Node *N = (struct Node*)malloc(sizeof(struct Node));
    return N;
}

struct Node *InsertFront(struct Node* , int );
struct Node *InsertFront(struct Node* head, int data)
{
   struct Node* newNode = GetNode();
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


struct Node *InsertRear(struct Node *,int);
struct Node *InsertRear(struct Node *head,int data)
{
    struct Node *newNode = GetNode();
    if(newNode ==NULL)
    {
        printf("Insufficient Memory\n");
    }
    else if(head==NULL)
    {
         newNode->data=data;
        newNode->next=NULL;
        head=newNode;
    }
    else
    {
        struct Node *ptr=head;
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        newNode->data=data;
        newNode->next=NULL;
        ptr->next=newNode;
    }
    return head;
}

struct Node *InsertRandom(struct Node*,int,int);
struct Node *InsertRandom(struct Node *head,int key,int data)
{
    struct Node *ptr, *newNode;
    newNode = GetNode();
    if(newNode == NULL)
    {
        printf("Insufficient Memory\n");
    }
    else 
    {
        ptr = head;
        while(ptr->data!=key && ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        if(ptr->data ==key)
        {
            newNode->data = data;
            newNode->next = ptr->next;
            ptr->next=newNode;
        }
        else
        {
            newNode->data = data;
            newNode->next = NULL;
            ptr->next=newNode;
        }
    }
    return head;
}

struct Node *DeleteFront(struct Node*,int *);
struct Node *DeleteFront(struct Node *head,int *deleted_Item){
    struct Node *ptr;
    
    if(head==NULL)
    {
        printf("Empty List\n");
    }
    else
    {
        ptr=head;
        head=ptr->next;
        *deleted_Item= ptr->data;
        free(ptr);
    }
    return head;
    
}


struct Node *DeleteRear(struct Node *,int *);
struct Node *DeleteRear(struct Node *head,int *deleted)
{
    struct Node *ptr1, *ptr;
    if (head == NULL)
    {
        printf("Empty List\n");
        return NULL;
    }
    else if (head->next == NULL)
    {
         *deleted=head->data;
        free(head);  
        return NULL; 
    }
    else
    {
        ptr = head;
        
        while (ptr->next != NULL)
        {
            ptr1 = ptr;
            ptr = ptr->next;
        }
        *deleted=ptr->data;
        ptr1->next = NULL;
        free(ptr); // Free the last node
    }
    return head; // Return the modified list's head
}

struct Node *DeleteRandom(struct Node*,int*,int);
struct Node *DeleteRandom(struct Node* head,int *deleted,int key)
{
   struct Node *ptr = head;

   
    if (head == NULL) {
        printf("List is empty\n");
        *deleted = -1;
        return head;
    }

    // Traverse the list to find the node with the given key
    while (ptr != NULL && ptr->data != key) {
        ptr = ptr->next;
    }

    if (ptr != NULL && ptr->next != NULL) {
        struct Node *temp = ptr->next;  // Node to be deleted
        *deleted = temp->data;          // Store the data of the node to be deleted
        ptr->next = temp->next;         // Bypass the deleted node
        free(temp);                     // Free the memory of the deleted node
    } 
    else {
        
        printf("No node to delete after the key\n");
        *deleted = -1;  
    }

    return head;
}




void display(struct Node*);
void display(struct Node *head)
{
    struct Node*ptr;
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
    int option=0,item=0,deleted_Item=0,key=0;
   
   struct Node *head=NULL;
   

  
    while(option!=8)
    {
         printf("Enter operation:\n1->Insert Front\n2->Insert Rear\n3->Insert Random\n4->Delete Front\n5->Delete Rear\n6->Delete Random\n7->Display List\n8->Exit\n");
    scanf("%d",&option);
    
    
    switch(option)
    {
        case 1:
            printf("Enter the item:");
            scanf("%d",&item);
            head=InsertFront(head,item);
        break;
        
        case 2:
            printf("Enter the item:");
            scanf("%d",&item);
            head=InsertRear(head,item);
            break;
            
        case 3:
            int data;
            printf("Enter the key:\n");
            scanf("%d",&key);
            printf("Enter the element to be added:");
            scanf("%d",&data);
            InsertRandom(head,key,data);
            break;
        case 4:
      
            head=DeleteFront(head,&deleted_Item);
            printf("%d\n",deleted_Item);
            break;
        
        case 5:
            
            head = DeleteRear(head,&deleted_Item);
            printf("%d\n",deleted_Item);
            break;
            
        case 6:
        printf("Enter the key:\n");
            scanf("%d",&key);
            head =DeleteRandom(head,&deleted_Item,key);
            if (deleted_Item != -1) {
                    printf("Deleted item: %d\n", deleted_Item);
                }
            break;
            
        case 7:
            display(head);
            break;
    }
    
    }
}