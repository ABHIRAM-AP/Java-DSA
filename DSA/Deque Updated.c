#include<stdio.h>
#define SIZE 10

typedef struct
{
    int front,rear;
    int a[SIZE];
}DQ;
int isFull(DQ*q);
int isFull(DQ*q)
{
    return(q->front == (q->rear+1)%SIZE ? 1: 0);
}
int isEmpty(DQ *q);
int isEmpty(DQ *q)
{
    return ((q->front ==-1 && q->rear == -1)? 1: 0);
    
}
void initialise(DQ*);
void initialise(DQ* q)
{
    q->front = q->rear = -1;
}

void enqueue(DQ*,int);
void enqueue(DQ*q,int item)
{
    if(isFull(q))
    {
        printf("Queue is full\n");
        return ;
    }
  else if(q->front == -1 && q->rear == -1)
    {
        q->front = q->rear = 0;
      
    }
    else{
        q->rear = (q->rear+1)%SIZE;
    }
      q->a[q->rear]=item;
}

void dequeue(DQ*);
void dequeue(DQ*q){
    int item=0;
    if(isEmpty(q))
    {
        printf("Queue is empty\n");
        return;
    }
        item = q->a[q->front];
    if(q->front == q->rear)
    {
       
        q->front = q->rear =-1;
    }
    else
    {
        q->front = (q->front+1)%SIZE;
    }
   //  printf("F=%d \t R=%d\n",q->front,q->rear);
     printf("%d\n",item);
}

void inject(DQ*,int);
void inject(DQ* q,int item)
{
    if(isFull(q))
    {
        printf("Queue is full\n");
        return;
    }
    else if(q->front==-1 && q->rear == -1)
    {
        q->front = q->rear =0;
        q->a[q->front]= item;
    }
    else if(q->front ==0)
    {
        q->front = SIZE-1;
        q->a[q->front]= item;
    }
    else
    {
        q->front--;
         q->a[q->front]= item;
    }
}

void eject(DQ*);
void eject(DQ* q)
{
    int item=0;
    if(isEmpty(q))
    {
        printf("Queue is empty\n");
        return;
    }
    item = q->a[q->rear];
    if(q->front == q->rear)
    {
        q->front = q->rear =-1;
    }
   else if(q->rear ==0)
   {
       q->rear = SIZE-1;
   }
   else
   {
       q->rear --;
   }
   printf("%d\n",item);
}

void display(DQ*);
void display(DQ*q)
{
    if(isEmpty(q))
    {
        printf("Queue is empty\n");
        return;
    }
    else 
    {
        int i;
        for (i = q->front; ; i = (i + 1) % SIZE)
        {
            printf("%d\n", q->a[i]);
            if (i == q->rear)
                break;
        }
    }
}
int main()
{
    DQ q;
    initialise(&q);
     int item=0;
 char ch=' ';
    while(ch!='6')
    {
        printf("\n1->for enqueue\t 2->for dequeue\t 3->for inject \t 4-> eject\t 5-> display\t 6-> exit:\n");
        scanf(" %c",&ch);
        switch(ch)
        {
            case '1':

            printf("Enter item:\n");
            scanf("%d",&item);
            enqueue(&q,item);
            break;
            case '2':
            dequeue(&q);
            break;
            
            case '3':
            printf("Enter item:\n");
            scanf("%d",&item);
            inject(&q,item);
            break;
            
         case '4':
            eject(&q);
            break;
            
            case '5':
            display(&q);
            break;
        }
    }
    
return 0;
}
