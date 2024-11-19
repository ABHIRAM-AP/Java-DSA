#include<stdio.h>
#include<stdlib.h>

typedef struct BST
{
    int data;
    struct BST *leftChild,*rightChild;
}BST;

BST *GetNode()
{
    struct BST *N=(struct BST*)malloc(sizeof(struct BST));
    return N;
}

BST *insertBST(BST*root,int data)
{
    BST *newNode = GetNode();
    newNode->data = data;
   newNode->leftChild=newNode->rightChild=NULL;
   
   
    BST *ptr=root;
    BST *ptr1=NULL;

    while(ptr!=NULL)
    {
        ptr1=ptr;
        if(data <ptr->data)
        {
            ptr=ptr->leftChild;
        }
        else if(data > ptr->data)
        {
            ptr=ptr->rightChild;
        }
        else 
        {
            printf("Item Already Exists\n");
            return root;
        }
    }
    
    if(root==NULL)
    {
        return newNode;
    }   
        else if(data<ptr1->data)
        {
            ptr1->leftChild=newNode;
          
        }
        else
        {
             ptr1->rightChild=newNode;
        }
    
    return root;
}




BST *searchBST(BST *root, int data) {
    BST *ptr = root;

    while (ptr != NULL) {
        if (data < ptr->data) {
            ptr = ptr->leftChild; 
        } else if (data > ptr->data) {
            ptr = ptr->rightChild; 
        } else {
            return ptr; 
        }
    }
    return NULL; 
}



int main()
{
 BST *root=NULL;
 int option=0,data=0;

 while(option!=4)
 {
     printf("Enter choice:\n1-Insert\n2-Search\n3-Delete\n4-Exit:\n");
     scanf("%d",&option);
     
     switch(option)
     {
         case 1:
         printf("Enter data:");
         scanf("%d",&data);
         
         root=insertBST(root,data);
         break;
         
         case 2:
        printf("Enter data to search: ");
                scanf("%d", &data);
          BST *address=searchBST(root,data);
         if (address!= NULL) {
        printf("Item %d found at address %p.\n", address->data,address);
                } else {
                    printf("Item %d not found.\n", data);
                }
         break;
     }
 }
    
}