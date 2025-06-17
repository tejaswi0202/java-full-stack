/*public class A
{
public static void main(String[] args){
for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print(" ");
}
System.out.println(" ");
}
}
}
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * * */


/* public class A
{
public static void main(String[] args){

for(int i=0;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print(j );
}
System.out.println(" ");
}
}
}
012345
012345
012345
012345
012345
012345*/

/* import java.util.Scanner;
public class A
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(i+" " );
}
System.out.println(" ");
}
}
}
output:
5
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5 */


/* import java.util.Scanner;
public class A
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(x+" " );
x++;

if(x>9)

x=1;
}
System.out.println(" ");
}
}
}
output:
enter number:
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7 */

/* import java.util.Scanner;
public class A
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(x+" " );
x=x+2;
}
System.out.println(" ");
}
}
}
output:
enter number:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49 */

/*import java.util.Scanner;
public class A
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();

for(int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
System.out.print(j%2==0?"0":"1");

}
System.out.println(" ");
}
}
}
output:
enter number:
5
10101
10101
10101
10101
10101 

import java.util.Scanner;
public class A
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {


System.out.print("* ");

}
System.out.println();
}
}
}
output:
enter number:
5
    *
   * *
  * * *
 * * * *
* * * * * 

import java.util.Scanner;
public class A
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {


System.out.print(2*j+"  ");

}
System.out.println();
}
}
}
output:
enter number:
5
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10 */

import java.util.Scanner;
public class A
{
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<=n;i++)
{
for(int j=n-i;j>1;j--)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {


System.out.print(x+"* ");
x++;
}
System.out.println();
}
}
}


     