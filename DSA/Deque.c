#include<stdio.h>
#define SIZE 5

typedef struct
{
    int a[SIZE];
    int front,rear;
}DQ;
void initializeQueue(DQ*);
void initializeQueue(DQ* q)
{
    q->front = -1;
    q->rear = -1;
}

void enqueue(DQ*,int);
void enqueue(DQ* q,int item)
{
     if(q->front == -1 && q->rear == -1)
    {
        q->front = q->rear = 0;
        q->a[q->rear]=item;
    }
    else if((q->rear+1)%SIZE == q->front)
    {
        printf("Queue is full\n");
    }
    
    else 
    {
        q->rear=(q->rear+1)%SIZE;
        q->a[q->rear]=item;
        
    }
}

void dequeue(DQ*);
void dequeue(DQ* q)
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
         q->front = (q->front+1)%SIZE;
     }
}

void inject(DQ*,int);
void inject(DQ* q,int item)
{
    //front--;
    if((q->front == 0 && q->rear == SIZE -1 ) || q->front==q->rear+1)
    {
        printf("Queue is full\n");
    }
    else if(q->front == -1)
    {
        q->front=q->rear=0;
       
    }
    else if(q->front == 0)
    {
        q->front=SIZE -1;
         q->a[q->front]=item;
    }
    else
    {
        q->front--;
         
    }
 q->a[q->front]=item;
}

void eject(DQ*);
void eject(DQ*q)
{   
    int item=0;
    if(q->front == -1 && q->rear == -1)
     {
         printf("Queue is empty\n");
     }
     else if(q->front == q->rear)
     {
        item=q->a[q->rear];
        q->front = q->rear = -1;
           printf("%d\n",item);
     }
     else if(q->rear ==0)
     {  
         item=q->a[q->rear];
         q->rear = SIZE-1;
         printf("%d\n",item);
     }
     else 
     {
          item=q->a[q->rear];
          q->rear--;
          printf("%d\n",item);
     }
}

void display(DQ*);
void display(DQ*q)
{
  

    if (q->front == -1 && q->rear == -1) {
        printf("Queue is empty\n");
    } else {
        int i = q->front;
        printf("Queue elements: ");
        while (1) {
            printf("%d ", q->a[i]);
            if (i == q->rear) break; // Stop if we have reached the rear element
            i = (i + 1) % SIZE; // Move to the next element
        }
        printf("\n");
    }
}


int main()
{
   DQ q;
  initializeQueue(&q);
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


