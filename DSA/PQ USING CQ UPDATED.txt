#include <stdio.h>
#define SIZE 100

typedef struct
{
    int front, rear;
    int a[SIZE];
    int p[SIZE];
} PQ;


void sort(PQ*);
void sort(PQ* q)
{
    int temp_items=0,temp_priority=0;

    for(int i=q->front;i<=q->rear;i=(i+1)%SIZE)
    {
        for (int j = q->front; j < q->rear;j=(j+1)%SIZE)
        {
            if(q->p[j] > q->p[j+1])
            {
                temp_items=q->a[j];
                q->a[j]=q->a[j+1];
                q->a[j+1]=temp_items;
                
                
                temp_priority=q->p[j];
                q->p[j]=q->p[j+1];
                q->p[j+1]=temp_priority;
            }
        }
    }
}



void initialise(PQ*);
void initialise(PQ* q)
{
    q->front=q->rear = -1;
}

void enqueue(PQ* ,int ,int);
void enqueue(PQ* q,int item ,int priority)
{
    if(q->front == -1 && q->rear ==-1)
    {
        q->front= q->rear =0;
        q->a[q->rear]=item;
        q->p[q->rear]=priority;
        
    }
    else if((q->rear+1)%SIZE == q->front)
    {
        printf("Queue Overflow\n");
    }
    else
    {
         q->rear=(q->rear+1)%SIZE;
          q->a[q->rear]=item;
          q->p[q->rear]=priority;
    }
    sort(q);
}

    



void dequeue(PQ*);
void dequeue(PQ* q)
{   
  //  sort(q);
    int item,priority;
    if(q->front==-1)
    {
        printf("Queue is empty\n");
    }
    else if(q->front == q->rear)
    {
         item=q->a[q->front];
         priority=q->p[q->front];
         q->front=q->rear =-1;
        printf("%d \t %d\n",item,priority);
    }
     else
    {
        item=q->a[q->front];
        priority=q->p[q->front];
         q->front = (q->front+1)%SIZE;
        printf("%d \t %d\n",item, priority);
    }
}

void display(PQ*q);
void display(PQ*q)
{
    if (q->front == -1)
    {
        printf("Queue is empty\n");
    }
    else
    {
        int i;
        for (i = q->front; ; i = (i + 1) % SIZE)
        {
            printf("%d \t %d \n", q->a[i],q->p[i]);
            if (i == q->rear)
                break;
        }
    }
}



int main()
{
    PQ q;
    
    initialise(&q);
    char op=' ';
    int item=0,priority =0 ;
    while(op!='4')
    {
        printf("Enter operation to be done \n 1-> Enqueue \t 2->Dequeue \t 3-> Display \t 4-> Exit :");
        scanf(" %c",&op);
        
        switch(op)
        {
            case '1':
            printf("Enter the item and its priority:");
            scanf("%d%d",&item , &priority);
            enqueue(&q,item,priority);
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