class Mango
{
public static void main(String[] args)
{
String password="swetha";//it is a explicit reference means it contains a reference variable password which has the assigned value as swetha,
// where the value swetha stored im the location in a constantpool
System.out.println(200);//it is a implicit reference which does not contain any reference variable ,and it directly prints the value,it prints as 200
//but it store the location as password in the constant pool without the address of reference variable
System.out.println("A" + "B");//it prints as AB
String combined=(password +"what are you doing");//here "+" indicates the string concatination 
System.out.println(combined);

int tree=100;
 root=50;
boolean come=(tree==root);//incompatoble type error........int cannot be converted into boolean
System.out.println(come);

int tree=100;
int root=50;
boolean come=(tree==root);//it compares with tree==root then prints a boolean weather it is true or false
System.out.println(come);


}
}