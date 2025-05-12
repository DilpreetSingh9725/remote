package fundamentaljava;

import java.util.Scanner;

public class FUNDAMENTALJAVA {
public static void main(String[] args) {
       
       Scanner in = new Scanner(System.in);
String word = in.next(); //hello or welcome any word nextLine() jhsf kaf kjahsdfb
// each char from word , store in array
//hello - h e
char[] reverse = new char[word.length()]; //hello = 5
for(int i=0;i<word.length();i++) // h e 5<5
{
reverse[i]= word.charAt(i); // hello - h []
}
//step 3 read back last value
for(int i=reverse.length-1;i>=0;i--) // o
{
System.out.print(reverse[i]);
}

INFO s1=new INFO();
s1.setName("dilpreet");
s1.setId(1);
    INFO s2=new INFO();
    s2.setId(2);
    s2.setName("jagga");
    INFO [] list=new INFO[2]; 
list[0]=s1;
list[1]=s2;

}
}


   
