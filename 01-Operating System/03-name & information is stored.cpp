#include<iostream>
#include<stdio.h>
#include<string>
#include<conio.h>
int main()
{
    FILE *fptr;
    char name[20];
    int age;
    float salary;
    fptr=fopen("emp.txt","w");
    if(fptr==NULL)
    {
        printf("File does not exist \n");
    }
    printf("Enter the name :  \n");
    scanf("%s",name);
    fprintf(fptr,"Name=%s\n",name);
    printf("Enter the age : \n");
    scanf("%d",&age);
    fprintf(fptr,"Age=%d \n",age);
    printf("Enter the salary : \n");
    scanf("%f",&salary);
    fprintf(fptr,"Salary=%.2f\n",salary);
    fclose(fptr);
    getch();
    return 0;
}
