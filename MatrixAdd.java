import java.util.*;
class MatrixAdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Rows and column of the matrix \n");
int m=sc.nextInt();
int n=sc.nextInt();
int i,j;
int A[][]=new int[m][n];
int B[][]=new int[m][n];
int sum[][]=new int[m][n];
System.out.println("Enter elements to matrix A one by one \n");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
A[i][j]=sc.nextInt();
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
B[i][j]=sc.nextInt();
}
}
System.out.println();
//adding and printing addition of 2 matrices
for(i=0;i<m;i++){
for(j=0;j<n;j++){
sum[i][j]=A[i][j]+B[i][j];
System.out.print(sum[i][j]+" ");
}
System.out.println();
}
}}
