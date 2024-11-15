#include<stdio.h>

#define SIZE 10

typedef struct
{
    int a[SIZE],p[SIZE];
    int front,rear;
}PQ;



void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void selectionSort(PQ *q)
{
    int minIndex=0;
    for(int i=q->front;i!=q->rear;i=(i+1)%SIZE)
    {
        minIndex=i;
        for(int j=(i+1)%SIZE;j!=q->rear;j=(j+1)%SIZE)
        {
            if(q->p[j]< q->p[minIndex])
            {
                minIndex=j;
            }
        }
        swap(&q->p[i],&q->p[minIndex]);
        swap(&q->a[i],&q->a[minIndex]);
    }
      swap(&q->p[q->rear],&q->p[minIndex]);
      swap(&q->a[q->rear],&q->a[minIndex]);
}

void enqueue(PQ *q,int item,int priority)
{
    if(q->front==-1 && q->rear==-1)
    {
        q->front=q->rear=0;
        q->a[q->rear]=item;
        q->p[q->rear]=priority;
    }
    else if(q->front==(q->rear+1)%SIZE)
    {
        printf("Queue is full\n");
    }
    else
    {
        q->rear=(q->rear+1)%SIZE;
         q->a[q->rear]=item;
        q->p[q->rear]=priority;
    }
    selectionSort(q);
}

int dequeue(PQ *q)
{
    
    int item=0;
    if(q->front ==-1 && q->rear==-1)
    {
        printf("Queue Underflow\n");
    }
    else
    {
         item=q->a[q->front];
        if(q->front == q->rear)
        {
            q->front=q->rear=-1;
        }
        else
        {
            q->front=(q->front+1)%SIZE;
        }
    }
        return item;
}


void display(PQ *q) {
    if (q->front == -1 && q->rear == -1) {
        printf("Queue is empty\n");
    } else {
        int i = q->front;
        while (i != q->rear) {
            printf("%d\t%d\n", q->a[i], q->p[i]);
            i = (i + 1) % SIZE;
        }
        printf("%d\t%d\n", q->a[q->rear], q->p[q->rear]);
    }
}


int main()
{
    PQ q;
    q.front=q.rear=-1;
    enqueue(&q,10,2);
    enqueue(&q,20,1);
    enqueue(&q,40,4);
    enqueue(&q,50,3);
    
    display(&q);
}