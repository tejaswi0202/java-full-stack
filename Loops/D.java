/*class C
{
public static void main(String [] args)
{
for( int i=1;i<=10;i++)
{
System.out.println("Bright IT Career");
}
}
}
o/p:
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career
Bright IT Career 
2.class C
{
public static void main(String [] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}
o/p:
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

3.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a==b)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
}
}
o/p:
3
4
not equal
5
5
equal
4.class C
{
public static void main(String [] args)
{
int i=1;
do
{
System.out.println(i);
i++;
}while(i<=20);
}
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
5.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
System.out.println("even numbers:");
for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
System.out.println("odd numbers:");
for(int i=1;i<=n;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}
o/p:
enter n:
20
even numbers:
2
4
6
8
10
12
14
16
18
20
odd numbers:
1
3
5
7
9
11
13
15
17
19
6.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter three numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println(a+"is larger");
}
else if(b>a && b>c)
{
System.out.println(b+"is larger");
}
else
{
System.out.println(c+"is larger");
}
}
}
o/p:
enter three numbers:
34
56
78
78is larger

7.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter range:");
int m=sc.nextInt();
int n=sc.nextInt();
System.out.println("even numbers in range from"+m+"to"+n+"is:");
for(int i=m;i<=n;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
o/p:
enter range:
10
100
even numbers in range from10to100is:
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

8.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int m=sc.nextInt();
 int sum=0;
int n=m;
while(m>0)
{
int rem=0;
 rem=rem+m%10;
sum=sum+(rem*rem*rem);
 m=m/10;
}
if(n==sum)
{
System.out.println("Armstrong number");
}
else
{
System.out.println("Not a Armstrong number");
}
}
}
o/p:
enter number:
153
Armstrong number

9.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int m=sc.nextInt();
 int count=0;
for(int i=1;i<=m;i++)
{
if(m%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(m+"is prime number");
}
else
{
System.out.println(m+"is not a prime number");
}
}
}
o/p:
enter number:
31
31is prime number
o/p:2
enter number:
64
64is not a prime number

10.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
int m=sc.nextInt();
 int rev=0;
int n=m;
while(m>0)
{
int rem=0;
 rem=rem+m%10;
rev=rev*10+rem;
 m=m/10;
}
if(rev==n)
{
System.out.println(n+"is palindrome");
}
else
{
System.out.println(n+"is  not a palindrome");
}
}
}
o/p:
enter number:
343
343is palindrome

11.import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice:");
String s=sc.next();
switch(s)
{
case "M":
System.out.println("male");
break;
case "F":
System.out.println("female");
break;
default :
System.out.println("irrelavent choice");
break;
}
}
}
o/p:
D:\java programs>java C
enter your choice:
M
male
o/p:2
enter your choice:
F
female
*/
import java.util.Scanner;
class C
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice:");
int n=sc.nextInt();
int rem;
if(n%2==0)
{
 rem=0;
}
else{
rem=1;
}
switch(rem)
{
case 0:
System.out.println("even");
break;
case 1:
System.out.println("odd");
break;
default :
System.out.println(n+"is not defined");
break;
}
}
}






 


