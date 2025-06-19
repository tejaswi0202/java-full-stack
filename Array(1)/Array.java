/*1.import java.util.Scanner;
public class Arraysum{
public static int add(int[] array)
{
int sum=0;
for(int b:array){
sum=sum+b;
}
return sum;
}
public static void main(String[] args){
int[] arr={1,2,3,4,5};
int result=add(arr);
System.out.println("the sum of array is:"+result);
}
}
output:
the sum of array is:15

2.import java.util.Scanner;
public class Arrayavg{
public static double avg(int[] array)
{
int sum=0;
double avg=0.0;
for(int b:array){
sum=sum+b;
avg=sum/b;
}

return avg;

}
public static void main(String[] args){
int[] arr={1,2,3,4,5};

System.out.println("the avg of array is:"+avg(arr));

}
}
output:the avg of array is:3.0 


3.public class Arrayindex
{
public static int findindex(int[] arr,int target){
for(int i=0;i<arr.length;i++){
if(arr[i]==target){
return i;
}
}
return -1;
}
public static void main(String[] args){
int[] num={1,2,3,4,5};
int target=3;
int index=findindex(num,target);
if(index!=-1)
{
System.out.println("element found at index:"+index);
}else
{
System.out.println("element not found");
}
}
}
output:
element found at index:2 

4.public class Array
{
public static boolean Value(int[] array, int target) {
for(int i=0;i< array.length;i++) {
if(array[i]==target) {
return true; 
}
}
return false;
}
public static void main(String[] args) {
int[] numbers={1,2,3,4,5};
int element=5;
if (Value(numbers,element)) {
System.out.println(element+"is present in the array.");
}
else {
System.out.println(element+"is not present in the array.");
}
}
}
output:
5is present in the array

5.public class Array
{
public static void main(String[] args)
{
int original[]={1,2,3,4,5};
int copy[]=new int[original.length];
for(int i=0;i<original.length;i++)
{
copy[i]=original[i];
}
System.out.println("original array:");
for(int i=0;i<original.length;i++)
{
System.out.println(original[i]+"");
}
System.out.println("copied array:");
for(int i=0;i<copy.length;i++)
{
System.out.println(copy[i]+" ");
}
}
}
o/p:
original array:
1
2
3
4
5
copied array:
1
2
3
4
5


6.import java.util.Scanner;

public class Array{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = scanner.nextInt();
int[] original=new int[size+1];
System.out.println("Enter"+size +"elements:");
for (int i=0;i<size;i++) {
original[i] = scanner.nextInt();
}
System.out.print("Enter the element to insert: ");
int element = scanner.nextInt();
System.out.print("Enter the position (0 to " + size + "): ");
int position = scanner.nextInt();
if (position < 0 || position > size) {
System.out.println("Invalid position!");
} else {
for (int i = size; i > position; i--) {
original[i] = original[i - 1];
}
original[position] = element;
System.out.println("Array after insertion:");
for (int i = 0; i <= size; i++) {
System.out.print(original[i] + " ");
}
}
}
}
output:
Enter the size of the array: 5
Enter5elements:
1
2
3
4
5
Enter the element to insert: 6
Enter the position (0 to 5): 5
Array after insertion:
1 2 3 4 5 6


7.public class Array
{
public static void main(String[] args){
int []numbers={1,2,3,46,5,4,7,8};
int even=0;
int odd=0;
for(int b:numbers)
{
if(b%2==0)
{
even++;
}
else
{
odd++;
}
}
System.out.println("even numbers are:"+even);
System.out.println("even numbers are:"+even);
}
}
output:
even numbers are:4
even numbers are:4

8.public class Array
{
public static void main(String[] args){
int[] numbers={1,4,2,3,5};
int start=0;
int end=numbers.length-1;
while(start<end)
{
int temp=numbers[start];
numbers[start]=numbers[end];
numbers[end]=temp;
start++;
end--;
}
for(int b:numbers)
{
System.out.println(b+" ");
}
}
}
output:
5
3
2
4
1



9.public class Array
{
public static void main(String[] args){
int []arr={2,1,5,4,6};
int min=arr[0];
int max=arr[0];
for(int i=1;i<arr.length;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
if(arr[i]>max)
{
max=arr[i];
}
}
System.out.println("minimum element:"+min);
System.out.println("maximum element:"+max);
}
}
output:
minimum element:1
maximum element:6


10.public class Array
{
public static void main(String[] args){
int[] array1={1,2,3,4,5};
int[] array2={4,5,6,7,8};
System.out.println("Common values between two array:");
for(int i=0;i<array1.length;i++)
{
for(int j=0;j<array2.length;j++)
{
if(array1[i]==array2[j]){
System.out.println(array1[i]);
break;
}
}
}
}
}
common values between two array:
4
5

11.public class Array{
public static void Array(int[] array) {
System.out.println("Duplicate elements are:");
boolean hasDuplicates=false;
for(int i=0;i<array.length; i++) {
for(int j=i+1;j<array.length;j++) {
if(array[i]==array[j]) {
System.out.println(array[i]);
hasDuplicates=true;
break; 
}
}
}
if(!hasDuplicates) {
System.out.println("No duplicate elements found.");
}
}
public static void main(String[] args) {
int[] numbers={3,5,2,7,3,8,2};
Array(numbers);
}
}
output:
Duplicate elements are:
3
2

12.public class Array{
public static int[] Array(int[] array) {
int n = array.length;
int[] temp = new int[n];
int newIndex = 0;
for (int i = 0; i < n; i++) {
boolean isDuplicate = false;
for(int j=0;j<newIndex;j++) {
if(array[i]==temp[j]) {
isDuplicate=true;
break;
}
}
if(!isDuplicate) {
temp[newIndex]=array[i];
newIndex++;
}
}
int[] result=new int[newIndex];
for(int i=0;i<newIndex; i++) {
result[i]=temp[i];
}
return result;
}
public static void main(String[] args) {
int[] numbers={4,5,2,4,3,5,1,2};
int[] uniqueNumbers=Array(numbers);
System.out.println("Array after remove duplicates:");
for (int num : uniqueNumbers) {
System.out.print(num + " ");
}
}
}

output:
rray after remove duplicates:
4 5 2 3 1

13.public class Array{
public static int Array(int[] array) {
int largest=Integer.MIN_VALUE;
int secondLargest=Integer.MIN_VALUE;
for (int num : array) {
if(num>largest) {
secondLargest=largest;
largest=num;
} else
if(num>secondLargest&&num!=largest)
{
secondLargest = num;
}
}

return secondLargest;
}
public static void main(String[] args) {
int[] numbers={5,3,9,1,6,9};
int secondLargest=Array(numbers);
if(secondLargest==Integer.MIN_VALUE)
{
System.out.println("No second largest number found.");
} else
{
System.out.println("Second largest number is:"+secondLargest);
}
}
}
output:
Second largest number is:6 

16.public class Array{
public static int Array(int[] array) {
int largest=array[0];
int smallest=array[0];
for(int i=1;i<array.length;i++) {
if(array[i]>largest) {
largest=array[i];
}
if(array[i]<smallest) {
smallest=array[i];
}
}
return largest-smallest;
}
public static void main(String[] args) {
int[] numbers={10,4,2,8,15,6};
int difference=Array(numbers);
System.out.println("Difference between largest and smallest: " + difference);
}
}
output:
Difference between largest and smallest: 13

17.public class Array{
public static boolean Array(int[] array,int first,int second) {
boolean foundFirst=false;
boolean foundSecond=false;
for (int num : array) {
if(num==first) {
foundFirst=true;
}
if(num==second) {
foundSecond=true;
}
if (foundFirst&&foundSecond) {
return true;
}
}
return false;
}
public static void main(String[] args) {
int[] numbers={5,12,7,9,23,8};
boolean result=Array(numbers, 12, 23);
if(result) {
System.out.println("The array contains both 12 and 23.");
} else 
{
System.out.println("The array does NOT contain both 12 and 23.");
}
}
}
output:
The array contains both 12 and 23.

public class Array{
public static int[] Array(int[] array) {
int n=array.length;
int[] temp=new int[n];
int newIndex=0;
for(int i=0;i<n;i++) {
boolean isDuplicate=false;
for(int j=0;j<newIndex;j++) {
if(array[i]==temp[j]) {
isDuplicate=true;
break;
}
}
if(!isDuplicate) {
temp[newIndex]=array[i];
newIndex++;
}
}
int[] result=new int[newIndex];
for(int i=0;i<newIndex;i++) {
result[i]=temp[i];
}
return result;
}
public static void main(String[] args) {
int[] numbers={4,2,4,5,2,3,1};
int[] uniqueNumbers=Array(numbers);
System.out.println("Array after removing duplicates:");
for(int num:uniqueNumbers) {
System.out.print(num+" ");
}
}
}
output:
Array after removing duplicates:
4 2 5 3 1*/

public class Array{
public static int Array(int[] arr) {
int expectedSum=0;
for(int i=1;i<=100;i++) {
expectedSum+=i;
}
int actualSum = 0;
for (int i=0;i<arr.length;i++) {
actualSum+=arr[i];
}
return expectedSum-actualSum;
}
public static void main(String[] args) {
int[] arr=new int[99];
int index=0;
for(int i=1;i<=100;i++) {
if(i!=45) {
arr[index]=i;
index++;
}
}
int missing=Array(arr);
System.out.println("Missing number is:"+missing);
}
}
output:
Missing number is:45



