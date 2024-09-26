#include<stdio.h>
#include<stdlib.h>

struct Node{
    int power;
    int coeff;
    struct Node *next;
};

struct Node *GetNode();
struct Node *GetNode()
{
    struct Node *N=(struct Node *)malloc(sizeof(struct Node));
    return N;
}

struct Node *Read(struct Node*);
struct Node *Read(struct Node* head)
{
    int power=0,coefficient=0;
    int nodes_1=0;
    struct Node *newNode,*temp;
    scanf("%d",&nodes_1);
    
        for(int i=0;i<nodes_1;i++)
        {
           printf("Enter the coefficient & power of term %d: ",i+1);
            scanf("%d%d",&coefficient,&power);
            
             newNode=GetNode();
             if(newNode==NULL)
             {
                 printf("Failed\n");
             }
            newNode->power=power;
            newNode->coeff=coefficient;
            newNode->next=NULL;
        
        if(head==NULL)
        {
            head=newNode;
            temp=head;
        }
        else{
            temp->next=newNode;
            temp=newNode;
        }
    }
    return head;
}


struct Node *Add(struct Node*head1,struct Node*head2)
{
    struct Node *t1=head1;
    struct Node *t2=head2;
    struct Node *t3=NULL;
    struct Node *newNode,*p3;
    while(t1!=NULL && t2!=NULL)
    {
        newNode=GetNode();
        newNode->next=NULL;

        if(t1->power == t2->power)
        {
            newNode->coeff = t1->coeff + t2->coeff;
            newNode->power=t1->power;
            t1=t1->next;
            t2=t2->next;
        }
        else if(t1->power > t2->power)
        {
            newNode->coeff = t1->coeff;
            newNode->power=t1->power;
            t1=t1->next;
        }
        else
        {
            newNode->coeff = t2->coeff;
            newNode->power=t2->power;
            t2=t2->next;
        }
        if(t3==NULL)
        {
            t3=newNode;
            p3=t3;
        }
         else{
         t3->next=newNode;
         t3=newNode;
            }
}
            while(t1!=NULL)
            {
            newNode=GetNode();
            newNode->coeff = t1->coeff;
            newNode->power=t1->power;
            t1=t1->next;
            t3->next=newNode;
            t3=newNode;
            }
           while(t2!=NULL)
            {
            newNode=GetNode();
            newNode->coeff = t2->coeff;
            newNode->power=t2->power;
            t2=t2->next;
            t3->next=newNode;
            t3=newNode;
            } 
   return p3;
}

struct Node *sort(struct Node *p3)
{
    if (p3 == NULL) return NULL;

    struct Node *temp;
    int swapped;

    do {
        swapped = 0;
        temp = p3;

        while (temp->next != NULL) {
            if (temp->power < temp->next->power) {
        
                int change1 = temp->power;
                temp->power = temp->next->power;
                temp->next->power = change1;

                int change2 = temp->coeff;
                temp->coeff = temp->next->coeff;
                temp->next->coeff = change2;

                swapped = 1;
            }
            temp = temp->next;
        }
    } while (swapped);

    return p3;
}


struct Node *addTerm(struct Node*,int,int);
struct Node *addTerm(struct Node*result,int coeff,int power)
{
    struct Node *newNode = GetNode();
    newNode->coeff = coeff;
    newNode->power = power;
    newNode->next = NULL;
    
    if (result == NULL) {
        return newNode;
    }
      struct Node *temp = result, *prev = NULL;
     while (temp != NULL && temp->power > power) {
        prev = temp;
        temp = temp->next;
    }
     if (temp != NULL && temp->power == power) {
        temp->coeff += coeff;
        free(newNode); 
    } else {
        // Insert newNode at the correct position
        if (prev == NULL) {
            newNode->next = result;
            result = newNode;
        } else {
            prev->next = newNode;
            newNode->next = temp;
        }
    }
    
    return result;
}

struct Node *multiPoly(struct Node *,struct Node*);
struct Node *multiPoly(struct Node *head1, struct Node *head2) {
    struct Node *result = NULL;
    struct Node *t1 = head1, *t2 = NULL;
    
    while (t1 != NULL) {
        t2 = head2;
        while (t2 != NULL) {
            
            int coeff_pro = t1->coeff * t2->coeff;
            int power_add = t1->power + t2->power;

            result = addTerm(result, coeff_pro, power_add);
            t2 = t2->next;
        }
        t1 = t1->next;
    }
    return result;
}


void display(struct Node*);
void display(struct Node *head)
{
    struct Node*ptr=head;
        if(ptr!=NULL)
        {
            while(ptr!=NULL)
            {
                printf("%d x^%d\t",ptr->coeff,ptr->power);
                ptr=ptr->next;
             if(ptr != NULL)
                printf(" + ");
              
        
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
 
  
    
    int option=0;
    while(option!=3)
    {
    struct Node *head1=NULL,*head2=NULL,*head3=NULL;

printf("Enter the option\n1->Addition\n2-> Multiplication \n3->Exit");
    scanf("%d",&option);
    
    switch(option)
    {
        case 1:
         printf("Enter no: of terms in first polynomial:");
    head1=Read(head1);
    printf("Enter no: of terms in second polynomial:");
    head2=Read(head2);
        head3=Add(head1,head2);
        head3=sort(head3);
         display(head3);
        break;
        
        case 2:
             printf("Enter no: of terms in first polynomial:");
        head1=Read(head1);
        printf("Enter no: of terms in second polynomial:");
        head2=Read(head2);
            head3=multiPoly(head1,head2);
            display(head3);
            break;
            
        case 3:
        printf("Exited\n");
        break;
    }
    }
    return 0;
}