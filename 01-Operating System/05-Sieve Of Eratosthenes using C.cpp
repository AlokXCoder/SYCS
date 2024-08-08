#include<stdio.h>
int main()
{
int l,i,temp=0,p,t;
printf("Enter the limit:");
scanf("%d",&l);
int nlist[l];
for(i=2;i<=l;i++){
nlist[temp]=i;
temp++;
}
for(i=0;i<temp;i++){
if(nlist[i]!=0){
t=i;
p=nlist[i];
while((t+p)<temp){
t=t+p;
nlist[t]=0;
}
}
}
for(i=0;i<temp;i++){
if(nlist[i]!=0)
printf("%d,",nlist[i]);
}
return 0;
}
