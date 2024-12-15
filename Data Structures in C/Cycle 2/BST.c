#include<stdio.h>
#include<stdlib.h>

typedef struct BST
{
    int data;
    struct BST *LC, *RC;
} BST;

BST *GetNode()
{
    BST *n = (BST *)malloc(sizeof(BST));
    return n;
}

BST *insertBST(BST *root, int data)
{
    BST *ptr1 = NULL, *ptr = root;
    BST *newNode = GetNode();
    newNode->data = data;
    newNode->LC = newNode->RC = NULL;

    if (root == NULL)
        return newNode;

    while (ptr != NULL)
    {
        ptr1 = ptr;

        if (data < ptr->data)
        {
            ptr = ptr->LC;
        }
        else if (data > ptr->data)
        {
            ptr = ptr->RC;
        }
        else
        {
            printf("Exists\n");
            return root;
        }
    }

    if (data < ptr1->data)
    {
        ptr1->LC = newNode;
    }
    else
    {
        ptr1->RC = newNode;
    }

    return root;
}

BST *searchBST(BST *root, int data)
{
    BST *ptr = root;
    while (ptr != NULL)
    {
        if (data < ptr->data)
            ptr = ptr->LC;
        else if (data > ptr->data)
            ptr = ptr->RC;
        else
            return ptr;
    }
    return NULL;
}

BST *SUCC(BST *ptr)
{
    BST *ptr3 = ptr->RC;
    while (ptr3 != NULL && ptr3->LC != NULL)
    {
        ptr3 = ptr3->LC;
    }
    return ptr3;
}

BST *deleteBST(BST *root, int data, int *del)
{
    BST *ptr = root, *parent = NULL;

    // Find the node to delete
    while (ptr != NULL && ptr->data != data)
    {
        parent = ptr;
        if (data < ptr->data)
            ptr = ptr->LC;
        else
            ptr = ptr->RC;
    }

    if (ptr == NULL)
    {
        printf("Not found\n");
        return root;
    }

    *del = ptr->data;

    // Case 1: Node has no children
    if (ptr->LC == NULL && ptr->RC == NULL)
    {
        if (ptr == root)  // If it's the root node
            root = NULL;
        else if (parent->LC == ptr)
            parent->LC = NULL;
        else
            parent->RC = NULL;
        free(ptr);
    }
    // Case 2: Node has one child
    else if (ptr->LC == NULL || ptr->RC == NULL)
    {
        BST *child = ptr->LC != NULL ? ptr->LC : ptr->RC;
        if (ptr == root)  // If it's the root node
            root = child;
        else if (parent->LC == ptr)
            parent->LC = child;
        else
            parent->RC = child;
        free(ptr);
    }
    // Case 3: Node has two children
    else
    {
        // Use the SUCC function to find the in-order successor
        BST *succ = SUCC(ptr);

        // Replace current node's data with the successor's data
        ptr->data = succ->data;

        // Remove the successor node
        if (ptr->RC == succ)
            ptr->RC = succ->RC;  // Successor is directly in the right subtree
        else
        {
            // Find the parent of the successor (already handled by SUCC)
            BST *succParent = ptr->RC;
            while (succParent->LC != succ)
                succParent = succParent->LC;

            succParent->LC = succ->RC;  // Successor's parent now points to its right child
        }

        free(succ);
    }

    return root;
}

void InOrder(BST *root)
{
    if (root)
    {
        InOrder(root->LC);
        printf("%d\t", root->data);
        InOrder(root->RC);
    }
}

int main()
{
    BST *root = NULL;
    int del = 0;

    // Insert elements into the BST
    root = insertBST(root, 20);
    root = insertBST(root, 10);
    root = insertBST(root, 30);
    root = insertBST(root, 5);
    root = insertBST(root, 15);

    // Delete node 10 and print the tree
    root = deleteBST(root, 10, &del);

    // In-order traversal
    InOrder(root);
    return 0;
}
