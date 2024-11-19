#include<stdio.h>

int a[10],top=-1,size=10;

void push(int item);
int pop();


void push(int item)
{
    if(top==size-1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        top++;
        a[top]=item;
    }
}

int pop()
{
    int item=0;
    if(top==-1)
    {
        printf("Stack Underflow\n");
        return -1;
    }
    else{
       item  = a[top];
        top--;
       
    }
     return item;
}

void display()
{
    if(top==-1)
    {
        printf("Stack is Empty\n");
    }
    else
    {
        for(int i=top;i>=0; i--)
        {
            printf("%d\n",a[i]);
        }
    }
}



int main()
{
    int choice=0;
    while(choice!=4)
    {
    printf("Enter the choice:\n1-> Push \n2-> Pop \n3-> Display:\n");
    scanf("%d",&choice);
    
    switch(choice)
    {
        case 1:
        int item=0;
        printf("Enter element to be pushed:");
        scanf("%d",&item);
        push(item);
        break;
        
        case 2:
        int result=0;
        result = pop(item);
        if(result!=-1)
        {
        printf("Popped Item:%d\n",result);
        }
        break;
        
        case 3:
        display();
        break;
    }
    
    }
    
}