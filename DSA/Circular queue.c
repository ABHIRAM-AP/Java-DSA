#include<stdio.h>
#include<stdlib.h>

#define MAXSIZE 5

typedef struct 
{
    int a[MAXSIZE];
    int front,rear;
}QUEUE;

void initializeQueue(QUEUE* q);
void initializeQueue(QUEUE* q)
 {
    q->front = -1;
    q->rear = -1;
}
void enqueue(QUEUE*,int);
void enqueue(QUEUE* q,int item)
{
     if(q->front == -1 && q->rear == -1)
    {
        q->front = q->rear = 0;
        q->a[q->rear]=item;
    }
    else if((q->rear+1)%MAXSIZE == q->front)
    {
        printf("Queue is full\n");
    }
    
    else 
    {
        q->rear=(q->rear+1)%MAXSIZE;
        q->a[q->rear]=item;
        
    }
}

void dequeue(QUEUE*);
void dequeue(QUEUE* q)
{
  int item;
     if(q->front == -1 && q->rear == -1)
     {
         printf("Queue is empty\n");
     }
     else if(q->front == q->rear)
     {
        item=q->a[q->front];
        q->front = q->rear = -1;
           printf("%d\n",item);
     }
     else
     {  
           item=q->a[q->front];
             printf("%d\n",item);
         q->front = (q->front+1)%MAXSIZE;
     }
}

void display(QUEUE*);
void display(QUEUE*q)
{
  
    if(q->front==-1 && q->rear ==-1)
    {
        printf("Queue is empty\n");
    }
    else
    {
       /* while(i!=q->rear)
        {   
            printf("%d\n",q->a[i]);
            i=(i+1)%MAXSIZE;
        }*/
        for(int i=q->front;i<=(i+1)%MAXSIZE;i++)
        {
            printf("%d\n",q->a[i]);
        }
    }
}

int main()
{
    
    QUEUE q;
    
initializeQueue(&q);
  char ch=' ';
    while(ch!='4')
    {
        printf("\n1 for enqueue\t 2 for dequeue\t 3 for display \t 4) for exit\n");
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