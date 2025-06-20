/*public class Instance
{
static String college="SVIET";
static int students=0;
String studentName;
int Age;
public Instance(String name,int age){
studentName=name;
Age=age;
students++;
}
static void clgname()
{
System.out.println("college name:"+college);
}
static void std()
{
System.out.println("total students:"+students);
}
void clgdetails()
{
System.out.println("student name:"+studentName);
System.out.println("student age:"+Age);
}
void Teenager()
{
if(Age>=13&&Age<=18)
{
System.out.println(studentName+"is a teenager");
}
else{
System.out.println(studentName+"is not a teenager");
}
}
public static void main(String args[]){
clgname();
Instance s1=new Instance("hari",15);
Instance s2=new Instance("ram",19);
s1.std();
s1.Teenager();
s2.std();
s2.Teenager();
std();
}
}
output:
college name:SVIET
total students:2
hariis a teenager
total students:2
ramis not a teenager
total students:2

public class Instance {
int num=10;
String name="Ram";
static void InstaceVariable() {
Instance obj=new Instance();
System.out.println("Number:"+obj.num);
System.out.println("Name:"+obj.name);
}
public static void main(String[] args) {
InstaceVariable();
}
}
output:
Number:10
Name:Ram

public class Instance {
static int count=100;
static String course="Java Programming";
void StaticVariables() {
System.out.println("Count:"+count);
System.out.println("Course:"+course);
}
public static void main(String[] args) {
Instance obj=new Instance();
obj.StaticVariables();
}
}
output:
Count:100
Course:Java Programming

public class Instance {
void greet() {
System.out.println("Hello from an instance method");
}
static void InstanceMethod() {
Instance obj = new Instance();
obj.greet();  
}
public static void main(String[] args) {
InstanceMethod();
}
}
output:
Hello from an instance method

public class Instance {
static void display() {
System.out.println("This is a static method.");
}
void StaticMethod() {
display();
}
public static void main(String[] args) {
Instance obj = new Instance();
obj.StaticMethod();
}
}
output:
This is a static method.

public class Instance{
void greet() {
System.out.println("Hello from an instance method");
}
static void InstanceMethod() {
Instance obj = new Instance();
obj.greet();
}
public static void main(String[] args) {
InstanceMethod();
}
}
output:
Hello from an instance method*/

public class Instance {
static void staticMethod() {
System.out.println("This is a static method.");
}
void instanceMethod() {
System.out.println("This is an instance method.");
}
public static void main(String[] args) {
staticMethod();
Instance obj = new Instance();
obj.instanceMethod();
}
}
output:
C:\Users\kalyani\Desktop\509>java Instance
This is a static method.
This is an instance method.