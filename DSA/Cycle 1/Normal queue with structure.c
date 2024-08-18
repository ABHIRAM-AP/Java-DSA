#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 5
typedef struct
{
    int a[MAXSIZE];
    int front;
    int rear;
}QUEUE;

void enqueue(QUEUE *,int);
void dequeue(QUEUE *);
void display(QUEUE*);


void enqueue(QUEUE *q,int item)
{
    if((q->rear) == MAXSIZE-1)
    {
        printf("Queue is full\n");
        exit(0);
    }
    else if(q->front==-1  && q->rear==-1)
    {
        q->front=q->rear=0;  // ith zero ayitt set cheyuuna ahnu
        q->a[q->rear]=item;  //zero ayitt rear set cheythitt aa element angott enqueue cheyyanam
    }
    else             // evide queue already elements ondengil ulla condition ahnu
    {
          q->rear++;
          q->a[q->rear]=item;
    }
}

void dequeue(QUEUE *q)
{   
    int item;
    if(q->front==-1  && q->rear==-1)
    {
        printf("Queue is empty\n");
    }
    else if(q->front==q->rear)
    {   
         /* evida equal ayal aa spotile item assign cheyyan ahnu item variable .Also queue ile last element ahnu ath*/
        item=q->a[q->front];
        printf("%d\n",item);
        q->front=q->rear=-1;  
 /*ini elemnts illa.so front and rear should be assigned to -1 so that enqueue is possible*/
    }
    else
    {
        item=q->a[q->front];
        q->front++;
        printf("%d\n",item);
    }
}
void display(QUEUE*q)
{
     if(q->front==-1  && q->rear==-1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        for(int i=q->front;i<=q->rear;i++)
        {
            printf("%d\t",q->a[i]);
        }
    }
}

int main()
{   
    QUEUE q;
    q.front=-1;
    q.rear=-1;
    char ch=' ';
    while(ch!='4')
    {
        printf("\n1 for enqueue\t 2 for dequeue\t 3 for display\n");
        scanf(" %c",&ch);
        switch(ch)
        {
            case '1':
            int item=0;
            printf("Enter item:\n");
            scanf("%d",&item);
            enqueue(&q,item);
            break;
            
            case '2':
            dequeue(&q);
            break;
            
            case '3':
            display(&q);
            break;
        }
    }
    return 0;
}