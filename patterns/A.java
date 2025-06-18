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

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine(); 

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
output:
Enter a word: INDIA
I
I N
I N D
I N D I
I N D I A

/*import java.util.Scanner; 
public class A 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:"); 
int a=sc.nextInt();  
System.out.println(" ");  
for(int i=a;i>=1;i--)
{   
for(int j=1;j<=i;j++)
{
if(j== 1||j==i||i==a)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
} 
System.out.println();
}  
}
}
output:
enter n:
5

* * * * *
*     *
*   *
* *
* 

import java.util.Scanner; 
public class A
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int a=sc.nextInt();
System.out.println("");  
for(int i=1;i<=a;i++) {
for(int j=1;j<=a;j++) 
{
if(i==1||j==1||j==a||i==a) 
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}        
System.out.println();
}  
}
}
output:
enter n:
5

* * * * *
*       *
*       *
*       *
* * * * * 

import java.util.Scanner;
 
public class A 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter n:");
int a= sc.nextInt();
System.out.println(""); 
for (int i = 1; i <=a; i++)
{
for (int j = 1; j <=a-i; j++)
{
System.out.print(" ");
}
for (int j = 1; j <= i; j++)
{
if (j == 1 || j == i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}      
for(int i=a-1;i>=1;i--)
{
for(int j=1;j<=a-i;j++)
{
System.out.print(" ");
}
for (int j=1;j<=i;j++)
{
if (j==1||j==i)
{
System.out.print("* ");
}
else
{
System.out.print("  ");
}
}
System.out.println();
}
}
}
output:
enter n:
5

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    * 
import java.util.Scanner;

public class A{ 
public static void main(String args[])
{
int n = 6;
int i, j;
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int a=sc.nextInt();
for (i = 1; i <= n; i++) {
for (j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (j = 1; j <= 2 * i - 1; j++) {
System.out.print("*");
}
System.out.println();
}
for (i = n-1; i >= 1; i--) {
for (j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (j = 1; j <= 2 * i - 1; j++) {
System.out.print("*");
}
System.out.println();
}
}
}
output:
enter n:5
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     * 

import java.util.Scanner;

public class A{ 
public static void main(String args[])
{
int n = 6;
int i, j;
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int a=sc.nextInt();
for (i = 1; i <= n; i++) {
for (j = 1; j <= n - i; j++) {
System.out.print(" ");
}
for (j = 1; j <= 2 * i - 1; j++) {
System.out.print("*");
}
System.out.println();
}
}
}
output:
enter n:5
     *
    ***
   *****
  *******
 *********
***********  

import java.util.Scanner;
public class A{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int n=sc.nextInt();
for(int i=0;i<n;i++) {
for(int j=0;j<n;j++) {
if(i==n/2||j==n/2) {
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}
}
}
output:
enter n:5
    *
    *
* * * * *
    *
    * 
import java.util.Scanner;
public class A {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter n:");
int n=sc.nextInt();
for(int i=0;i<=n; i++) {
for(int j=0;j<(n-i);j++) {
System.out.print(" ");
}
for (int k=0;k<i;k++) {
System.out.print("*");
}
System.out.println(i);
}
}
}
output:
enter n:5
     0
    *1
   **2
  ***3
 ****4
*****5